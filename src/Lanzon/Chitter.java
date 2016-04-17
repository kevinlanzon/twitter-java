package Lanzon;

import java.util.Scanner;

public class Chitter {
    public User user;

    public static void main(String[] args) {
        Chitter chitter = new Chitter();
        chitter.welcomeMessage();
        chitter.inputUsername();
    }

    public void welcomeMessage() {
        System.out.print("Welcome to Chitter!\n");

    }

    public void inputUsername() {
        System.out.print("Please enter your username: ");
        String username = readInput();
        user = new User(username);
        System.out.print("Hello " + "@" + username + "!\n");
    }

    public String readInput() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String output = input.next();
        return output;
    }

}
