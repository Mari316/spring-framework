package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;// we use model here
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

        //need to publish comments, Spring give me one commentService method
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);// (comment) - created above

    }

}
