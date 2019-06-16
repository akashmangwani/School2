package com.example.school2

import android.content.Intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.school2.ParentLoginActivity
import com.example.school2.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button_parent_sign_in.setOnClickListener{

            startActivity(Intent(this@LoginActivity, ParentLoginActivity::class.java))
        }

        button_teacher_sign_in.setOnClickListener{

            startActivity(Intent(this@LoginActivity, ParentLoginActivity::class.java))
        }
    }
}
