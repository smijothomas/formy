package Step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	WebDriver driver;
	
	@Given("the user is on the Facebook login page")
	public void the_user_is_on_the_facebook_login_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\smijo\\OneDrive\\Desktop\\automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.facebook.com/login");
	    driver.manage().window().maximize();
	}

	@When("the user enters invalid username as email")
	public void the_user_enters_invalid_username_as_email() {
	    WebElement username = driver.findElement(By.className(""));
	    username.sendKeys("smijo");
	}

	@When("enters invalid password")
	public void enters_invalid_password() {
		   WebElement password = driver.findElement(By.className(""));
		   password.sendKeys("112233");
	}

	@Then("clicks on the login button & shows an error message")
	public void clicks_on_the_login_button_shows_an_error_message() {
		WebElement loginbutton = driver.findElement(By.className(""));
		loginbutton.click();
	}

}
