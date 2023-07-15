package banktest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	ChromeDriver wd=null;
    static final String LOGIN_URL="http://localhost:4200";
    private static final String LOGIN_EMAIL = "email";
    private static final String LOGIN_PWD = "password";
    @Before
    public void setUp() {
   
    	System.setProperty("webdriver.chrome.driver","C:\\WeDevZone\\Dev\\Tools\\seleniumTest\\chromedriver.exe");
    	wd  =   new ChromeDriver();
        wd.manage().window().maximize();
    }
   
    @Test
    public void contextLoads() {
        wd.get(LOGIN_URL);
        wd.findElement(By.name(LOGIN_EMAIL)).sendKeys("nader.benkhalifa@gmail.com");
        wd.findElement(By.name(LOGIN_PWD)).sendKeys("nader1111");
        wd.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div[5]/button")).click();
      
      
     
       
    }





}
