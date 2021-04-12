Feature: Searching of various caregories should be possible along with product search

Scenario:Search the products under Books categories
Given I visit the website as guest user
When I select the books option from the dropdown
And I clicked on search icon
Then I should see the books page loaded 
And I should see Books At Amazone as heading
But I should not see other categories products 

Scenario: Search for products under baby categories
Given I visit the website as guest user
When I select baby option from the drop down 
And I clicked on search icon 
Then I should see the baby page loaded 
And I should see Offers on Baby products as heading 
But I should not see other categories products 