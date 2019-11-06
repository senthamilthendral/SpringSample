package com.thendral.springfeatures;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.thendral.springfeatures.database.User;
import com.thendral.springfeatures.database.UserController;
import com.thendral.springfeatures.database.repository.UserRepository;

@SpringBootApplication
public class SpringfeaturesApplication {

	@Resource
	UserController userController;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringfeaturesApplication.class, args);
		System.out.println("Spring Feature Testing");
	}

	 @Bean
	    CommandLineRunner init(UserRepository domainRepository) {

	        return args -> {

//	            User obj = domainRepository.find("Thendral");
//	            System.out.println(obj);

	        	List<User> userList = new ArrayList<>();
	        	User user1 = new User();
	        	user1.setUserName("Pappa");
	        	user1.setDateObj(new Date());
	        	user1.setUserSettings(new HashMap<>());
	            User obj2 = (User) userController.addNewUsers(user1);
	            System.out.println(obj2.toString());
	        };

	    }
}
