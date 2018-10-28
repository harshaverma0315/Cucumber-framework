Feature: Application login

Scenario: Homepage default login
Given user is on banking landing page
When user login into application with "jin" and "p1"
Then Homepage is populated
And Credit details are "true"

Scenario: Web Homepage default login
Given user is on banking landing page
When user login into application with "jane" and "p2"
Then Homepage is populated
And Credit details are "false"