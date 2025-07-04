package com.group36.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group36.config.JwtProvider;
import com.group36.models.User;
import com.group36.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User registerUser(User user) {

		User newUser = new User();

		newUser.setEmail(user.getEmail());
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setPassword(user.getPassword());
		newUser.setId(user.getId());

		User savedUser = userRepository.save(newUser);

		return savedUser;
	}

	@Override
	public User findUserById(Integer userId) throws Exception {
		Optional<User> user = userRepository.findById(userId);

		if (user.isPresent()) {
			return user.get();
		}

		throw new Exception("user not exist with userid " + userId);
	}

	@Override
	public User findUserByEmail(String email) {
		User user = userRepository.findByEmail(email);
		return user;
	}

	@Override
	public User followUser(Integer reqUserId, Integer userId2) throws Exception {

		User reqUser = findUserById(reqUserId);
		User user2 = findUserById(userId2);

		user2.getFollowers().add(reqUser.getId());
		reqUser.getFollowings().add(user2.getId());

		userRepository.save(reqUser);
		userRepository.save(user2);

		return reqUser;
	}

	@Override
	public User updateUser(User user,Integer userId) throws Exception {
		Optional<User> user1 = userRepository.findById(userId);

		if (user1.isEmpty()) {
			throw new Exception("user not exist with id " + userId);
		}

		User oldUser = user1.get();

		if (user.getFirstName() != null) {
			oldUser.setFirstName(user.getFirstName());
		}
		if (user.getLastName() != null) {
			oldUser.setLastName(user.getLastName());
		}
		if (user.getEmail() != null) {
			oldUser.setEmail(user.getEmail());
		}

		User updateUser = userRepository.save(oldUser);

		return updateUser;
	}

	@Override
	public List<User> searchUser(String query) {
		
		return userRepository.searchUser(query);
	}

	@Override
	public User findUserByJwt(String jwt) {

		String email= JwtProvider.getEmailFromJwtToken(jwt);
		User user=userRepository.findByEmail(email);
		return user;
	}

}
