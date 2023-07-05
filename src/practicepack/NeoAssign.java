package practicepack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NeoAssign {

	public static void main(String[] args) throws Exception {

        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://neostox.com/sign-in");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		driver.findElement(By.xpath("//a[text()='Sign In'][@class='nav-link']")).click();//sign in button Click

		driver.findElement(By.name("ctl00$MainContent$signinsignup$txt_mobilenumber")).sendKeys("7757013834");// mobile number text felid

		driver.findElement(By.xpath("//a[@id='lnk_signup1'][text()='Sign In']")).click();//second sign in button click

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		driver.findElement(By.xpath("//input[@id='txt_accesspin']")).sendKeys("1331");//password text field

		driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();//submit button click

		driver.findElement(By.xpath("(//div/a[text()='OK'][@class='btn btn-sm neobutton'])[1]")).click();//First Hidden division popup ok button click

		Thread.sleep(2000);
		driver.navigate().refresh();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='modal-body theme-bg']/a[@class='close']")).click();//Second Hidden Division popup close button
		String virtual_money_text = driver.findElement(By.xpath("//span[text()='Rs.5,00,000.00']")).getText();
		System.out.println(virtual_money_text);

		WebElement reports = driver.findElement(By.id("reportsdropdown"));
		Actions act=new Actions(driver);
		act.click(reports).perform();
		driver.findElement(By.id("lnk_userdashboard")).click();


		int rowSize = driver.findElements(By.xpath("(//table[@class='table table-hover trade-summary-table border'])[1]//tr")).size();
		System.out.println(rowSize);
		System.out.println("Print Table ");
		String table = driver.findElement(By.id("div_todaysummary")).getText();
		System.out.println(table);

		WebElement rtMenu = driver.findElement(By.id("lbl_username"));
		act.moveToElement(rtMenu).perform();
		WebElement myProfile = driver.findElement(By.xpath("//span[text()='My Profile']"));
		act.moveToElement(myProfile).click().perform();
		driver.findElement(By.xpath("(//label[contains(text(),'Female')])[1]")).click();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebElement bankName = driver.findElement(By.id("dd_bankname"));

		Select s=new Select(bankName);
		s.selectByVisibleText("Axis Bank");
		Thread.sleep(3000);


		//WebElement rtMenu = driver.findElement(By.id("lbl_username"));
		act.moveToElement(rtMenu).perform();
		WebElement logoutButton = driver.findElement(By.id("lnk_logout"));
		act.moveToElement(logoutButton).click().perform();

		//Thread.sleep(2000);
		driver.close();
	}
}
