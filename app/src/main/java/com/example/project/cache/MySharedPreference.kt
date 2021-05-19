package com.example.project.cache

import android.content.Context
import android.content.SharedPreferences

object MySharedPreference {
    private const val NAME = "KeshXotiraFayli"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var name : String
    get() = preferences.getString("name","")!!
    set(value) = preferences.edit{
        if(value != null)
            it.putString("name", value)
    }

    var number : String
        get() = preferences.getString("number","")!!
        set(value) = preferences.edit{
            if(value != null)
                it.putString("number", value)
        }
}