package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // when we have more than 1 implementations
public class EmailCommandNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification comment : " + comment.getText());
    }
}
