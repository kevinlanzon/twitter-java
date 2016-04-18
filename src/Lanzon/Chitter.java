package Lanzon;

import java.util.Scanner;

public class Chitter {
    public User user;
    public static boolean quit = false;

    public static void main(String[] args) {
        Chitter chitter = new Chitter();
        chitter.welcomeMessage();
        chitter.inputUsername();
        if (!quit) {
            chitter.menu();
            chitter.userChoice();
        }
    }

    public void welcomeMessage() {
        System.out.println("*** Welcome to Chitter! ***\n");

    }

    public void inputUsername() {
        System.out.println("Please enter your username: ");
        String username = readInput();
        user = new User(username);
        System.out.println("Hello " + "@" + username + "!\n");
    }

    public String readInput() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String output = input.next();
        return output;
    }

    public void menu() {
        System.out.println("*** Main Menu ***\n");
        System.out.print("Please choose: \n");
        System.out.print("1. Create a post\n");
        System.out.print("2. View your posts\n");
        System.out.print("3. View another user's posts\n");
        System.out.print("4. Quit\n");
    }

    public void userChoice() {
        String input = readInput();
        if(input.equals("1")) {
            createPost();
        }
        else if (input.equals("2")) {
            viewPosts();
        }
        else if(input.equals("4")) {
            quit = true;
            System.out.println("Goodbye!");
        }
        else {
            System.out.print("That is not a valid option, please try again: ");
            userChoice();
        }
    }

    public void createPost() {
        System.out.print("What's on your mind? ");
        String post = readInput();
        user.addPost(post);
        viewPosts();
    }

    public void viewPosts() {
        for (int i = 0; i < user.posts.size(); i++) {
            System.out.print(user.posts.get(i));
        }
    }

}