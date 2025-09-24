package com.ui.stepDefinations;

import com.constant.ConfigKey;
import com.utils.TestUtil;
import io.cucumber.java.en.*;

import java.io.IOException;

public class LoginPageStepDef {

    @Given("user is on login page")
    public void user_is_on_login_page(){
        DriverFactory.getDriver().get(TestUtil.getValueFromPropertiesFile(ConfigKey.BASE_URL));
    }

    @Given("user enters login cred and sign in")
    public void user_enters_login_cred_and_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user is on dashboard page")
    public void user_is_on_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
