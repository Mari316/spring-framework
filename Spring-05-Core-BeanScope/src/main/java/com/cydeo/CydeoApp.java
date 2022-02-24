package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");
        // creating  container
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);

        // will print same memory allocation
        System.out.println("cs1 = " + cs1);
        System.out.println("cs2 = " + cs2);
        System.out.println(cs1 == cs2 );// true Singleton design  - default Scope

        // If we need different obj to use we need Prototype ->
        // in CommentService add @Scope("prototype") // allow us create different beans in the container
        // System.out.println(cs1 == cs2 );// false Prototype design
        // @Scope(BeanDefinition.SCOPE_PROTOTYPE) // another way to declare prototype
        // SINGLETON ALWAYS BY DEFAULT!!!


    }

}
