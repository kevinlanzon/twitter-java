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
        System.out.println("*** Welcome to Chitter! ***\n");

    }

    public void inputUsername() {
        System.out.println("Please enter your username: ");
        String username = readInput();
        user = new User(username);
        System.out.println("Hello " + "@" + username + "!\n");
        menu();
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

}
