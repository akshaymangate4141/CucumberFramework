package com.ui.stepDefinations;

import com.constant.ConfigKey;
import com.ui.pages.DashboardPage;
import com.utils.TestUtil;
import io.cucumber.java.en.*;

import java.io.IOException;

public class LoginPageStepDef {

    private DashboardPage dp;
    @Given("user is on login page")
    public void user_is_on_login_page(){
        DriverFactory.getDriver().get(TestUtil.getValueFromPropertiesFile(ConfigKey.BASE_URL));
    }

    @Given("user enters login cred and sign in")
    public void user_enters_login_cred_and_sign_in() {
        try{
       dp= DriverFactory.getLoginPageInstance().doLogin();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("user is on dashboard page")
    public void user_is_on_dashboard_page() {

        System.out.println(dp.getDahboardPageUrl());
    }

}
