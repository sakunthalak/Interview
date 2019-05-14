Feature: Verify the vehicle exists in vwfsinsuranceportal

Verify the website to checks to see if a vehicle

  Scenario: Validate DealerPortal Home Page
   
    Given Open the Chrome and Launch the application 
    
    Then validate user is on homepage
    Then user enter vehicle reg number and clicks find
    
    Then verifies vehicle exists  