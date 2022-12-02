package com.example.CRMSpringBoot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class PruebaSelenium{
	public static void main(String[] args) throws Exception, NoAlertPresentException, UnhandledAlertException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:5173/login");
		
		Thread.sleep(1000);
		//To the login
		//email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("solera@solera.com");
	
		Thread.sleep(1000);
		//password
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("bootcamp4");
		
		Thread.sleep(1000);
		//button login
		driver.findElement(By.id("botonLogin")).click();
		
		Thread.sleep(2000);
		
		//main page
		driver.findElement(By.id("viewAllContacts")).click();
		
		Thread.sleep(4000);
		
		//pagina de contactos
		//crear contacto
		driver.findElement(By.id("crearContacto")).click();
		
		Thread.sleep(1000);
		
		WebElement idContact = driver.findElement(By.id("id"));
		idContact.sendKeys("7");
		
		Thread.sleep(500);
		
		WebElement typeContact = driver.findElement(By.id("type"));
		typeContact.sendKeys("Email");
		
		Thread.sleep(500);
		
		WebElement dateContact = driver.findElement(By.id("dateContact"));
		dateContact.sendKeys("2022-12-12");
		
		Thread.sleep(500);
		
		WebElement descriptionContact = driver.findElement(By.id("description"));
		descriptionContact.sendKeys("Quiere hacerse cliente en un mes");
		
		Thread.sleep(500);
		
		
		driver.findElement(By.id("addContact")).click();
		
		Thread.sleep(1000);
		
		Alert alertf = driver.switchTo().alert();
		alertf.accept();
		
		//Rellenar formulario de oportunidad
		driver.findElement(By.id("idOpor")).sendKeys("7");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("nameOpor")).sendKeys("Juan Jose Garcia Gomez");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("phoneNumberOpor")).sendKeys("789789789");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("emailOpor")).sendKeys("juanjo@gmail.com");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("contactIdOpor")).sendKeys("7");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("clientOpor")).sendKeys("0");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("addOportunitie")).click();
		
		Thread.sleep(500);
		
		Alert alertf2 = driver.switchTo().alert();
		alertf2.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("viewAllClients")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("atrasClients")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("viewAllOportunities")).click();
		
		Thread.sleep(2500);
		
		driver.findElement(By.id("botonCambiarCliente")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("atrasOportunities")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("viewAllClients")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("atrasClients")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("viewAllContacts")).click();
		
		Thread.sleep(4000);
		
		driver.close();
		
		
		
	}
}
