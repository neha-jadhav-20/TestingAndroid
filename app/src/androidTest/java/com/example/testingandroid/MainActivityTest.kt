package com.example.testingandroid

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.Assert.*

class MainActivityTest {

    // create rule

    @get:Rule
    val testRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test
    fun testLayout(){

        testRule.scenario.onActivity {

            val tv = it.findViewById<TextView>(R.id.tv)
            assertNotNull(tv)

            val nameEditText = it.findViewById<EditText>(R.id.nameE)
            assertNotNull(nameEditText)

            val okButton = it.findViewById<Button>(R.id.button)
            assertNotNull(okButton)

            val tvText = tv.text.toString()
            val name = nameEditText.text.toString()

            assertNotNull("Helle World!", tvText)
            assertNotNull("",name)

            val inBtnClickable = okButton.isEnabled
            assertTrue(inBtnClickable)

        }
    }

    @Test
    fun testButtonClick(){

        testRule.scenario.onActivity {

            it.findViewById<EditText>(R.id.nameE).setText("John")
            it.findViewById<Button>(R.id.button).performClick()

            val tvText = it.findViewById<TextView>(R.id.tv).text.toString()
            assertEquals("Hello John", tvText)

        }
    }

}
