package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    PostService postService;
    @GetMapping("posts")
    @ResponseBody
    public List<Post> getPosts(){
        List<Post> posts = postService.findAll();
        return posts;
    }
    @GetMapping("post/{id}")
    @ResponseBody
    public Post getPost(@PathVariable int id){
        Post post = postService.findId(id);
        return post;
    }

    @GetMapping("post/thymeleaf/{id}")
    public String getPostThymeleaf(@PathVariable int id, Model model){
        Post post = postService.findId(id);
        model.addAttribute("post", post);
        return "post-detail";
    }

    @GetMapping("posts/thymeleaf")
    public String getPostsThymeleaf(Model model){
        List<Post> posts = postService.findAll();
        model.addAttribute("postList", posts);
        return "post-list";
    }
}
