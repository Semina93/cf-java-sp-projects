package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
//import static java.lang.Math.abs;

public class UserMain {
    public static void main(String[] args) {
        User user = new User();
        User anna = new User(2, "Anna", "G.", "Anna", "12345", false);

        user.setId(1);
        user.setFirstname("George");
        user.setLastname("D.");
        user.setUsername("George D.");
        user.setPassword("12345");
        user.setActive(true);

        System.out.println("User id: " + user.getId());
        System.out.println("Firstname: " + user.getFirstname());
        System.out.println("Lastname: " + user.getLastname());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Active: " + user.isActive() );

        System.out.println("Anna id: " + user.getId());
        System.out.println("Firstname: " + anna.getFirstname());
        System.out.println("Lastname: " + anna.getLastname());
        System.out.println("Username: " + anna.getUsername());
        System.out.println("Password: " + anna.getPassword());
        System.out.println("Active: " + anna.isActive() );

//        int x = Math.abs(-3);
    }
}
