package com.project.exp6

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Basic Views
        val etName = findViewById<EditText>(R.id.etName)
        val etUSN = findViewById<EditText>(R.id.etUSN)
        val etEmail = findViewById<EditText>(R.id.etEmail)

        val spinnerCourse = findViewById<Spinner>(R.id.spinnerCourse)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

        val checkProgramming = findViewById<CheckBox>(R.id.checkProgramming)
        val checkDatabase = findViewById<CheckBox>(R.id.checkDatabase)
        val checkWeb = findViewById<CheckBox>(R.id.checkWeb)

        val switchNotification = findViewById<Switch>(R.id.switchNotification)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnClear = findViewById<Button>(R.id.btnClear)

        // Spinner data
        val courses = arrayOf(
            "Select Course",
            "MCA",
            "BCA",
            "B.Sc Computer Science",
            "B.Tech Computer Science",
            "MBA"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            courses
        )

        spinnerCourse.adapter = adapter

        // Submit button
        btnSubmit.setOnClickListener {

            val name = etName.text.toString().trim()
            val usn = etUSN.text.toString().trim()
            val email = etEmail.text.toString().trim()

            if (name.isEmpty()) {
                etName.error = "Enter your name"
                etName.requestFocus()
                return@setOnClickListener
            }

            if (usn.isEmpty()) {
                etUSN.error = "Enter your USN"
                etUSN.requestFocus()
                return@setOnClickListener
            }

            if (email.isEmpty()) {
                etEmail.error = "Enter your email"
                etEmail.requestFocus()
                return@setOnClickListener
            }

            val course = spinnerCourse.selectedItem.toString()

            if (course == "Select Course") {
                Toast.makeText(
                    this,
                    "Please select a course",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            // RadioButton
            val selectedRadioId = radioGroup.checkedRadioButtonId

            if (selectedRadioId == -1) {
                Toast.makeText(
                    this,
                    "Please select your year",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            val selectedRadio =
                findViewById<RadioButton>(selectedRadioId)

            // CheckBox values
            val interests = mutableListOf<String>()

            if (checkProgramming.isChecked) {
                interests.add("Programming")
            }

            if (checkDatabase.isChecked) {
                interests.add("Database")
            }

            if (checkWeb.isChecked) {
                interests.add("Web Development")
            }

            val interestText = if (interests.isEmpty()) {
                "No interests selected"
            } else {
                interests.joinToString(", ")
            }

            // Switch value
            val notifications =
                if (switchNotification.isChecked) {
                    "Enabled"
                } else {
                    "Disabled"
                }

            // Display result
            val message = """
                Profile Submitted Successfully!

                Name: $name
                USN: $usn
                Course: $course
                Year: ${selectedRadio.text}
                Interests: $interestText
                Notifications: $notifications
            """.trimIndent()

            Toast.makeText(
                this,
                message,
                Toast.LENGTH_LONG
            ).show()
        }

        // Clear button
        btnClear.setOnClickListener {

            etName.text.clear()
            etUSN.text.clear()
            etEmail.text.clear()

            spinnerCourse.setSelection(0)

            radioGroup.clearCheck()

            checkProgramming.isChecked = false
            checkDatabase.isChecked = false
            checkWeb.isChecked = false

            switchNotification.isChecked = false

            Toast.makeText(
                this,
                "Form cleared",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}