package StepsDef;



import Driver.Driver;
import PageObject.Connexion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Tests_connect extends Driver{
	
	Connexion connexion;
	Connexion modifprofil ;
	Connexion checkResources;
//connexion
	@Given("browser is open")
	public void browser_is_open() {
		intialization();
		connexion = new Connexion(driver);
		connexion.Click_seconnecter();
	}

	@When("user is on login page")
	public void user_is_on_login_page() {
	   connexion = new Connexion(driver);

	}

	@And("^user enter his email(.*)$")
	public void user_enter_his_email(String email) {
		connexion = new Connexion(driver);
		connexion.enterEmail(email);
	}

	@And("^user enters his password(.*)$")
	public void user_enters_his_password(String password) {
		connexion = new Connexion(driver);
		connexion.enterPassword(password);
	}

	@Then("user is on dashbord page")
	public void user_is_on_dashbord_page() {
		connexion.Clickconnexion();
	}
	
//modify profil 
	@Given("user is on his dashbord")
	public void user_is_on_his_dashbord() {
		modifprofil = new Connexion(driver);
		modifprofil.verifyprofil();
	}
    
    @When("user clicks on his profil")
    public void user_clicks_on_his_profil() throws InterruptedException {
    	modifprofil = new Connexion(driver);
    	modifprofil.clickprofil();
    }

    @And("user delet his old data")
    public void user_delet_his_old_data() {
    	modifprofil = new Connexion(driver);
    	modifprofil.deletolddata();
    }

    @And("^user enters his new data(.*) and (.*) and (.*) and (.*) and (.*)$")
    public void user_enters_his_new_data_name_and_familyname_and_birthday_and_mobilenumber_and_town(String name,String familyname,String birthday,String mobilenumber,String town) {
    	modifprofil = new Connexion(driver);
    	modifprofil.inputnewdata(name, familyname, birthday, mobilenumber, town);
     
    }
    
    @And("^user clicks on submit")
    public void user_clicks_on_submit() {
    	modifprofil = new Connexion(driver);
    	modifprofil.submit();
    }
    

    @Then("user get confirmation of his data modification")
    public void user_get_confirmation_of_his_data_modification() throws InterruptedException {
    	modifprofil = new Connexion(driver);
    	modifprofil.verifymodifsubmit();
       
    }
    
//check resources
    @Given("old session link is displayed")
    public void old_session_link_is_displayed() throws InterruptedException {
    	checkResources = new Connexion(driver);
    	checkResources.checkdiplayoldsessions();
    }


    @When("user clicks on his old sessions link")
    public void user_clicks_on_his_old_sessions_link() throws InterruptedException {
    	checkResources = new Connexion(driver);
    	checkResources.clickoldsessions();
    }

    @And("user clicks on view the course")
    public void user_clicks_on_view_the_course() throws InterruptedException {
    	checkResources = new Connexion(driver);
    	checkResources.clickvoircours();
    }
    @And("user clicks on a module number")
    public void user_clicks_on_a_module_number() throws InterruptedException {
    	checkResources = new Connexion(driver);
    	checkResources.clickvoirmodule();
    }

    @And("user clicks on a course number")
    public void user_clicks_on_a_course_number() throws InterruptedException {
    	checkResources = new Connexion(driver);
    	checkResources.clickvoircoursnum();
    }

    @And("user clicks on resources")
    public void user_clicks_on_resources() throws InterruptedException {
    	checkResources = new Connexion(driver);
    	checkResources.clickvoirressources();
    }

    @Then("user get lessons title displayed")
    public void user_get_lessons_title_displayed() {
    	checkResources = new Connexion(driver);
    	checkResources.checkreferences();
    }

}
