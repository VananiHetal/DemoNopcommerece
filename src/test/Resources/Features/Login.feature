@login

  Feature: User should not be able to login with invalid credential
    Scenario Outline: User should not be able to login with invalid credential.

      Given user is on loginpage
      When user enters invalid "<Email>" or "<password>"
      Then user should able to see "<error message>"

      Examples:

      |Email         |password   |error message|
      |heta@gmail.com|ramram1|No customer account found|
      |hetal11@gmail.com|ramram1|No customer account found|
      |heta@gmail.com  |ramram |No customer account found|
      |           |ramram |Please enter your email|
      |                |ramram1|Please enter your email|
      |hetal11@gmail.com|      |No customer account found|
     |heta@gmail.com   |      |No customer account found|
     |                 |       |Please enter your email|



