Feature: User Should be able to Navigate to Registeration Page and Register 


@Register
Scenario: Validating Elements displayed on Registration Page.
Given I navigate to the Registrationpage on "<browser>" 
Then  I should see Register on the Register form
 And  I should Email Input box displayed on Registration page 
 And  I should see Password Input box displayed on Registration page
 And  I should see Useranme Input box displayed on Registration Page
 And  I should see ScreenName Input box displayed on Registration Page
 And  I should see FirstName Input box displayed on Registration Page
 And  I should see Surname Input box displayed on Registration Page
 And  I should see Date of Birth Day Dropdown box displayed on Registration Page
 And  I should see Date of Birth Month Dropdown box displayed on Registration Page
 And  I should see Date of Birth Year Dropdown box displayed on Registration Page
 And  I should see Gender Radio Buttons displayed on Registration Page
 And  I should see Country Input box displayed on Registration Page
 And  I should see Currency Input box displayed on Registration Page
 And  I should see House Number Input box displayed on Registration Page
 And  I should see Find Address button displayed on Registration Page
 And  I should see Country Code dropdown box displayed on Registration Page
 And  I should see Contact Number Input box displayed on Registration Page
 And  I should see Deposit Limit Type Input box displayed on Registration Page
 And  I should see Deposit Limit Amount Dropdown box displayed on Registration Page
 And  I should see Free Bonuses and Offer Check box checked displayed on Registration Page 
 And  I should see OverEighteenPlus Check box displayed on Registration Page 
 And  I should see terms link within OverEighteenPlus Content displayed on Registration Page 
 And  I should see Privacy Policy link within OverEighteenPlus Content displayed on Registration Page 
 And  I should see Register Now Button displayed on Registration Page
	
	
