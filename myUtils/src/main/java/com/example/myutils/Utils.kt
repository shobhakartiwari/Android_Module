package com.example.myutils

import android.content.Context
import android.widget.Toast

class Utils {
    fun showToast(context: Context, toastMessage:String) {
        Toast.makeText(context,toastMessage,Toast.LENGTH_SHORT).show()
    }
}