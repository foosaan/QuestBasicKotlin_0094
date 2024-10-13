package com.example

fun ContohList(){
    println("=== List ===")
    //List Read Only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)

    //list Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data ke dalam list Mutable
    shape.add("Circle")
    println(shape)

    //menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

}