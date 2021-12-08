package MavenProject.MavenProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
public class Teacher {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005726\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(" http://elearningm1.upskills.in/");
		 //driver.manage().window().maximize();
		 
		 //sign up
		 driver.findElement(By.xpath("//*[text()=' Sign up! ']")).click();
		 driver.findElement(By.xpath("//*[@id=\"status-group\"]/div[1]/div[2]")).click();
		 driver.findElement(By.id("registration_firstname")).sendKeys("Teju");
		 driver.findElement(By.id("registration_lastname")).sendKeys("Reddy");
		 driver.findElement(By.id("registration_email")).sendKeys("teju@gmail.com");
		 driver.findElement(By.id("username")).sendKeys("teju81");
		 driver.findElement(By.id("pass1")).sendKeys("Teju@1234");
		 driver.findElement(By.id("pass2")).sendKeys("Teju@1234");
		 driver.findElement(By.id("registration_phone")).sendKeys("6763846193");
		 driver.findElement(By.id("registration_submit")).click();
		 
		 //logout
		 driver.findElement(By.className("dropdown-toggle")).click();
		 driver.findElement(By.id("logout_button")).click();
		 
		 //login
		 driver.findElement(By.id("login")).sendKeys("teju81");
		 driver.findElement(By.id("password")).sendKeys("Teju@1234");
		 driver.findElement(By.id("form-login_submitAuth")).click();
		 
