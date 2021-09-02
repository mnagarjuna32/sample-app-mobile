package com.qa.stepdef;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

        @When("^I am in the homepage$")
        public void iAmInTheHomepage() {
        }
//        @And("^I am tapping on the allow Once button$")
//        public void iAmTappingOnTheAllowOnceButton() {
//            new HomePage().pressAllowOnce();
//        }
//        @And("I am tapping on the allow button")
//        public void iAmTappingOnTheAllowButton() {
//            new HomePage().pressAllow();
//        }
        @And("Navigating to the myaccount screen")
        public void navigatingToTheMyaccountScreen() throws InterruptedException {
            Thread.sleep(2000);
            new HomePage().pressProfileBtn();
        }
        @And("I tapped on login button")
        public void iTappedOnLoginButton() {
            new HomePage().loginbtn();
        }

        @Then("Login screen appears")
        public void loginScreenAppears() {
        }
        @When("^I enter username as \"([^\"]*)\"$")
        public void iEnterUsernameAs(String username) throws InterruptedException {
            new LoginPage().enterUserName(username);
        }
        @When("^I enter password as \"([^\"]*)\"$")
        public void iEnterPasswordAs(String password) {
            new LoginPage().enterPassword(password);
        }

        @When("^I login$")
        public void iLogin() {
            new LoginPage().pressLoginBtn();
        }

        @Then("^login should fail with an error \"([^\"]*)\"$")
        public void loginShouldFailWithAnError(String err) {
            Assert.assertEquals(new LoginPage().getErrTxt(), err);
        }

        @Then("^I should see Products page with title \"([^\"]*)\"$")
        public void iShouldSeeProductsPageWithTitle(String title) {
            Assert.assertEquals(new MyAccountPage().getTitle(), title);
        }
}
