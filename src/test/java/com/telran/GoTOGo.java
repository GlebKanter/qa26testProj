package com.telran;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoTOGo {

    WebDriver wd;

    @Test
    public void gotog(){
        wd = new ChromeDriver();
        wd.get("https:/google.com");
        wd.quit(); 
    }
}
