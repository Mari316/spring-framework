package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // when we have more than 1 implementations to avoid confusion of multiple beans (Error - which bean to use?)
public class EmailCommandNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification comment : " + comment.getText());
    }
}
