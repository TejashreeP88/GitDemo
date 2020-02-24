import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver ch=new ChromeDriver();
		//WebDriver ch=new FirefoxDriver();
		ch.get("https://sr-stage.b2x.com/#!/login");
		
		//System.out.println(ch.getTitle());
		//System.out.println(ch.getCurrentUrl());
		//System.out.println(ch.getPageSource());
		ch.manage().window().maximize();
		ch.findElement(By.name("userName")).sendKeys("RLASharma");
		ch.findElement(By.xpath("//*[@id='wrap']/div/div/div[1]/div[3]/div[1]/form/lable/div/div/div/div[1]/div[2]/input")).sendKeys("Zew#ub#qC7");
		ch.findElement(By.xpath("//button[@type='submit']")).click();
		//ch.get("https://www.google.com");
		//ch.navigate().back();		
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		//WebDriver ch=new FirefoxDriver();
		//WebDriver ch=new FirefoxDriver();
		//ch.get("https://sr.b2x.com/#!/login");
		//System.out.println(ch.getTitle());
		//System.out.println(ch.getCurrentUrl());
//System.out.println(ch.getCurrentUrl());//System.out.println(ch.getCurrentUrl());
	
		
		
	}

}
