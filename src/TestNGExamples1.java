import org.testng.annotations.Test;

public class TestNGExamples1 {
    @Test(priority = 1)
    public void setup(){
        System.out.println("TestNG method executed");
    }
    @Test(priority = 2)
    public void login(){
        System.out.println("Login method executed");
    }
    @Test(priority=3)
    public void close(){
        System.out.println("Close the connection");
    }
}
