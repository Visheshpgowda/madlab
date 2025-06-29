package com.example.myapplication


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    private val fruits = arrayOf("apple", "banana", "cherry", "date", "grape", "uday is gay", "kiwi", "mango")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KOTT"
        val autoTextView: AutoCompleteTextView = findViewById(R.id.autoCompleteTextView)
        val adapter : ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.select_dialog_item, fruits)
        autoTextView.threshold = 1
        autoTextView.setAdapter(adapter)
    }
}