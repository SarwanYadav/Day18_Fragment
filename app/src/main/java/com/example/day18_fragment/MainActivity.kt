package com.example.day18_fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var clockButton: Button
    private lateinit var examSheetButton: Button
    private lateinit var validateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        clockButton = findViewById(R.id.clock)
        examSheetButton = findViewById(R.id.ExamSheet)
        validateButton = findViewById(R.id.btnValidate)

        clockButton.setOnClickListener(View.OnClickListener {
            replaceFragment(Clock_Fragment())
        })

        examSheetButton.setOnClickListener(View.OnClickListener {
            replaceFragment(Exam_Fragment())
        })
        validateButton.setOnClickListener(View.OnClickListener {
            replaceFragment(Validation_Fragment())
        })


    }


    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framlayout, fragment)
        fragmentTransaction.commit()
    }
}
