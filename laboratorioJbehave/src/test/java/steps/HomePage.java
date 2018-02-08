package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage{
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		
		this.driver=driver;
//		PageFactory.initElements(driver, this);
	}
	
	public By login =By.id("login:loginField:username");
	public By password = By.id("login:passwordField:password");
	public By btnIngresar= By.name("login:j_id67");
	
	public void openNavegador(){
		System.setProperty("webdriver.chrome.driver","c://Proyectos//software//Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://172.17.104.230:8080/redmia/");
	}
	
	
	
	
	
	

	
}
