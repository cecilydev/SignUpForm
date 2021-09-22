package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val register = findViewById<Button>(R.id.button)
        val name = findViewById<TextView>(R.id.TextPersonName)
        val email = findViewById<TextView>(R.id.EmailAddress)
        val password = findViewById<TextView>(R.id.Password)
        val passwordConf = findViewById<TextView>(R.id.PasswordConfirm)


        register.setOnClickListener {
            var complete = true
            if (name.text.isEmpty()){
                name.error="Need to input name"
                complete = false
            }
            if (email.text.isEmpty()){
                email.error="Need to input email"
                complete = false
            }
            if (password.text.isEmpty()){
                password.error="Need to input password"
                complete = false
            }
            if (passwordConf.text.isEmpty()) {
                passwordConf.error="Need to reenter password"
                complete = false
            }
            if (password.text.toString() == passwordConf.text.toString() && complete) {
                val message = "Welcome, " + name.text + ", to the SignUpForm App"
                Toast.makeText(this@FormActivity, message, Toast.LENGTH_SHORT).show()
            } else if (complete) {
                passwordConf.error = "Password entries do not match"
            }


        }


    }
}