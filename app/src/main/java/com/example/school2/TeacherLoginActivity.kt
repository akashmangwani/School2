//package com.example.akash.school
//
//import android.content.Intent
//import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
//import android.util.Patterns
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.database.FirebaseDatabase
//import kotlinx.android.synthetic.main.activity_teacher_login.*
//
//class TeacherLoginActivity : AppCompatActivity() {
//
//    private lateinit var mAuth: FirebaseAuth
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_parent_login)
//
//
//        mAuth = FirebaseAuth.getInstance()
//
//        button_teacher_sign_in_s2.setOnClickListener {
//            val email = text_email_teacher.text.toString().trim()
//            val password = edit_text_password_teacher.text.toString().trim()
//
//            if (email.isEmpty()) {
//                text_email_teacher.error = "Email Required"
//                text_email_teacher.requestFocus()
//                return@setOnClickListener
//            }
//
//            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
//                text_email_teacher.error = "Invaild Email Id"
//                text_email_teacher.requestFocus()
//                return@setOnClickListener
//            }
//
//            if (password.isEmpty()) {
//                edit_text_password_teacher.error = "Password Required"
//                edit_text_password_teacher.requestFocus()
//                return@setOnClickListener
//            }
//
//            saveUser()
//            loginUser(email, password)
//
//        }
//        text_view_register_teacher.setOnClickListener {
//            startActivity(Intent(this@TeacherLoginActivity, RegisterActivity::class.java))
//        }
//
//    }
//
//    private fun saveUser() {
//
//        val email = text_email_teacher.text.toString().trim()
//        val password = edit_text_password_teacher.text.toString().trim()
//        val ref =  FirebaseDatabase.getInstance().getReference("users")
//        val userId = ref.push().key
//        val userinfo = UserInfo(email, password)
//
//        ref.child(userId).setValue(userinfo)
//                .addOnCompleteListener(this) { task ->
//                    if (task.isSuccessful) {
//                        toast("User Registered")
//
//                    }
//                }
//    }
//
//
//    private fun loginUser(email: String, password: String) {
//
//        mAuth.signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this) { task ->
//                    if (task.isSuccessful) {
//                        login()
//                    } else {
//                        task.exception?.message?.let {
//                            toast(it)
//                        }
//                    }
//
//                }
//    }
//}