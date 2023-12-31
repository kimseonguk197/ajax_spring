package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PostService {

    @Autowired PostRepository postRepository;
    // 전체조회
    public List<Post> findAll(){
        List<Post> posts = postRepository.findAll();
        return posts;
    }

    // 한건 조회
    public Post findId(int id){
        Post post = postRepository.findById(id).orElseThrow(NoSuchElementException::new);
        return post;
    }

}
