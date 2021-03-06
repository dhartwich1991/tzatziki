package io.apptik.bddexample.test.feature;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.apptik.bddexample.MainActivity;
import io.apptik.bddexample.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class FirstGlues {

    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity
            .class);

    public FirstGlues() {
    }

    @Before
    public void setUp() {
        mActivityTestRule.launchActivity(null);
    }

    @Given("^there is have a rule$")
    public void there_is_have_a_rule() throws Throwable {
        ViewInteraction overflowMenuButton = onView(
                allOf(withContentDescription("More options"), isDisplayed()));
        overflowMenuButton.perform(click());

        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.title), withText("Settings"), isDisplayed()));
        appCompatTextView.perform(click());

        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.fab), isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction imageButton = onView(
                allOf(withId(R.id.fab), isDisplayed()));
        imageButton.check(matches(isDisplayed()));

    }
    @When("^we tap on a button$")
    public void we_tap_on_a_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("^we should see the rule$")
    public void we_should_see_the_rule() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


}
