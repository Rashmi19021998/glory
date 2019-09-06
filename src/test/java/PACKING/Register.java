package PACKING;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	WebDriver driver;
	@Given("Launch chrome driver and open to testmeapp")
	public void launch_chrome_driver_and_open_to_testmeapp() {
	    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\Rashmi\\driver\\chromedriver.exe" );
    driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/");
 	}

 	@Given("click on signup button")
 	public void click_on_signup_button() {
 	    // Write code here that turns the phrase above into concrete actions
 	    driver.findElement(By.partialLinkText("SignUp")).click();
 	}
 	@When("I enter USERNAME {string} in the field")
 	public void i_enter_USERNAME_in_the_field(String a) {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(a); 
 	}

 	@When("first name {string} in first name field")
 	public void first_name_in_first_name_field(String b) {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.id("firstName")).sendKeys(b); 
 	}

 	@When("I enter last name {string} in the field")
 	public void _enter_last_name_in_the_field(String c) {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.id("lastName")).sendKeys(c);
 	}

 	@When("I enter password  {string} in password field")
 	public void _enter_password_in_password_field(String d) {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.id("password")).sendKeys(d);
 	}

 	@When("I enter confirm password {string} in confirm password field")
 	public void _enter_confirm_password_in_confirm_password_field(String e) {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.id("pass_confirmation")).sendKeys(e);

 	}

 	@When("i enter gender female in gender field")
 	public void _enter_gender_female_in_gender_field() {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.xpath("//input[@value='Female']")).click();
 	}

 	@When("i enter email {string} in email field")
 	public void _enter_email_in_email_field(String f) {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.id("emailAddress")).sendKeys(f);
 	}

 	@When("i enter mobile {string} in mobilenumber field")
 	public void _enter_mobile_in_mobilenumber_field(String g) {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.id("mobileNumber")).sendKeys(g);
 	}

 	@When("i enter {string} in dob field")
 	public void _enter_in_dob_field(String h) {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.id("dob")).sendKeys(h);
 	}

 	@When("i enter address {string} in address field")
 	public void _enter_address_in_address_field(String i) {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.id("address")).sendKeys(i);
 	}

 	@When("i enter security question")
 	public void i_enter_security_question() {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.id("securityQuestion")).click();
		driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]/option[2]")).click();
 	}

 	@When("i enter answer")
 	public void _enter_answer() {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.id("answer")).sendKeys("black");
 	}

 	@Then("i click on Register")
 	public void _click_on_Register() {
 	    // Write code here that turns the phrase above into concrete actions
 		driver.findElement(By.name("Submit")).click();
 	}

@Given("Launch chrome driver and open testme")
public void launch_chrome_driver_and_open_testme() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\Rashmi\\driver\\chromedriver.exe" );
    driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/");
}



@When("user clicks SignIn buttton")
public void user_clicks_SignIn_buttton() {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.partialLinkText("SignIn")).click();
}
@And("user enters username {string}")
public void user_enters_username(String x) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("userName")).sendKeys(x);
	//driver.findElement(By.xpath("//*[@id="userName"]")).sendKeys(x);
}
@And("user enters password {string}")
public void user_enters_password(String y) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("password")).sendKeys(y);
}


@Then("user clicks login button")
public void user_clicks_login_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@value='Login']")).click();
}
@Given("open chrome driver and testmeapp")
public void open_chrome_driver_and_testmeapp() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\Rashmi\\driver\\chromedriver.exe" );
    driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/");
}

@When("user clicks signIn button")
public void user_clicks_signIn_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.partialLinkText("SignIn")).click();
}

@And("user enters uname {string}")
public void user_enters_uname(String k) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("userName")).sendKeys(k);
}

@And("user enters pwd {string}")
public void user_enters_pwd(String l) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("password")).sendKeys(l);
}

@And("user put login button")
public void user_put_login_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@value='Login']")).click();
}

@And("search product and type")
public void search_product_and_type() {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Headphone");
   driver.findElement(By.cssSelector("input[value='FIND DETAILS']")).click();
	
	/*WebElement search=driver.findElement(By.id("myInput"));
	Actions A=new Actions(driver);
	A.keyDown(search, Keys.SHIFT).perform();
	A.sendKeys("h").pause(2000).sendKeys("e").pause(2000).sendKeys("a").pause(2000).sendKeys("d").pause(2000).perform();
	A.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Head')]"))).click().build().perform();
     driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
     driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();*/
}
@And("add to cart and click cart")
public void add_to_cart_and_click_cart() throws InterruptedException {
    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	 driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[5]/form/input[2]")).click();
//	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	//Thread.sleep(3000);
   // driver.findElement(By.partialLinkText("Cart")).click();
}

@Then("Go to payment page")
public void go_to_payment_page() {
    // Write code here that turns the phrase above into concrete actions
	//driver.findElement(By.partialLinkText("Checkout")).click();
    }




}

