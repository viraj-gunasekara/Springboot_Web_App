package com.group36.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group36.models.Post;
import com.group36.models.User;
import com.group36.repository.PostRepository;
import com.group36.repository.UserRepository;


@Service
public class PostServiceImplementation implements PostService{
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;

	@Override
	public Post createNewPost(Post post, Integer userId) throws Exception {

		User user=userService.findUserById(userId);
		
		Post newPost=new Post();
		newPost.setCaption(post.getCaption());
		newPost.setImage(post.getImage());
		newPost.setCreatedAt(LocalDateTime.now());
		newPost.setVideo(post.getVideo());
		newPost.setUser(user);
		
		return postRepository.save(newPost);
		}

	@Override
	public String deletePost(Integer postId, Integer userId) throws Exception {
		
		Post post=findPostById(postId);
		User user=userService.findUserById(userId);
		
		if (post.getUser().getId()!=user.getId()) {
			throw new Exception("you can't delete another users post");
		}
		
		return "post deleted successfully";
	}

	@Override
	public List<Post> findPostByUserId(Integer userId) {
	
		return postRepository.findPostByUserId(userId);
	}

	@Override
	public Post findPostById(Integer postId) throws Exception {
		
		//Post opt
		Optional<Post> opt=postRepository.findById(postId);
		
		if (opt.isEmpty()) {
			throw new Exception("post not found with id "+postId);
		}
		
		return opt.get();
	}

	@Override
	public List<Post> findAllPost() {
		
		return postRepository.findAll();
	}

	@Override
	public Post savedPost(Integer postId, Integer userId) throws Exception {
		Post post=findPostById(postId);
		User user=userService.findUserById(userId);
		
		if (user.getSavedPost().contains(post)) {
			user.getSavedPost().remove(post);
			
		} else {
			user.getSavedPost().add(post);
		}
		userRepository.save(user);
		
		return post;
	}

	@Override
	public Post likePost(Integer postId, Integer userId) throws Exception {

		Post post=findPostById(postId);
		User user=userService.findUserById(userId);
		
		if (post.getLiked().contains(user)) {
			post.getLiked().remove(user);
			
		} else {
			post.getLiked().add(user);
		}
				
		return postRepository.save(post);
	}

}
