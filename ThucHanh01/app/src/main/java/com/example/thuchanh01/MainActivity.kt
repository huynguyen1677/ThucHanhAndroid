package com.example.thuchanh01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.E

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editName = findViewById<EditText>(R.id.editName)
        val editAge = findViewById<EditText>(R.id.editAge)
        val btnCheck = findViewById<Button>(R.id.btnCheck)

        btnCheck.setOnClickListener {
            val name = editName.text.toString()
            val ageText = editAge.text.toString()

            val age = ageText.toIntOrNull() ?: -1
            if (name.isEmpty() || age == -1){
                Toast.makeText(this, "nhap day du thong tin", Toast.LENGTH_SHORT).show()
            }
             if (age > 65 && age <= 119){
                 Toast.makeText(this, "ban la nguoi cao tuoi", Toast.LENGTH_SHORT).show()
            }
            if (age <= 65 && age >=6 ){
                Toast.makeText(this, "ban la nguoi tre", Toast.LENGTH_SHORT).show()
            }
            if (age > 2 && age < 6){
                Toast.makeText(this, "CON NÍT RANH", Toast.LENGTH_SHORT).show()
            }
            if (age <=2 ){
                Toast.makeText(this, "mới biết đi hả ", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "UY TÍN HÔNG CHỨ GHI VÔ SÁCH ĐỎ ĐƯỢC RỒI ĐÓ:)))", Toast.LENGTH_SHORT).show()
            }
        }
    }
}