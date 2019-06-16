package com.example.school2

import android.content.Context
import android.content.Intent
import android.webkit.ConsoleMessage
import android.widget.Toast

/**
 * Created by Akash on 15-06-2019.
 */
fun Context.toast(message: String) =
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

fun Context.login(){
        val intent = Intent(this, HomeActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        startActivity(intent)
}