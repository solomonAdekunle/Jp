package MobileJackpot.JackPot247Mobile;

import java.io.IOException;

import CorePage.BasePage;
import CorePage.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class StepsDefinition extends TestBase{

	private BasePage basePage;
	private LoginPage loginPage;
	
	
		
	
	public StepsDefinition() throws IOException {
		super();
		basePage = new BasePage(TestBase.d);
		loginPage= new LoginPage(TestBase.d);
		
	}
    
	
	@Before
	public void GoToUrl() throws InterruptedException, IOException {
		
		
		
		
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
   /* This is a Given Method  */
////////////////////////////////////////////////////////////////////////////////////////////////////////

	/* Navigate to the Home Page on the browser */
	@Given("^I Navigate to the homepage on \"([^\"]*)\"$")
	public void i_Navigate_to_the_homepage_on(String BaseUrl){
		basePage.getSiteAddress(Config.getProperty("URL"));
	}
	@Given("^I have loggedin on the BasePage$")
	public void i_have_loggedin_on_the_BasePage()  {
	   
	}
	
		
	@Given("^I navigate to the Registrationpage on \"([^\"]*)\"$")
	public void i_navigate_to_the_Registrationpage_on(String arg1)  {
	 
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* These are all When methods on the class */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/* Click on on Top Login Button */
	@When("^I click on Login Button$")
	public void i_click_on_Login_Button()  {
		basePage.clickLoginButton();
	  
	}
	/*
	 * Enter User in the Useranem input box
	 * 
	 * @param{string username}- this is the username of the Account holder
	 */
	@When("^I enter Username as \"([^\"]*)\"$")
	public void i_enter_Username_as(String username)  {
		loginPage.sendLoginUserName(username);
	   
	}
	/*
	 * Enter User in the Password input box
	 * 
	 * @param{string password}- this is the password of the Account holder
	 */
	@When("^I enter Password as \"([^\"]*)\"$")
	public void i_enter_Password_as(String password) {
		loginPage.sendLoginPassword(password);
	    
	}
	/* Click on Login button on Login Pop-u box */
	@When("^I click on SignIn button$")
	public void i_click_on_SignIn_button()  {
	   loginPage.clickLoginPopUpBoxLoginButton();
	}
	/* Click on a Game */
	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) {
	    
	}
   /* Click on Play for real Button */
	@When("^I click on Play button$")
	public void i_click_on_Play_button()  {
	  
	}
	/* Click on the slot tab on game category */
	@When("^I click Games Category Slots tab$")
	public void i_click_Games_Category_Slots_tab()  {
	    
	}
	/* Click on a slot game */
	@When("^I click on a Slots Game$")
	public void i_click_on_a_Slots_Game()  {
	   
	}
	/* Click on table game tab on game category */
	@When("^I click Games Category Table Games tab$")
	public void i_click_Games_Category_Table_Games_tab()  {
	    
	}
	/* Click on table game tab  */
	@When("^I click on a Table Game$")
	public void i_click_on_a_Table_Game() {
	    
	}
	/* Click on Vegas Vertical tab */
	@When("^I click on Vegas Vertical Tab$")
	public void i_click_on_Vegas_Vertical_Tab() {
	   
	}
	/* Click on Live Vertical tab */
	@When("^I click on Live Vertical Tab$")
	public void i_click_on_Live_Vertical_Tab() {
	    
	}
	/* Click on live game tab */
	@When("^I click on a Live Game$")
	public void i_click_on_a_Live_Game()  {
	   
	}
	/* Click on on search field input box icon */
	@When("^I click on the Search Input Icon$")
	public void i_click_on_the_Search_Input_Icon()  {
	   
	}
	/* Enter the game search sype within the search input filed */
	@When("^I enter Game Search for as \"([^\"]*)\"$")
	public void i_enter_Game_Search_for_as(String arg1)  {
	   
	}
	/* Click on Play for Fun Button within the Game Pop-up box*/
	@When("^I click on Demo button$")
	public void i_click_on_Demo_button() {
	    
	}
	@When("^I click Gender Type as Female$")
	public void i_click_Gender_Type_as_Female() {
	   
	}


	@When("^I click on RegClickHere$")
	public void i_click_on_RegClickHere() {
		

	}
	@When("^I enter Country as \"([^\"]*)\"$")
	public void i_enter_Country_as(String arg1) {
	   
	}

	@When("^I enter Currency as \"([^\"]*)\"$")
	public void i_enter_Currency_as(String arg1){
	   
	}
	
	
	@When("^I enter regUsername as \"([^\"]*)\"$")
	public void i_enter_regUsername_as(String arg1)  {
	   
	}

	@When("^I enter RegPassword as \"([^\"]*)\"$")
	public void i_enter_RegPassword_as(String arg1)  {
	   
	}

	@When("^I enter RegConfirmPassword as \"([^\"]*)\"$")
	public void i_enter_RegConfirmPassword_as(String arg1)  {
	    
	}

	@When("^I enter a RegScreenName as \"([^\"]*)\"$")
	public void i_enter_a_RegScreenName_as(String arg1)  {
	   
	}

	@When("^I enter RegEmail as \"([^\"]*)\"$")
	public void i_enter_RegEmail_as(String arg1)  {
	    
	}

	@When("^I enter RegFirstName as \"([^\"]*)\"$")
	public void i_enter_RegFirstName_as(String arg1) {
	   
	}

	@When("^I enter RegSurName as \"([^\"]*)\"$")
	public void i_enter_RegSurName_as(String arg1) {
	    
	}

	@When("^I enter RegDOBDay as \"([^\"]*)\"$")
	public void i_enter_RegDOBDay_as(String arg1){
	   
	}

	@When("^I enter RegDOBMonth as \"([^\"]*)\"$")
	public void i_enter_RegDOBMonth_as(String arg1)  {
	   
	}

	@When("^I enter RegDOBYear as \"([^\"]*)\"$")
	public void i_enter_RegDOBYear_as(String arg1)  {
	  
	}

	@When("^I enter RegAddress as \"([^\"]*)\"$")
	public void i_enter_RegAddress_as(String arg1) {
	   
	}

	@When("^I enter RegTown as \"([^\"]*)\"$")
	public void i_enter_RegTown_as(String arg1)  {
	   
	}

	@When("^I enter RegCounty as \"([^\"]*)\"$")
	public void i_enter_RegCounty_as(String arg1)  {
	    
	}

	@When("^I enter RegPostCode as \"([^\"]*)\"$")
	public void i_enter_RegPostCode_as(String arg1) {
	   
	}

	@When("^I enter RegContactNum as \"([^\"]*)\"$")
	public void i_enter_RegContactNum_as(String arg1)  {
	   
	}

	@When("^I click on deposit limit click here link$")
	public void i_click_on_deposit_limit_click_here_link() {
	    
	}

	@When("^I enter Choose Type as \"([^\"]*)\"$")
	public void i_enter_Choose_Type_as(String arg1)  {
	    
	}

	@When("^I enter Choose limit as \"([^\"]*)\"$")
	public void i_enter_Choose_limit_as(String arg1)  {
	   
	}

	@When("^I click on RegT\\$CCheckBox$")
	public void i_click_on_RegT$CCheckBox()  {
	    
	}

	@When("^I click on RegSubmitButton$")
	public void i_click_on_RegSubmitButton()  {
	    
	}

	@When("^I click on BonusTerms and Wagering link$")
	public void i_click_on_BonusTerms_and_Wagering_link() {
	   
	}

	@When("^I click on the Close icon within Bonus Term Frame box$")
	public void i_click_on_the_Close_icon_within_Bonus_Term_Frame_box() {
	    
	}
	
	@When("^I click on  OverEighteen Terms link$")
	public void i_click_on_OverEighteen_Terms_link()  {
	    
	}
	
	@When("^I click on the Close icon within the Frame box$")
	public void i_click_on_the_Close_icon_within_the_Frame_box() {
	   
	}
	@When("^I click on  OverEighteen Privacy Policy link$")
	public void i_click_on_OverEighteen_Privacy_Policy_link() {
	    
	}
	
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* Thses are all Then methods */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		/* Verify if Login Pop-up box is displayed*/
	@Then("^I should see Login Pop-up box displayed$")
	public void i_should_see_Login_Pop_up_box_displayed() {
		Assert.assertTrue(loginPage.isLoginPopBoxPresent());
		
		
	}
	/* Verify if Jackpot247 logo is displayed within Pop-up box */
	@Then("^I should see Jackpot Logo displayed within the Login Pop-up$")
	public void i_should_see_Jackpot_Logo_displayed_within_the_Login_Pop_up()  {
		Assert.assertTrue(loginPage.isJackpot247LogoPresent());
	}
    /* Verify if Username Input box is present within login pop-up box */
	@Then("^I should see Username Input Box$")
	public void i_should_see_Username_Input_Box()  {
		Assert.assertTrue(loginPage.isLoginUserNameInputBoxPresent());
	}
   /* Verify if Password input box is displayed within the pop-up box */
	@Then("^I should see Password Input box$")
	public void i_should_see_Password_Input_box() {
		Assert.assertTrue(loginPage.isLoginPasswordInputBoxPresent());
	}
	 /* Verify if Forgotten details link is displayed within the pop-up box */
	@Then("^I should see Forgotten details link$")
	public void i_should_see_Forgotten_details_link()  {
		Assert.assertTrue(loginPage.isLoginPopUpBoxForgottenLinkPresent());
	}
	 /* Verify if Login button is displayed within the pop-up box */
	@Then("^I should see SignIn Button$")
	public void i_should_see_SignIn_Button() {
		Assert.assertTrue(loginPage.isLoginPopUpBoxLoginButtonPresent());
	    
	}
	 /* Verify if New User link is displayed within the pop-up box */
	@Then("^I should see New User link$")
	public void i_should_see_New_User_link(){
	    
	}
	 /* Verify if Register Now button is displayed within the pop-up box */
	@Then("^I should see Join Now Button$")
	public void i_should_see_Join_Now_Button() {
		Assert.assertTrue(loginPage.isLoginPopUpBoxRegisterNowButtonPresent());
	    
	}
	 /* Verify if Close icon displayed within the pop-up box */
	@Then("^I should see Close Incon$")
	public void i_should_see_Close_Incon()  {
		Assert.assertTrue(loginPage.isLoginPopUpBoxClsoeIconPresent());
	   
	}

	 /* Verify if Login Error Message is displayed within the pop-up box */
	@Then("^I should see Login errorMesssage Pop-up box$")
	public void i_should_see_Login_errorMesssage_Pop_up_box()  {
		Assert.assertTrue(loginPage.isLoginPopBoxErrorMessagePresent());
	}
	 /* Verify if UserName displayed on the Page is the same username entered */
	@Then("^I should see username as \"([^\"]*)\" present$")
	public void i_should_see_username_as_present(String username)  {
	String NameDisplayed=basePage.isUserNamePresent(username);
		Assert.assertEquals(basePage.isUserNamePresent(username), username);
	    
	}
	 /* Verify ifAccount Balance is displayed on the Top Bar*/
	@Then("^I should see AccountBlance present$")
	public void i_should_see_AccountBlance_present() {
		Assert.assertTrue(basePage.HomePageAccountBalancePresent());
	}
	 /* Verify ifDeposit button is displayed on the Top Bar*/
	@Then("^I should see Depositbutton present$")
	public void i_should_see_Depositbutton_present()  {
		Assert.assertTrue(basePage.isDepositButtonPresent());
	}
	/* Verify if Jackpot247 logo is display at the top bar of the site*/
	@Then("^I should see Jackpot Logo displayed$")
	public void i_should_see_Jackpot_Logo_displayed() {
	    
	}
	/* Verify if Login Button is display at the top bar of the site*/
	@Then("^I should see Login Button$")
	public void i_should_see_Login_Button() {
	  
	}
	/* Verify if Side bar is display at the top bar of the site*/
	@Then("^I should see SideBar Menu Icon$")
	public void i_should_see_SideBar_Menu_Icon() {
	  
	}
	/* Verify if  Casino vertical tab is display on the home page*/
	@Then("^I should see Casino Vertical Tab$")
	public void i_should_see_Casino_Vertical_Tab()  {
	  
	}
	/* Verify if  Vegas vertical tab is display on the home page*/
	@Then("^I should see Vegas Vertical Tab$")
	public void i_should_see_Vegas_Vertical_Tab() {
	    
	}
	/* Verify if  Live vertical tab is display on the home page*/
	@Then("^I should see Live Vertical Tab$")
	public void i_should_see_Live_Vertical_Tab(){
	    
	}
	/* Verify if  promos vertical tab is display on the home page*/
	@Then("^I should see Promos Vertical Tab$")
	public void i_should_see_Promos_Vertical_Tab()  {
	   
	}
	/* Verify if Hero banner display on the home page*/
	@Then("^I should see Hero Banner$")
	public void i_should_see_Hero_Banner() {
	    
	}
	/* Verify if  Game category menu is display on the home page*/
	@Then("^I should see Games Category Tab$")
	public void i_should_see_Games_Category_Tab() {
	    
	}
	/* Verify if  Game Pop-up box is displayed when user click on any game*/
	@Then("^I should see a Game Pop-upbox$")
	public void i_should_see_a_Game_Pop_upbox(){
	}
	/* Verify if  Game image is displayed  Pop-up box  when user click on any game*/
	@Then("^I should see Game Image in pop-up box$")
	public void i_should_see_Game_Image_in_pop_up_box() {
	    
	}
	/* Verify if  Game name is displayed  Pop-up box  when user click on any game*/
	@Then("^I should see the Name of the Game$")
	public void i_should_see_the_Name_of_the_Game() {
	    
	}
	/* Verify if  Play button  is displayed on Pop-up box  when user click on any game*/
	@Then("^I should see Play button within the Pop-up box$")
	public void i_should_see_Play_button_within_the_Pop_up_box() {
	    
	}
	/* Verify if  Demo button is displayed  Pop-up box  when user click on any game*/
	@Then("^I should see Demo button within the Pop-up box$")
	public void i_should_see_Demo_button_within_the_Pop_up_box()  {
	    
	}
	/* Verify if More info link is displayed within  Pop-up box  when user click on any game*/
	@Then("^I should see MoreInfo link on the Game Pop-up box$")
	public void i_should_see_MoreInfo_link_on_the_Game_Pop_up_box()  {
	   
	}
	/* Verify if close icon is displayed within  Pop-up box  when user click on any game*/
	@Then("^I should see Close icon on the Game Pop-up box$")
	public void i_should_see_Close_icon_on_the_Game_Pop_up_box()  {
	    
	}
	/* Verify Play for Real game is launched  when user click on any game*/
	@Then("^I should see a Play for Cash game Launching$")
	public void i_should_see_a_Play_for_Cash_game_Launching()  {
	    
	}
	
	/* Verify Play for Fun game is launched  when user click on any game*/
	@Then("^I should see a Demo Game Launching$")
	public void i_should_see_a_Demo_Game_Launching() {
	    
	}
	/* Verify if Playtech Virtue fusion game launched  when user click on any game*/
	@Then("^I should see a Vegas Slots Game launching$")
	public void i_should_see_a_Vegas_Slots_Game_launching()  {
	   
	}
	/* Verify if search input box field is displayed on casino and Vegas home page*/
	@Then("^I should see Search Input box open$")
	public void i_should_see_Search_Input_box_open() {
	   
	}
	/* Verify if  close icon is displayed on search input box field  on casino and Vegas home page*/
	@Then("^I should see Search close icon$")
	public void i_should_see_Search_close_icon() {
	    
	}
	/* Verify if Roulette Express Premium game return as a search return */
	@Then("^I should see Roulette Express Premoium display from the Search$")
	public void i_should_see_Roulette_Express_Premoium_display_from_the_Search() {
	    
	}
	/* Verify if Virtue Fusion game return as a search return */
	@Then("^I should see Virtue Fusion Game display from the Search$")
	public void i_should_see_Virtue_Fusion_Game_display_from_the_Search()  {
	    
	}
	@Then("^I should see Register on the Register form$")
	public void i_should_see_Register_on_the_Register_form() {
	   
	}

	@Then("^I should Email Input box displayed on Registration page$")
	public void i_should_Email_Input_box_displayed_on_Registration_page()  {
	    
	}

	@Then("^I should see Password Input box displayed on Registration page$")
	public void i_should_see_Password_Input_box_displayed_on_Registration_page() {
	    
	}

	@Then("^I should see Useranme Input box displayed on Registration Page$")
	public void i_should_see_Useranme_Input_box_displayed_on_Registration_Page()  {
	    
	}

	@Then("^I should see ScreenName Input box displayed on Registration Page$")
	public void i_should_see_ScreenName_Input_box_displayed_on_Registration_Page() {
	    
	}

	@Then("^I should see FirstName Input box displayed on Registration Page$")
	public void i_should_see_FirstName_Input_box_displayed_on_Registration_Page() {
	    
	}

	@Then("^I should see Surname Input box displayed on Registration Page$")
	public void i_should_see_Surname_Input_box_displayed_on_Registration_Page()  {
	    
	}

	@Then("^I should see Date of Birth Day Dropdown box displayed on Registration Page$")
	public void i_should_see_Date_of_Birth_Day_Dropdown_box_displayed_on_Registration_Page() {
	   
	}

	@Then("^I should see Date of Birth Month Dropdown box displayed on Registration Page$")
	public void i_should_see_Date_of_Birth_Month_Dropdown_box_displayed_on_Registration_Page()  {
	    
	}

	@Then("^I should see Date of Birth Year Dropdown box displayed on Registration Page$")
	public void i_should_see_Date_of_Birth_Year_Dropdown_box_displayed_on_Registration_Page()  {
	    
	}

	@Then("^I should see Gender Radio Buttons displayed on Registration Page$")
	public void i_should_see_Gender_Radio_Buttons_displayed_on_Registration_Page()  {
	    
	}

	@Then("^I should see Country Input box displayed on Registration Page$")
	public void i_should_see_Country_Input_box_displayed_on_Registration_Page()  {
	    
	}

	@Then("^I should see Currency Input box displayed on Registration Page$")
	public void i_should_see_Currency_Input_box_displayed_on_Registration_Page()  {
	    
	}

	@Then("^I should see House Number Input box displayed on Registration Page$")
	public void i_should_see_House_Number_Input_box_displayed_on_Registration_Page() {
	   
	}
	@Then("^I should see Find Address button displayed on Registration Page$")
	public void i_should_see_Find_Address_button_displayed_on_Registration_Page()  {
	    
	}

	@Then("^I should see Country Code dropdown box displayed on Registration Page$")
	public void i_should_see_Country_Code_dropdown_box_displayed_on_Registration_Page(){
	   
	}

	@Then("^I should see Contact Number Input box displayed on Registration Page$")
	public void i_should_see_Contact_Number_Input_box_displayed_on_Registration_Page()  {
	   
	}

	@Then("^I should see Deposit Limit Type Input box displayed on Registration Page$")
	public void i_should_see_Deposit_Limit_Type_Input_box_displayed_on_Registration_Page()  {
	   
	}

	@Then("^I should see Deposit Limit Amount Dropdown box displayed on Registration Page$")
	public void i_should_see_Deposit_Limit_Amount_Dropdown_box_displayed_on_Registration_Page() {
	   
	}

	@Then("^I should see Free Bonuses and Offer Check box checked displayed on Registration Page$")
	public void i_should_see_Free_Bonuses_and_Offer_Check_box_checked_displayed_on_Registration_Page() {
	    
	}

	@Then("^I should see OverEighteenPlus Check box displayed on Registration Page$")
	public void i_should_see_OverEighteenPlus_Check_box_displayed_on_Registration_Page()  {
	   
	}

	@Then("^I should see terms link within OverEighteenPlus Content displayed on Registration Page$")
	public void i_should_see_terms_link_within_OverEighteenPlus_Content_displayed_on_Registration_Page() {
	  
	}

	@Then("^I should see Privacy Policy link within OverEighteenPlus Content displayed on Registration Page$")
	public void i_should_see_Privacy_Policy_link_within_OverEighteenPlus_Content_displayed_on_Registration_Page() {
	    
	}

	@Then("^I should see Register Now Button displayed on Registration Page$")
	public void i_should_see_Register_Now_Button_displayed_on_Registration_Page()  {
	    
	}

	@Then("^I should see Compliance Text displayed below Register Now button on Registration Page$")
	public void i_should_see_Compliance_Text_displayed_below_Register_Now_button_on_Registration_Page()  {
	   
	}
	@Then("^I should navigate \"([^\"]*)\" to welcome page\\.$")
	public void i_should_navigate_to_welcome_page(String arg1) {
	    
	}
	@Then("^I should see BonusTerms and Condition pop-up displayed$")
	public void i_should_see_BonusTerms_and_Condition_pop_up_displayed() {
	   
	}
	@Then("^I should see no BonusTerms and Condition pop-up frame box$")
	public void i_should_see_no_BonusTerms_and_Condition_pop_up_frame_box()  {
	   
	}
	@Then("^I should see Terms and Condition pop-up displayed$")
	public void i_should_see_Terms_and_Condition_pop_up_displayed() {
	   
	}
	@Then("^I should see no Terms and Condition pop-up frame box$")
	public void i_should_see_no_Terms_and_Condition_pop_up_frame_box()  {
	   
	}
	@Then("^I should see Privacy Policy pop-up displayed$")
	public void i_should_see_Privacy_Policy_pop_up_displayed()  {
	   
	}

	@Then("^I should see no Privacy Policy pop-up frame box$")
	public void i_should_see_no_Privacy_Policy_pop_up_frame_box() {
	   
	}


}
