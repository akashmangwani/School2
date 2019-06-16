package com.example.school2

import android.content.Intent
//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
//import com.example.school2.RegisterActivity
import com.example.school2.UserInfo
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_parent_login.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream

class ParentLoginActivity : AppCompatActivity() {

    //private lateinit var mAuth: FirebaseAuth
    var array = arrayListOf<String>()
    var user: UserInfo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent_login)
        readJson()


        //mAuth = FirebaseAuth.getInstance()

        button_sign_in.setOnClickListener {
            val username = text_email.text.toString().trim()
            val password = edit_text_password.text.toString().trim()

            if (username.isEmpty()) {
                text_email.error = "Email Required"
                text_email.requestFocus()
                return@setOnClickListener
            }

//            if (!Patterns.EMAIL_ADDRESS.matcher(username).matches()) {
//                text_email.error = "Invaild Email Id"
//                text_email.requestFocus()
//                return@setOnClickListener
//            }

            if (password.isEmpty()) {
                edit_text_password.error = "Email Required"
                edit_text_password.requestFocus()
                return@setOnClickListener
            }

//            saveUser()
            loginUser(username, password)

        }
//        text_view_register.setOnClickListener {
//            startActivity(Intent(this@ParentLoginActivity, RegisterActivity::class.java))
//        }

    }


    private fun readJson() {

        var json: String? = null
        try {
            val inputStream: InputStream = assets.open("userinfo.json")
            json = inputStream.bufferedReader().use { it.readText() }
            var jsonObj  = JSONObject(json)


             user = UserInfo(jsonObj.getString("username"),
                    jsonObj.getString("firstName"),
                    jsonObj.getString("lastName"),
                    jsonObj.getBoolean("isStaff"),
                    jsonObj.getString("designation"),
                    jsonObj.getString("id")
                    )
            print(user?.username + user?.firstname + user?.lastname + "\n" + user?.id )

            try{
                print( "\n" + user?.des )
            }
            catch (ex: IOException)
            {
                print( "ERROR IN DES " )
                print(ex.stackTrace)
            }



        } catch (e: IOException) {

        }


    }

    private fun saveUser() {

//        val username = text_email.text.toString().trim()
//        val password = edit_text_password.text.toString().trim()
//        //val ref =  FirebaseDatabase.getInstance().getReference("users")
//        //val userId = ref.push().key
//        val userinfo = UserInfo(username, password )
//
//        ref.child(userId).setValue(userinfo)
//                .addOnCompleteListener(this) { task ->
//                    if (task.isSuccessful) {
//                        toast("User Registered")
//
//                    }
//                }
    }


    private fun loginUser(email: String, password: String) {



//        var user: UserInfo = UserInfo(jsonObj.getString("username")
        if (user?.username == "akash"){
            login()
        }


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


//        for (i in 0..array.size) {
//            if (array[i] == "akash") {
//                login()
//            }
//        }


    }
}