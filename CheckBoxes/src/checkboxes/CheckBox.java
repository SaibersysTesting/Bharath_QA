package checkboxes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/button/#checkbox");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		List<WebElement> radioButtonElements = driver.findElements(By.xpath(".//*[@id='format']/label/span"));
		
		System.out.println(radioButtonElements.size());
		
		for(int i=0;i<radioButtonElements.size();i++){
			//driver.findElement(By.xpath(".//div[@class='ui-buttonset']/label["+i+"]/span")).click();
			radioButtonElements.get(i).click();
		}		
	}

}
