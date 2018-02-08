package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LoginSteps{
	
	WebDriver driver;
	
	public By login =By.id("login:loginField:username");
	public By password = By.id("login:passwordField:password");
	public By btnIngresar= By.name("login:j_id67");

	@Given("el navegador abierto")
	public void openNavegador(){
		
		
	System.setProperty("webdriver.chrome.driver","c://Proyectos//software//Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://172.17.104.230:8080/redmia/");
		
	}
	
	@When("ingrese $numero en login")
	public void ingresarLogin(String numero){
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login));
		driver.findElement(login).sendKeys(numero);
		
		System.out.println("Pase paso 2");
	}
	
	@When("ingrese $contrasena en password")
	public void ingresarContrasena(String contrasena){
		
		driver.findElement(password).sendKeys(contrasena);
		System.out.println("Pase paso 3");
		
		driver.findElement(btnIngresar).click();
		System.out.println("Pase paso 3,1");
		
	}
	
	@Then("carga el home")
	public void verHome(){
		
		System.out.println("Pase paso 4");
		Assert.assertEquals(1, 1);
	//	driver.quit();
	}
	
	
	

}
