package matematica_da_agua;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Teste01_RealizaroAcessoaoSite {

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
		
//      verification
//      new url
				
		String expectedUrl = "https://programacaogabriel.github.io/Site---matematica_da_agua/";
		String actualUral = driver.getCurrentUrl();
				
		Assert.assertEquals(actualUral,expectedUrl, " Actual page url is not the same as expected");
		System.out.println("Pagina está em funcionamento");
		
		
//		Quit Page 
		driver.close();

	}

}
