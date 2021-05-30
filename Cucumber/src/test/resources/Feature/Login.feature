Feature: queue codes login page test cases

Scenario: To validate Dashboard Page user enter valid credentials

Given to enter valid userName "queuecodes@gmail.com"
And to enter valid password "123456"
When to click on the sign in button
Then to Validate the dashboard page title  "Queue Codes | Dashboard"
