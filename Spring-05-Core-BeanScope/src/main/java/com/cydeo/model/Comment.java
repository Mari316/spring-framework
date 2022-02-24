package com.cydeo.model;

import lombok.Data;

// We dont annotate Pojo's
@Data  // <- give us getters and setters
public class Comment {
    private String author;
    private String text;
}
