Feature: Verify that user can creat an account on Talan


  @backgroud
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    When user is on login page
    And user enter his email<email>
    And user enters his password<password>
    Then user is on dashbord page

    Examples: 
      | email                   | password     |
      | ines.masmoudi@talan.com | DmbDBgDbHT95 |

  Scenario Outline: user is able to modify his profils data
    Given user is on his dashbord
    When user clicks on his profil
    And user delet his old data
    And user enters his new data <name>  and <familyname> and <birthday> and <phonenumber> and <town>
    And user clicks on submit
    Then user get confirmation of his data modification

    Examples: 
      | name  | familyname | birthday | phonenumber | town |
      | inessss | masssmoudi | 07081991 |    21240226 | Sfax |

  
  Scenario: user is able to check his old sessions courses ressources
    Given old session link is displayed
    When user clicks on his old sessions link
    And user clicks on view the course
    And user clicks on a module number
    And user clicks on a course number
    And user clicks on resources
    Then user get lessons title displayed
