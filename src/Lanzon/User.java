package Lanzon;

import java.util.ArrayList;

public class User {
    String name;
    ArrayList posts = new ArrayList();

    public User(String username) {
        name = username;
    }

    public void addPost(String post) {
        posts.add(post);
    }

}
