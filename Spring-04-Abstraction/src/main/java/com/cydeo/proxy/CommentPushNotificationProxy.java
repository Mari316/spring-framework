package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Push") //Qualifier -  allows us to use different implementations with diff services, Qualifier has highest  priority
// Here we can add custom name if its too long (instead of commentPushNotificationProxy
// in "Comment service" class. @Primary (default) will work only for 1 service, @Qualifier can work for multiple )
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for: " + comment.getText());

    }
}
