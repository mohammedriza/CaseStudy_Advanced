Feature: Reqres API Test

  @Functional
  Scenario Outline: Validate Reqres Api With valida headers and user not found
    Given I call the reqres login API with credentials "<Email>" and "<Password>" and "<ApiKey>"
    Then I verify the response code is "<ResponseCode>" and error message is "<ErrorMessage>"
    Examples:
      | Email          | Password | ApiKey         | ResponseCode | ErrorMessage   |
      | test@gmail.com | test     | reqres-free-v1 | 400          | user not found |

  @Functional
  Scenario Outline: Validate Reqres Api With Missing Api Key
    Given I call the reqres login API with credentials "<Email>" and "<Password>" and "<ApiKey>"
    Then I verify the response code is "<ResponseCode>" and error message is "<ErrorMessage>"
    Examples:
      | Email          | Password | ApiKey | ResponseCode | ErrorMessage     |
      | test@gmail.com | test     |        | 401          | Missing API key. |

  @Functional
  Scenario Outline: Validate Reqres Api With Invalid Api Key
    Given I call the reqres login API with credentials "<Email>" and "<Password>" and "<ApiKey>"
    Then I verify the response code is "<ResponseCode>" and error message is "<ErrorMessage>"
    Examples:
      | Email          | Password | ApiKey           | ResponseCode | ErrorMessage     |
      | test@gmail.com | test     | reqres-free-v123 | 401          | Invalid API key. |