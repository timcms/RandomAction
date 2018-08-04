package com.example.u01.randomaction

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun toastMe(view: View) {
        //массив с делами
        val myArray = arrayOf(
                "Позвони маме",
                "Позвони жене",
                "Поиграй с сыном",
                "Сделай уборку",
                "Прогуляйся",
                "Почини что-нибудь",
                "Выброси или продай старый хлам",
                "Погладь одежду",
                "Посмотри кино")
        //Выбираем случайное дело
        val idx = Random().nextInt(myArray.size)
        val s = myArray[idx]
        //Выводим всплывающее окно с текстом
        val myToast = Toast.makeText(this, "$s", Toast.LENGTH_SHORT)
        myToast.show()
    }
}
