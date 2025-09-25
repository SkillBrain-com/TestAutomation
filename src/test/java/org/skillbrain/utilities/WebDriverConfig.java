package org.skillbrain.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.HashMap;
import java.util.Map;

public class WebDriverConfig {

    private WebDriver driver;
//    public ChromeOptions getChromeOptions() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--disable-popup-blocking");
////        options.addArguments("--headless");
//        return options;
//    }


    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("autofill.profile_enabled", false);
        prefs.put("autofill.credit_card_enabled", false);
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.default_content_setting_values.notifications", 2);

        options.setExperimentalOption("prefs", prefs);

        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
//        options.addArguments("--headless");

        return options;
    }

    public WebDriver getDriver() {
        Properties properties = new Properties();
        String fileLocation = System.getProperty("user.dir") + "/src/test/resources/config.properties";
        try {
            properties.load(Files.newInputStream(Paths.get(fileLocation)));
            String browser = properties.getProperty("browser");

            if (driver == null) {
                switch (browser.toUpperCase()) {
                    case "CHROME":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver(getChromeOptions());
                        break;
                    case "FIREFOX":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        break;
                    default:
                        throw new RuntimeException("INVALID BROWSER!");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file: " + fileLocation, e);
        }
        return driver;
    }

}
