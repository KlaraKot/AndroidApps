package com.example.calculator



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {


    lateinit var textInput: TextView //referenced to TextView (in textInput will be given our input from buttons)
    var digit: Boolean = false //if the last press button was digit
    var state: Boolean = false//info if

    //To specify an action when the button is pressed, set a click listener on the button object in the corresponding activity code:
    /*
    The snippet creates an instance of android.view.View.OnClickListener and wires the listener to the button using setOnClickListener(View.OnClickListener).
    As a result, the system executes the code you write in functions after the user presses the button.

     source: developer.android.com
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textInput = findViewById(R.id.textInput)
    }


//Digits (0,1,2,3,4,5,6,7,8,9)
    fun onDigit(view: View) {
        if (state) {
            textInput.text = (view as Button).text
            state = false
        } else {
            textInput.append((view as Button).text)
        }
        digit = true
    }


    fun onOperator(view: View) {
        if (digit && !state) {
            textInput.append((view as Button).text)
            digit = false
        }
    }

// to clear
    fun onClear(view: View) {
        this.textInput.text = ""
        digit = false
        state = false
    }

    //for operator "=", calculations using exp4j
    fun onEqual(view: View) {

        if (digit && !state) {

            val txt = textInput.text.toString()

            val expression = ExpressionBuilder(txt).build()
            try {
                val result = expression.evaluate()
                textInput.text = result.toString()

            } catch (ex: ArithmeticException) {
                textInput.text = "Error"
                state = true
                digit = false
            }
        }
    }

}