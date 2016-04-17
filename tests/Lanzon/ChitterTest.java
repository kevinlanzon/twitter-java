package Lanzon;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ChitterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
    String[] args = {};
    Chitter chitter = new Chitter();

    @Test
    public void welcomeMessage() {
        chitter.main(args);
        assertEquals("*** Welcome to Chitter! ***\n", outContent.toString());
    }

    @Test
    public void inputUsername() {
        chitter.main(args);
        ByteArrayInputStream input = new ByteArrayInputStream("kevin".getBytes());
        System.setIn(input);
        assertEquals("Hello @kevin!\n", outContent.toString());

    }

}