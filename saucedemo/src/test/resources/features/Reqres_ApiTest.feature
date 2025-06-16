Feature: Reqres API Test


  Scenario Outline: Validate Reqres Api With valida headers and user not found
    Given I call the reqres API invalid credentials and validate the response code is "<ResponseCode>" and error message is "<ErrorMessage>"
    Examples:
      | ResponseCode | ErrorMessage   |
      | 400          | user not found |


  Scenario Outline: Validate Reqres Api With Missing Api Key
    Given I call the reqres API with missing API key and validate the response code is "<ResponseCode>" and error message is "<ErrorMessage>"
    Examples:
      | ResponseCode | ErrorMessage     |
      | 401          | Missing API key. |


  Scenario Outline: Validate Reqres Api With Invalid Api Key
    Given I call the reqres API with invalid API key and validate the response code is "<ResponseCode>" and error message is "<ErrorMessage>"
    Examples:
      | ResponseCode | ErrorMessage     |
      | 401          | Invalid API key. |