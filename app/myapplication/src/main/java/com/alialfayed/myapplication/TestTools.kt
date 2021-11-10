package com.alialfayed.myapplication

import android.content.Context
import android.widget.Toast

/**
 * Created by ( Eng Ali Al Fayed)
 * Class do :
 * Date 11/10/2021 - 4:34 AM
 */
class TestTools {

    fun setToast(con : Context){
        Toast.makeText(con , "" , Toast.LENGTH_LONG).show()
    }
}