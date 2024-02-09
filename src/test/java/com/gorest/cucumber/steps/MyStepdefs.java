package com.gorest.cucumber.steps;

import com.gorest.userandpostsinfo.PostsSteps;
import com.gorest.userandpostsinfo.UsersSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

public class MyStepdefs {
    static ValidatableResponse response;
    @Steps
    PostsSteps postsSteps;

    @Steps
    UsersSteps usersSteps;

    @When("User sends the GET request for getting information")
    public void  userSendsTheGETRequestForGettingInformation(int postId) {
        postsSteps.getPostByIdAndVerifyTitle(postId);

    }

    @Then("User must get back with a valid status code {int}")
    public void userMustGetBackWithAValidStatusCode(int statusCode) {
        response.statusCode(statusCode);
    }

    @When("User sends the GET request for getting user information")
    public void userSendsTheGETRequestForGettingUserInformation(int userId) {
        usersSteps.getUserInfoByName(userId);

    }

    @Then("User must be able to get status code {int}")
    public void userMustBeAbleToGetStatusCode(int statusCode) {
        response.statusCode(statusCode);
    }
}


