package com.example.demo;
import lombok.Getter;

@Getter
public class Post {
    private Long id;
    private String title;
    private String contents;
    private String authorName;
    public Post(long id, String title, String contents, String authorName){
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.authorName = authorName;
    }
    Post(){
    }

}
