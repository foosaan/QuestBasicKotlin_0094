package com.example

data class DataClass(

    val id: Int, var email: String )

fun main() {

    val data = DataClass(1, "saya@gmail.com")

    println(data)

// Fungsi Equals

    val data2 = DataClass(1, "kamu@gmail.com")

    println(data == data2) // false

// Fungsi Copy

    val data3= data.copy()

    println(data3)

// Fungsi Copy dengan perubahan

    val data4 = data.copy(email = "satu@gmail.com")

    println(data4)

}