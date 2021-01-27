package StepDef;

import java.util.List;
import java.util.Map;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//asList datatable
public class UserRegistrationSteps {
	@Given("User is on the registration page")
	public void user_is_on_the_registration_page() {
	    System.out.println("User navigates on registration page");
	}

	/*
	 * @When("User enters the following user details") public void
	 * user_enters_the_following_user_details(DataTable dataTable) {
	 * List<List<String>> userList = dataTable.asLists(String.class); for
	 * (List<String> e : userList) { System.out.println(e); }
	 * 
	 */
	@When("User enters the following user details with coloumns")
	   public void user_details_with_coloumns(DataTable data) 
	   {
	      List<Map<String, String>> userListfromMaps=data.asMaps(String.class,String.class);
	       System.out.println(userListfromMaps.get(0).get("Email"));
	       System.out.println(userListfromMaps.get(1).get("City"));
	       
	   }
	
	

	@Then("User registration should be correct and successful")
	public void user_registration_should_be_correct_and_successful()
	{
		System.out.println("user should be successfully registered");
	}
}
