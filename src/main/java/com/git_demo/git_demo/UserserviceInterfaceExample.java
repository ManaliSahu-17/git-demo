package com.git_demo.git_demo;
import java.util.*;

interface UserService {
    
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    
    Optional<String> getUser(String name);
}

class UserServicechild implements UserService {
    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }

    
    public String generateWelcomeMessage(String name) {
        return getUser(name).map(user -> "Welcome, " + user + "!").orElse(getWelcomeMessage());
    }
}

public class UserserviceInterfaceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		UserServicechild userServicechild = new UserServicechild();
        System.out.println(userServicechild.generateWelcomeMessage(name)); 
        System.out.println(userServicechild.generateWelcomeMessage(null));  
		

	}

}
