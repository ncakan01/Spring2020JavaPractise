package day47_Abstraction;

public class driverObject {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("httpd://www.google.com");
        driver.quit();
    }
}