@ignore 
@Register 
Scenario Outline: Registration with Invalid Data 
	Given I navigate to the Registrationpage on "<browser>" 
	When I enter regUsername as "<username>" 
	And I enter RegPassword as "<password>" 
	And I enter RegConfirmPassword as "<ConfPass>" 
	And I enter a RegScreenName as "<screenName>" 
	And I enter RegEmail as "<E-mail>" 
	And I enter RegFirstName as "<firstName>" 
	And I enter RegSurName as "<surname>" 
	And I enter RegDOBDay as "<Day>" 
	And I enter RegDOBMonth as "<Month>" 
	And I enter RegDOBYear as "<Year>" 
	And I click Gender Type as Female
	And I enter Country as "<country>"
	And I enter Currency as "<CurrencyType>"
	And I click on RegClickHere 
	And I enter RegAddress as "<Address>" 
	And I enter RegTown as "<Town>" 
	And I enter RegCounty as "<county>" 
	And I enter RegPostCode as "<Postcode>" 
	And I enter RegContactNum as "<contactNumber>" 
	# And I click on deposit limit click here link
	# And I enter Choose Type as "<TypeLimit>"
	# And I enter Choose limit as "<ChooseLimit>"
	And I click on RegT$CCheckBox 
	And I click on RegSubmitButton 
	Then I should see Error Messsage displayed on Register Page 

	Examples: 
		|browser|username    			 |password 		        |ConfPass 				|screenName   			|E-mail                |firstName  |surname   |Day  |Month| country  | CurrencyType    |Year |Address             |Town                                              |county 										   |Postcode |contactNumber    |TypeLimit    | ChooseLimit 		 |expectedResult	|
		|Mozilla|mmm12                   |MNNH$1                |MNNH$2                 |mmm12                  |test@playtec.com      |MJHGF-12   |MNHGF     |3    |OCT  |	 Poland  |  GBP 		   |1980 |8, silverthorne     |London                                            |l                                                 |SW8 3HE  |0203700700       |             |                   |FAILURE         |
		|Chrome |NNNNNNNNNNNNNNNNNNNNN1  |GGGGGGGGGGGGGGGGGGGG1 |GGGGGGGGGGGGGGGGGGGG1  |1234543212             |test@playtec.com      |GHJUYT'S   |AGGTR'S   |3    |OCT  |	Sweden	 |  Euro		   |1980 |8//                 |L                                                 |Greater LONDON                                    |SW8 3HE  |0207000100       |             |                   |FAILURE         |
		|Mozilla|markge                  |12345678              |12345678               |GGGGGGGGGGGGGGGGGGGG1  |test@playtec.com      |AGRT BG    |HJUUT12   |3    |OCT  | Latvia	 |  Dollar         |1980 |8%                  |london1                                           |Greatest of LONDON area of united kingdon europes |SW8 3HE  |0207001000       |             |                   |FAILURE         |
		|Chrome |12345678                |ADSERTYG              |ADSERTYG               |ASEDCFREEE             |test@playtec.com      |           |ASEDDR    |3    |OCT  |  Canada  |	 GBP           |1980 |8,silverthorne      |Greatest of LONDON area of united kingdon europes |Greatest of LONDON area of united kingdon europes |         |0207100600       |             |                   |FAILURE         |
		|Mozilla|                        |lookjng£*^            |lookjng£*^             |makomi1lbugo           |                      |asderty    |          |3    |OCT  |  Norway  | 	 Euro          |1980 |                    |london                                            |London                                            |         |0207100601       |             |                   |FAILURE         |
		|Mozilla|Snetplay-TV             |££££££££££>           |££££££££££>            |adsggtt444^$£          |temmtt                |add*add    |122asa^   |23   |Jun  |	Germany	 |	 GBP		   |2018 |£80                 |London&&&                                         |1234555                                           |SW8 3HE  |++U13234803556000|             |                   |FAILURE         |
		|Chrome |123456£1                |$$$$$%%1a             |$$$$$%%1a              |makomi1lbugo           |testplaytech.com      |adde$)     |&$£agas   |3    |  	  | Finland  |  Dollar         |2015 |8                   |greater3LONDON                                    |                                                  |         |                 |             |                   |FAILURE         |
		|Chrome |{generator}             |Manjuyt               |Manjuyt                |{generator}            |l@.com                |           |          |3    |OCT  |          |  GBP			   |1980 |80                  |SDDDD                                             |LONDON                                            |SW8 %67  |9191GGSS         |             |                   |FAILURE         |
		|Mozilla|ScreenName1             |Bola123$%^            |Bola123$%^             |ScreenName1            |test@playtech.com     |nav        |look	  |3    |OCT  |	Canada	 |		 		   |1980 |80                  |London                                            |London                                            |SW8 3HE  |02071006020      |             |                   |FAILURE         |
		|Mozilla|Snetplaytv$%            |Looking/>             |Looking/>              |yahoonnana             |£££test@playtech.com  |           |lao@      |3    |OCT  |	Finland	 |    Dollar       |2001 |                    |LONDON%#                                          |Surrey-london                                     |SW8 3HE+8|london01         |             |                   |FAILURE         |
		|Chrome |{generator}    		 |Bola123$%^            |Bola123$%^         	|{generator}            | test@playtech.com    |Caroline   |Paris     |06   | OCT |  Canada  |    GBP          |1982 | 6 goodhew Road     |Croydon         									 |surrey                							|CR0 6JX  |020700070100	    |Daily	      |£1000		      |FAILURE         | 
		
		
		#@ignore
		@Register 
		Scenario Outline: Registration with valid Data 
			Given I navigate to the Registrationpage on "<browser>" 
			When I enter regUsername as "<username>" 
			And I enter RegPassword as "<password>" 
			And I enter RegConfirmPassword as "<ConfPass>" 
			And I enter a RegScreenName as "<screenName>" 
			And I enter RegEmail as "<E-mail>" 
			And I enter RegFirstName as "<firstName>" 
			And I enter RegSurName as "<surname>" 
			And I enter RegDOBDay as "<Day>" 
			And I enter RegDOBMonth as "<Month>" 
			And I enter RegDOBYear as "<Year>" 
			And I click Gender Type as Female
			And I enter Country as "<country>"
			And I enter Currency as "<CurrencyType>"
			And I click on RegClickHere 
			And I enter RegAddress as "<Address>" 
			And I enter RegTown as "<Town>" 
			And I enter RegCounty as "<county>" 
			And I enter RegPostCode as "<Postcode>" 
			And I enter RegContactNum as "<contactNumber>" 
			And I click on deposit limit click here link 
			And I enter Choose Type as "<TypeLimit>" 
			And I enter Choose limit as "<ChooseLimit>" 
			And I click on RegT$CCheckBox 
			And I click on RegSubmitButton 
			Then I should navigate "<expectedResult>" to welcome page. 
			
			Examples: 
				|browser|username    			 |password 		        |ConfPass 				|screenName   			|E-mail                |firstName  |surname   |Day  |Month| country  		 | CurrencyType    |Year |Address             |Town                                              |county 										   |Postcode |contactNumber    |TypeLimit    | ChooseLimit 		 |expectedResult	|
				|Chrome |{generator}     		 |Bola123$%^            |Bola123$%^             |{generator}            | test@playtech.com    |Caroline   |Paris     |06   | OCT | United Kingdom   |    GBP          |1982 | 6 goodhew Road     |Croydon         									 |surrey                							|CR0 6JX  |020700070100	    |Daily	      |£1000		      |FAILURE         | 
				
				

#@ignore	
@Register 
Scenario: Clicking on BonusTerms And Wagering Requirement link 
Given I navigate to the Registrationpage on "browser" 
When I click on BonusTerms and Wagering link 
Then I should see BonusTerms and Condition pop-up displayed 
							
#@ignore	
@Register 
Scenario: Clicking on Close Icon within the Bonus terms frame box 
Given I navigate to the Registrationpage on "browser" 
When I click on BonusTerms and Wagering link 
And I click on the Close icon within Bonus Term Frame box 
Then I should see no BonusTerms and Condition pop-up frame box 
							
#@ignore		
@Register 
Scenario: Clicking on Over18Terms link 
Given I navigate to the Registrationpage on "browser" 
When I click on  OverEighteen Terms link 
Then I should see Terms and Condition pop-up displayed 
						
						
#@ignore		
@Register 
Scenario: Clicking on Close icon on Over18Term and Condition Frame Box 
Given I navigate to the Registrationpage on "browser" 
When I click on  OverEighteen Terms link 
And I click on the Close icon within the Frame box 
Then I should see no Terms and Condition pop-up frame box 
						
						
#@ignore		
@Register 
Scenario: Clicking on OverEighteen Privacy Policy link 
Given I navigate to the Registrationpage on "browser" 
When I click on  OverEighteen Privacy Policy link 
Then I should see Privacy Policy pop-up displayed 
							
#@ignore
@Register 
Scenario: Clicking on Close icon on Over18Term and Condition Frame Box 
Given I navigate to the Registrationpage on "browser" 
When I click on  OverEighteen Privacy Policy link 
And I click on the Close icon within the Frame box 
Then I should see no Privacy Policy pop-up frame box
								
		