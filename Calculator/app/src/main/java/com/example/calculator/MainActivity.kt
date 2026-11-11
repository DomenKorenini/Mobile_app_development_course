package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val display = findViewById<EditText>(R.id.input_display)

        val one = findViewById<Button>(R.id.one)
        val two = findViewById<Button>(R.id.two)
        val three = findViewById<Button>(R.id.three)
        val four = findViewById<Button>(R.id.four)
        val five = findViewById<Button>(R.id.five)
        val six = findViewById<Button>(R.id.six)
        val seven = findViewById<Button>(R.id.seven)
        val eight = findViewById<Button>(R.id.eight)
        val nine = findViewById<Button>(R.id.nine)
        val zero = findViewById<Button>(R.id.zero)
        val dot = findViewById<Button>(R.id.dot)
        val plus = findViewById<Button>(R.id.plus)
        val minus = findViewById<Button>(R.id.minus)
        val divide = findViewById<Button>(R.id.devide)
        val equals = findViewById<Button>(R.id.equals)
        val clear = findViewById<Button>(R.id.clear)

        one.setOnClickListener { display.append("1") }
        two.setOnClickListener { display.append("2") }
        three.setOnClickListener { display.append("3") }
        four.setOnClickListener { display.append("4") }
        five.setOnClickListener { display.append("5") }
        six.setOnClickListener { display.append("6") }
        seven.setOnClickListener { display.append("7") }
        eight.setOnClickListener { display.append("8") }
        nine.setOnClickListener { display.append("9") }
        zero.setOnClickListener { display.append("0") }
        dot.setOnClickListener { display.append(".") }
        plus.setOnClickListener { display.append("+") }
        minus.setOnClickListener { display.append("-") }
        divide.setOnClickListener { display.append("/") }
        equals.setOnClickListener { display.append("=") }

        clear.setOnClickListener { display.setText("") }
    }
}