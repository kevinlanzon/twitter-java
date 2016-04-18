package Lanzon;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    String username = "kevin";
    User user = new User(username);

    @Test
    public void initialize() {
        assertEquals(username, user.name);
    }

    @Test
    public void userCanAddPosts() {
        user.addPost("This is my first post!");
        user.addPost("This is my second post!");
        assertEquals(2, user.posts.size());
    }

}