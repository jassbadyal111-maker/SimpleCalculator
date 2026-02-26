package com.example.simplecalculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(50, 50, 50, 50)

        val num1 = EditText(this)
        num1.hint = "First Number"

        val num2 = EditText(this)
        num2.hint = "Second Number"

        val button = Button(this)
        button.text = "Add"

        val result = TextView(this)
        result.textSize = 20f

        button.setOnClickListener {
            val n1 = num1.text.toString().toDoubleOrNull()
            val n2 = num2.text.toString().toDoubleOrNull()

            result.text = if (n1 != null && n2 != null) {
                "Result: ${n1 + n2}"
            } else {
                "Enter valid numbers"
            }
        }

        layout.addView(num1)
        layout.addView(num2)
        layout.addView(button)
        layout.addView(result)

        setContentView(layout)
    }
}
