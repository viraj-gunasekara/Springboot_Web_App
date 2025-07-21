package com.group36.models;

import java.util.ArrayList;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String firstName;
	private String lastName;

	private String email;
	private String password;
	
	private String userImage;
	private String userBanner;
	private String bio;

	private List<Integer> followers = new ArrayList<>();
	private List<Integer> followings = new ArrayList<>();
	
	@JsonIgnore
	@ManyToMany
	private List<Post> savedPost=new ArrayList<>();
			
			
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String firstName, String lastName, String email, String password, String userImage,
			String userBanner, String bio, List<Integer> followers, List<Integer> followings, List<Post> savedPost) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userImage = userImage;
		this.userBanner = userBanner;
		this.bio = bio;
		this.followers = followers;
		this.followings = followings;
		this.savedPost = savedPost;
	}


	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getUserBanner() {
		return userBanner;
	}

	public void setUserBanner(String userBanner) {
		this.userBanner = userBanner;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Integer> getFollowers() {
		return followers;
	}


	public void setFollowers(List<Integer> followers) {
		this.followers = followers;
	}


	public List<Integer> getFollowings() {
		return followings;
	}


	public void setFollowings(List<Integer> followings) {
		this.followings = followings;
	}


	public List<Post> getSavedPost() {
		return savedPost;
	}


	public void setSavedPost(List<Post> savedPost) {
		this.savedPost = savedPost;
	}




}
