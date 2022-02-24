package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // Class itself as dependency
public class CommentService {
    // we will never change this dependency
    private final CommentRepository commentRepository; // Interface defines implementations here
    private final CommentNotificationProxy commentNotificationProxy; //Interface
// constructor is necessary to initialize our dependency
    @Autowired // its dependency injection, we wire everything in this class using constructor
    public CommentService(CommentRepository commentRepository,@Qualifier("Push") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    //@QUALIFIER  - use when we have more than 1 bean and Spring will determine which one to execute

    public void publishComment (Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }
}
