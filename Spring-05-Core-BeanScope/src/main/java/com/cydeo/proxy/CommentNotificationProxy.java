package com.cydeo.proxy;

import com.cydeo.model.Comment;

// We cant create object from Interface so NO annotations here
public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
