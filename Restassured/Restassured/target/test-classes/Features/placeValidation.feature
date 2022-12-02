@tag
Feature: Validation place Api
@tag1
Scenario: Verify if place is being Successfully added using AddPlaceApi
  Given Add Place Payload
  And some other precondition
  When user calls  "AddPlaceApi" with post http request
  Then the API call got success with status code 200
  And "status" in response body is "OK"
  And "scope" is response body is "APP"
