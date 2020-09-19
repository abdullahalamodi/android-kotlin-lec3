package com.abdullahalamodi.androidkotlinlec_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.question_2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_2)

        true_btn.setOnClickListener {
            val toast = Toast.makeText(
                this, R.string.correct_toast,
                Toast.LENGTH_SHORT
            );
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.show();
        }

        false_btn.setOnClickListener {
            val toast = Toast.makeText(
                this, R.string.incorrect_toast,
                Toast.LENGTH_SHORT
            );
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.show();
        }
    }
}