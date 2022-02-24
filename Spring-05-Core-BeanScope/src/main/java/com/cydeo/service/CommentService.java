package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Scope("prototype") // allow us create different beans in the container
@Scope(BeanDefinition.SCOPE_PROTOTYPE) // another way to declare prototype
@Component  // Class itself as dependency
public class CommentService {
    // we will never change this dependency
    private final CommentRepository commentRepository; // Interface defines implementations here
    private final CommentNotificationProxy commentNotificationProxy; //Interface
// constructor is necessary to initialize our dependency
    @Autowired // its dependency injection, we wire everything in this class using constructor
    public CommentService(CommentRepository commentRepository, @Qualifier("Push") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Hello"); // add inside constructor
    }

    //@QUALIFIER  - use when we have more than 1 bean and Spring will determine which one to execute

    public void publishComment (Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }
}
