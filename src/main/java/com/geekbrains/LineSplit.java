public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.shutterstock.com/ru/");
        Thread.sleep(10000);

        driver.findElement(By.id("mui-84156")) click();
        driver.findElement(By.id("mui-84156")) ("Koт");

        driver.quit();

        private static void click () {
        }
    }
   
}