		 //Javascript for scrolling down
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,2000)");	
		 
		 //Creating a new course
		 driver.findElement(By.xpath("//*[text()='Create a course']")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-info")).getText());
		 
		 //Already existing course
		 driver.findElement(By.id("title")).sendKeys("Testing");
		 driver.findElement(By.id("add_course_submit")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-danger")).getText());
		 driver.findElement(By.xpath("//*[@id='title']")).clear();
		 
		 //Adding new course
		 driver.findElement(By.id("title")).sendKeys("Java Basics Tutorial3");
		 driver.findElement(By.id("add_course_submit")).click();
		 
		 //driver.findElement(By.xpath("//*[title='My courses']")).click();
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 System.out.println(driver.findElement(By.className("help-course")).getText());
		 
		 //creating description
		 driver.findElement(By.xpath("//img[@title='Course description']")).click();
		 driver.findElement(By.xpath("//img[@title='Description']")).click();
		 driver.findElement(By.id("course_description_title")).sendKeys("Java Basics22");
		 WebElement course = driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']")); 
		 driver.switchTo().frame(course);
		 //System.out.println("switch to frame");
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("window.scrollBy(0,2000)");
		 driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("java course on arrays, strings and exceptions");
		 //System.out.println("sending message");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.cssSelector(".btn.btn-primary")).click(); 
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-info")).getText());
		 
		 //creating learning path
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 driver.findElement(By.xpath("//img[@title='Learning path']")).click();
		 driver.findElement(By.xpath("//*[@title='Create new learning path']")).click();
		 driver.findElement(By.id("lp_add_lp_name")).sendKeys("Strings");
		 driver.findElement(By.id("lp_add_submit")).click();
		 
		 JavascriptExecutor js9 = (JavascriptExecutor) driver;
		 js9.executeScript("window.scrollBy(0,1000)");
		 
		 //agenda
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 driver.findElement(By.xpath("//img[@title='Agenda']")).click();
		 driver.findElement(By.xpath("//*[@data-date='2021-12-10']")).click();
		 driver.findElement(By.xpath("//*[@id='title']")).sendKeys("Python course");
		 WebElement agenda = driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']"));
		 driver.switchTo().frame(agenda);
		 JavascriptExecutor js11 = (JavascriptExecutor) driver;
		 js11.executeScript("window.scrollBy(0,2000)");
		 driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Python course from 10:00 am to 11:00 am");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("/html/body/div[4]/div[11]/div/button/span")).click();
		 
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("window.scrollBy(0,500)");
		 
		 //Add glossary
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 driver.findElement(By.xpath("//img[@title='Glossary']")).click();
		 driver.findElement(By.xpath("//img[@title='Add new glossary term']")).click();
		 driver.findElement(By.id("glossary_title")).sendKeys("Abstract method");
		 WebElement glossary = driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']"));
		 driver.switchTo().frame(glossary);
		 JavascriptExecutor js10 = (JavascriptExecutor) driver;
		 js10.executeScript("window.scrollBy(0,2000)");
		 driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("A method that has no implementation");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("glossary_SubmitGlossary")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-info")).getText());
		 
		//Adding links
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 driver.findElement(By.xpath("//img[@title='Links']")).click();
		 driver.findElement(By.xpath("//*[@title='Add a link']")).click();
		 driver.findElement(By.id("link_url")).sendKeys("www.java.com/");
		 driver.findElement(By.id("link_title")).sendKeys("JavaTutorials online website");
		 driver.findElement(By.id("link_submitLink")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-info")).getText());
		 
		 //create note
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 JavascriptExecutor js3 = (JavascriptExecutor) driver;
		 js3.executeScript("window.scrollBy(0,2000)");
		 
		 driver.findElement(By.xpath("//img[@title='Notebook']")).click();
		 driver.findElement(By.xpath("//img[@title='Add new note in my personal notebook']")).click();
		 driver.findElement(By.id("note_title")).sendKeys("courses");
		 WebElement notes = driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']"));
		 driver.switchTo().frame(notes);
		 JavascriptExecutor js5 = (JavascriptExecutor) driver;
		 js5.executeScript("window.scrollBy(0,2000)");
		 driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Update Java Basics Tutorial3 course");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("note_SubmitNote")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-success")).getText());
		 
		 //creating new project
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 JavascriptExecutor js4 = (JavascriptExecutor) driver;
		 js4.executeScript("window.scrollBy(0,2000)");
		 
		 driver.findElement(By.xpath("//img[@title='Projects']")).click();
		 driver.findElement(By.xpath("//img[@title='Create a new project']")).click();
		 driver.findElement(By.id("add_blog_blog_name")).sendKeys("Automation Testing");
		 driver.findElement(By.id("add_blog_blog_subtitle")).sendKeys("Automate a website using Selenium");
		 driver.findElement(By.id("add_blog_submit")).click();
		 
		 //Download reports
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 JavascriptExecutor js6 = (JavascriptExecutor) driver;
		 js6.executeScript("window.scrollBy(0,2000)");
		 
		 driver.findElement(By.xpath("//img[@title='Reporting']")).click();
		 driver.findElement(By.xpath("//img[@title='Report on resource']")).click();
		 driver.findElement(By.xpath("//img[@title='CSV export']")).click();
		 
		 //create backup
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 JavascriptExecutor js7 = (JavascriptExecutor) driver;
		 js7.executeScript("window.scrollBy(0,2000)");
		 
		 driver.findElement(By.xpath("//img[@title='Backup']")).click();
		 driver.findElement(By.linkText("Create a backup")).click();
		 driver.findElement(By.id("create_backup_form_submit")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-success")).getText());
		 driver.findElement(By.cssSelector(".btn.btn-primary.btn-large")).click();
		 
		 //create a new course
		 driver.findElement(By.xpath("//*[@title='My courses']")).click();
		 JavascriptExecutor js12 = (JavascriptExecutor) driver;
		 js12.executeScript("window.scrollBy(0,2000)");	
		 driver.findElement(By.xpath("//*[text()='Create a course']")).click();
		 
		 //Add a new course
		 driver.findElement(By.id("title")).sendKeys("Java tutorial 1");
		 driver.findElement(By.id("add_course_submit")).click();
		 
		 //delete the course
		 driver.findElement(By.linkText("Java tutorial 1")).click();
		 JavascriptExecutor js8 = (JavascriptExecutor) driver;
		 js8.executeScript("window.scrollBy(0,2000)");
		 
		 driver.findElement(By.xpath("//img[@title='Backup']")).click();
		 driver.findElement(By.linkText("Completely delete this course")).click();
		 driver.findElement(By.linkText("Yes")).click();
		 
		 //Back to home page
		 driver.findElement(By.linkText("Back to Home Page.")).click();
		 
		 //logout
		 driver.findElement(By.className("dropdown-toggle")).click();
		 driver.findElement(By.id("logout_button")).click();
		 
		 //login using different password
		 driver.findElement(By.id("login")).sendKeys("teju81");
		 driver.findElement(By.id("password")).sendKeys("Teju@12");
		 driver.findElement(By.id("form-login_submitAuth")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-danger")).getText());
		 
		 //Lost password
		 driver.findElement(By.linkText("I lost my password")).click();
		 driver.findElement(By.id("lost_password_user")).sendKeys("teju@gmail.com");
		 driver.findElement(By.id("lost_password_submit")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-info")).getText());
		 
		 driver.close();

	}

}
