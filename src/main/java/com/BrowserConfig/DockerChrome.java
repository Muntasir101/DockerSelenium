package com.BrowserConfig;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerChrome {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap=DesiredCapabilities.chrome();
        URL url=new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver=new RemoteWebDriver(url,cap);

        driver.get("https://google.com");

        System.out.println("Title is: "+driver.getTitle());

        driver.quit();

    }
}
