package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driver.Driver;
import junit.framework.Assert;



public class Connexion extends Driver{
	
	WebDriver driver;
	//55
    private By champs_seconnecter= By.xpath("//*[@id=\"main-menu\"]/div/div/div/nav/div/ul/li[5]/a");
    private By champs_email=By.xpath("//input[contains(@id,'inputEmail')]");
    private By champs_password=By.xpath("//input[contains(@id,'inputPassword')]");
    private By champs_connexion=By.xpath("//*[@id='myModal']/div/div/div[3]/form/div[3]/button");
    private By champs_tableaudebord=By.xpath("//*[@id=\"menu\"]/div/ul/li[2]/a/span");
    
    private By btn_fleche=By.xpath("//*[@id=\"mainSidebarCollapse\"]");
    private By btn_name=By.xpath("//a[contains(@id,'userAccount')]");
    private By btn_profil=By.xpath("//*[@id=\"menu\"]/div/div/div/div/h4/span/span/a[1]");
    
    private By champs_name=By.xpath("//input[contains(@id,'student_lastName')]");
    private By champs_familyname=By.xpath("//input[contains(@id,'student_firstName')]");  
    private By champs_birthday=By.xpath("//input[contains(@id,'student_birthday')]");
    private By champs_mobilenumber=By.xpath("//input[contains(@id,'student_tel')]");
    private By champs_town=By.xpath("//select[contains(@id,'student_city')]");
    private By btn_submit=By.xpath("//button[contains(@id,'student_save')]");
    private By sentance=By.xpath("//div[contains(@class,'swal-text')]");
    private By btn_OK=By.xpath("//button[contains(@class,'swal-button swal-button--confirm')]");
    
	
	
    
    private By btn_oldsessions=By.xpath("//span[contains(@class,'nav-text ml-3')]");
    private By btn_voircours=By.linkText("Voir Le Cours");  
    private By btn_module=By.xpath("//a[contains(@id,'module_active_103')]");  
    private By btn_coursnum=By.xpath("//a[contains(@id,'active_day_810')]");
    private By btn_ressources=By.linkText("Ressources");
    private By voila=By.xpath("//*[@id=\"resources-810\"]/div/h4");
    
	public Connexion(WebDriver driver) {
		this.driver=driver;
		//if(!driver.getTitle().equals("TalanAcademy")){
			//throw new IllegalStateException("this is not login page, the current page is"+driver.getCurrentUrl());}
	}
//connexion
	public void Click_seconnecter() {
		//driver.getTitle().equals("TalanAcademy");
		if(!driver.getTitle().equals("TalanAcademy")){
		throw new IllegalStateException("this is not login page, the current page is"+driver.getCurrentUrl());}
		 driver.findElement(champs_seconnecter).click();
		}
	
	public void enterEmail(String email) {
	     driver.findElement(champs_email).sendKeys(email);
		}
	
	public void enterPassword(String password) {
		 driver.findElement(champs_password).sendKeys(password);
		}
	
	public void Clickconnexion() {
	     driver.findElement(champs_connexion).click();
	     driver.findElement(champs_tableaudebord).isDisplayed();
	}
//modif profil 
	
	public void verifyprofil() {
		 driver.getCurrentUrl().equals("https://www.taan-academy.com/apprenti/dashboard/");
		}
	
	public void clickprofil() throws InterruptedException {
	     driver.findElement(btn_fleche).click();
	     Thread.sleep(2000);
	     driver.findElement(btn_name).click();
	     driver.findElement(btn_profil).click();
	}
	
	
	public void deletolddata() {
		 driver.findElement(champs_name).clear();
		 driver.findElement(champs_familyname).clear();
		 driver.findElement(champs_birthday).clear();
		 driver.findElement(champs_mobilenumber).clear();
		 
		}
	public void inputnewdata(String name,String familyname,String birthday,String mobilenumber,String town) {
		 driver.findElement(champs_name).sendKeys(name);
		 driver.findElement(champs_familyname).sendKeys(familyname);
		 driver.findElement(champs_birthday).sendKeys(birthday);
		 driver.findElement(champs_mobilenumber).sendKeys(mobilenumber);
		 driver.findElement(champs_town).sendKeys(town);
		 
		}
	public void submit() {
		 driver.findElement(btn_submit).click();
		 
		}
    public void verifymodifsubmit() throws InterruptedException {
		
		driver.findElement(sentance).getText().trim().equals("Profil mis à jour avec succès");
		Thread.sleep(2000);
        driver.findElement(btn_OK).click();
    }
		//Assert.assertEquals(Verifytext, "Paste the text here which needs to be verified");
	/*	if(driver.findElement(sentance).getText().equals("Profil mis à jour avec succès")) {
			driver.findElement(btn_OK).click();
		}
		else {throw new IllegalStateException("your submission didn't work");}
	}*/
    
    
  //check old sessions courses 
    public void checkdiplayoldsessions() throws InterruptedException{
    	driver.findElement(btn_oldsessions).getText().trim().equals("Mes sessions passées");
    }
    
    public void clickoldsessions() throws InterruptedException{
		driver.findElement(btn_oldsessions).click();
		Thread.sleep(2000);
		driver.getCurrentUrl().equals("https://www.talan-academy.com/apprenti/passedSession");
    }
    public void clickvoircours() throws InterruptedException{
    	driver.findElement(btn_voircours).click();
        Thread.sleep(2000);
    }
    public void clickvoirmodule() throws InterruptedException{
    	driver.findElement(btn_module).click();
        Thread.sleep(2000);
    }
    public void clickvoircoursnum() throws InterruptedException{
    	driver.findElement(btn_coursnum).click();
        Thread.sleep(2000);
    }
    
    public void clickvoirressources() throws InterruptedException{
    	driver.findElement(btn_ressources).click();
        Thread.sleep(2000);
    }
    public void checkreferences() {
    	driver.findElement(voila).getText().trim().equals("Voilà les références théoriques du jour :");
    }
}
