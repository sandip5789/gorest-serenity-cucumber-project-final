Feature: Testing different request on the gorest serenity cucumber app

  Scenario: Verify the title by getting single post by id
    When    User sends the GET request for getting information
    Then    User must get back with a valid status code 200

  Scenario: Verify the user information by name
    When    User sends the GET request for getting user information
    Then    User must be able to get status code 200