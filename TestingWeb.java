package com.lab4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestingWeb {
    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C://Users//Sony//Desktop//chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.navigate().to("http://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("formy-project.herokuapp.com/form"))
            System.out.println("MATCH");
        else
            System.out.println(title);

        String firstname ="Menna";
        firstname = driver.findElement(By.cssSelector("#first-name")).getText();
        System.out.println(firstname);

        String lastname ="Ashraf";
        lastname = driver.findElement(By.cssSelector("#last-name")).getText();
        System.out.println(lastname);

        String job ="Student";
        job = driver.findElement(By.cssSelector("#Job-title")).getText();
        System.out.println(job);


        // Radio button
        WebElement highschool = driver.findElement(By.id("radio-button-1"));
        highschool.click();
        Thread.sleep(2000);

        WebElement College = driver.findElement(By.id("radio-button-2"));
        College.click();

        WebElement gradschool = driver.findElement(By.id("radio-button-3"));
        gradschool.click();


    }

}
