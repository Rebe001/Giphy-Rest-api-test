# task 3: Automated api testing and test case generation

## Table of contents
* [Test Scenario Category](#test-scenario-category)
* [Test Action](#test-action)
* [How to run test case](#how-to-run-test-case)
* [Built with](#built-with)
* [Directory tree structure](#directory-tree-structure)
* [Author](#author)


##Test Scenario Category

Different test scenarios should be considered during test case design.
Requests to be done in isolation: only one param should be modified while leaving the rest of params has to be kept separately 

Basic positive testing (required fields)
Extended positive testing (optional fields)
Negative testing with valid input
Negative testing with invalid input
Destructive testing

##Test Action

All test cases should be verified by these test actions, both positive and negative testing. 
Verify http status code
Verify response payload
Verify error description is correct
Endpoint responds to expected status codes and valid json object and error messages if it fails. Schema should be validated, including field name, type and values.

## How to run test case
$ mvn clean
$ mvn install
$ run main method (to make sure connection went well)

run test case:
- run tests under path (test/java/com/example/testingweb)
- run in order:
  smokeTest 
  ExtendedPositiveTest
  InvalidInputNegativeTest
  Destructive Test
- click Run Test from each class or method

-test result is shown in console


   
## Built with
* Spring 
* Java 

## Directory tree structure
```
	└─ wallBox/
		├─ features/
		|	└─ component/
		|		└─TestFormPage.feature
		├─src/
		|	├─main/
		|	|    ├─java/example/testingweb/TestingWebApplication.java
		|	|    |
		|	|    └──resources/com/example/tstingweb/json/jsonResponse.json
		|	|	
		|	|		
		|	|	
		|	└─test
		|	    └─/java/com/example/testingweb
		|			├─CommonMethod.java
		|			├─DestructiveTest.java
		|			├─ExtendedPostiveTest.java
		|		        ├─InvalidInputNegativeTest
		|		        ├─ProjectConstants
		└─readMe.txt            └─SmokeTest
``` 




## Author
* Contributor: Rebecca
* Date: 28/08/2020