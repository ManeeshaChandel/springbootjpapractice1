package com.onlyjavatech.springbootproject;

import com.onlyjavatech.springbootproject.controller.MainController;
import com.onlyjavatech.springbootproject.jpa.dao.UserRepository;
import com.onlyjavatech.springbootproject.jpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class SpringbootprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootprojectApplication.class,args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user1 = new User();
//		user1.setName("Durgesh Kumar Tiwari");
//		user1.setCity("Delhi");
//		user1.setStatus("I am a java programmer");
//
//
//		User user2= new User();
//		user2.setName("Ankit tiwari");
//		user2.setCity("Haryana");
//		user2.setStatus("I am a python programmer");
//
//		//saving single user
//		//User user1 = userRepository.save(user);
//
//		List<User> users= List.of(user1,user2);
//		Iterable<User> result=userRepository.saveAll(users);
//		result.forEach(user->{
//			System.out.println(user);
//		});

//		//update the user of id 1
//		Optional<User> optional=userRepository.findById(1);
//		User user=optional.get();
//		user.setName("Durga");
//		User result = userRepository.save(user);
//		System.out.println(result);

		//
//		Iterable<User> itr= userRepository.findAll();
//		Iterator<User> iterator=itr.iterator();
//
//		while(iterator.hasNext()){
//			User user=iterator.next();
//			System.out.println(user);
//		}
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User user) {
//				System.out.println(user);
//			}
//		});

//		itr.forEach(user -> {System.out.println(user);});
		//this lambda function //it came in 1.8 version
		//The Iterator interface is a part of the Java Collections Framework
		//
		//delete elements
//		userRepository.deleteById(1);
//		System.out.println("deleted");


		//delete all
//		Iterable<User> allUsers= userRepository.findAll();
//		allUsers.forEach(user -> {System.out.println(user);});
//		userRepository.deleteAll(allUsers);

		// //Derived Query Methods/Custom Finder Methods
//		List<User> users= userRepository.findByNameAndCity("Durgesh","Kanpur");
//		users.forEach(e -> {System.out.println(e);});

		List<User> allUsers= userRepository.getAllUser();
		allUsers.forEach(e -> {System.out.println(e);});

		System.out.println("______________________________");

		List<User> userByNameAndCity= userRepository.getUserByName("Kunal","Delhi");
		userByNameAndCity.forEach(e -> {System.out.println(e);});

		System.out.println("______________________________");

		userRepository.getUsers().forEach(e -> {System.out.println(e);});


	}
}
