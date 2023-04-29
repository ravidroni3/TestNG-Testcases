package sequence;

import org.testng.annotations.*;

public class Test1 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite method executed");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest executed");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass executed");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod executed");
    }
    @Test
    public void test(){
        System.out.println("Test method executed");
    }
    @AfterMethod()
    public void afterMethod(){
        System.out.println("AfterMethod executed");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass executed ");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest executed");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite executed");
    }
}
