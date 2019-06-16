//package com.example.akash.school
//
//import android.content.Intent
//import android.os.Bundle
//import android.util.Patterns
//import androidx.appcompat.app.AppCompatActivity
//import com.example.school2.R
////import com.google.firebase.auth.FirebaseAuth
//import kotlinx.android.synthetic.main.activity_register.*
//
//class RegisterActivity : AppCompatActivity() {
//
//    private lateinit var mAuth : FirebaseAuth
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_register)
//
//        mAuth = FirebaseAuth.getInstance()
//
//        button_register.setOnClickListener{
//            val email = text_email_reg.text.toString().trim()
//            val password = edit_text_password_reg.text.toString().trim()
//
//            if(email.isEmpty()){
//                text_email_reg.error = "Email Required"
//                text_email_reg.requestFocus()
//                return@setOnClickListener
//            }
//
//            if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
//                text_email_reg.error = "Invaild Email Id"
//                text_email_reg.requestFocus()
//                return@setOnClickListener
//            }
//
//            if(password.isEmpty()){
//                edit_text_password_reg.error = "Email Required"
//                edit_text_password_reg.requestFocus()
//                return@setOnClickListener
//            }
//
//            registerUser(email, password)
//        }
//
//        text_view_login.setOnClickListener {
//
//              startActivity(Intent(this@RegisterActivity, ParentLoginActivity::class.java))
//        }
//    }
//
//    private fun registerUser(email: String, password: String) {
//
//        mAuth.createUserWithEmailAndPassword(email,password)
//                .addOnCompleteListener(this){ task ->
//                    if (task.isSuccessful) {
//                        login()
//                    } else {
//                        task.exception?.message?.let {
//                            toast(it)
//                        }
//                    }
//
//                }
//
//    }
//}
