package com.example.testingandroid


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.hamcrest.Matchers.allOf
import org.junit.Ignore
import org.junit.Rule
import org.junit.Test


class MainActivityTestEspresso {

    @get:Rule
    val testRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test
    fun testLayout() {

        onView(withId(R.id.tv)).check(matches(withText("Hello World!")))

        onView(withId(R.id.nameE)).check(matches(withText("")))

        onView(withText("OK")).check(matches(isClickable()))

    }

    @Ignore
    @Test
    fun testButtonClick() {
        onView(withId(R.id.nameE))
            .perform(ViewActions.typeText("Capgemini"))

        onView(withText("OK"))
            .perform(ViewActions.click())

        onView(withId(R.id.tv))
            .check(matches(withText("Hello Capgemini")))

        onView(withId(R.id.nameE)).check(matches(withText("")))
    }

    @Test
    fun testNavigation(){
        onView(withId(R.id.nameE))
            .perform(ViewActions.typeText("Robert"))

        onView(withText("OK"))
            .perform(ViewActions.click())

//        onView(withText("Robert"))               // check is anything is displayed on second screen
//            .check(matches(isDisplayed()))

        onView(withId(R.id.msgT))    // all of is used  for more than one conditions
            .check(matches(allOf(withText("Robert"), isDisplayed())))

    }


}