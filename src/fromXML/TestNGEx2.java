package fromXML;

import org.testng.annotations.Test;

public class TestNGEx2 {
    @Test
    public void open() {
        System.out.println("open method");
    }

    @Test
    public void login() {
        System.out.println("login method");
    }

    @Test
    public void close() {
        System.out.println("Close the connection");
    }
}
