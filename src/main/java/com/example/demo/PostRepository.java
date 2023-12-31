package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepository {
    List<Post> posts;
    PostRepository(){
        posts= new ArrayList<>();
        posts.add(new Post(1, "hello1", "hello1 is ...", "seonguk1"));
        posts.add(new Post(2, "hello2", "hello2 is ...", "seonguk2"));
        posts.add(new Post(3, "hello3", "hello3 is ...", "seonguk3"));
        posts.add(new Post(4, "hello4", "hello4 is ...", "seonguk4"));
    }
    List<Post> findAll(){
        return posts;
    }
    Optional<Post> findById(int id){
        Post post = null;
        for(Post post_temp : posts){
            if(post_temp.getId()==id){
                post = post_temp;
                break;
            }
        }
        return Optional.ofNullable(post);
    }
}
