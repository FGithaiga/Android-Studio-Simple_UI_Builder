package com.example.simple_ui_builder
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Link the Kotlin file to our XML design layout
        setContentView(R.layout.activity_main)

        // Find and bind our layout elements by their XML IDs
        val textTitle = findViewById<TextView>(R.id.textTitle)
        val inputName = findViewById<EditText>(R.id.inputName)
        val buttonUpdate = findViewById<Button>(R.id.buttonUpdate)

        // Set a click listener onto the button element
        buttonUpdate.setOnClickListener {
            // Read the text typed by the user inside the EditText field
            val enteredText = inputName.text.toString()

            // Check if the input is not empty to avoid saving blank spaces
            if (enteredText.isNotEmpty()) {
                // Edit the content of the TextView dynamically
                textTitle.text = "Welcome, $enteredText!"

                // Clear the input field text content for a clean look
                inputName.text.clear()
            } else {
                // Provide visual feedback if the input field is empty
                inputName.error = "Name cannot be empty"
            }
        }
    }
}
