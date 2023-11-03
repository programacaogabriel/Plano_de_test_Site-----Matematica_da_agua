package matematica_da_agua;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Teste02_RealizaroCalculonoSite {

	@Test
	public void loginTest() {
		System.out.println("Starting");

//		Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

// 		maximize browser window
		driver.manage().window().maximize();

//		open test page
		String url = "https://programacaogabriel.github.io/Site---matematica_da_agua/";
		driver.get(url);
		System.out.println("Page is opened.");
		
//		Teste01 - inserir apenas números do campo de inserção de números
		WebElement number =  driver.findElement(By.id("peso"));
		number.sendKeys("85");
		sleep(1000);
		
		WebElement buttonCalc = driver.findElement(By.xpath("//*[@id=\"tela_calculadora\"]/button"));
		buttonCalc.click();
		sleep(1000);
		
		
//      verification
//      				
		String expectedResult = "O resultado é igual a 2975 mL / 2.977 Litros";
		WebElement actualResult = driver.findElement(By.xpath("//*[@id=\"resultado\"]"));
		
		
		System.out.println("A conta ocorreu corretamente");
		sleep(1000);	
		
		
//		Quit Page 
		driver.close();

	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
