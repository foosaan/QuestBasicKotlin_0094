package com.example


fun ContohList() {
    println("=== list ===")
    //list read-only
    val readOnlyAbjad = listOf ("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableList<String> = mutableListOf("circle", "Square", "Triangle")
    println(shape)

    //menambahkab Data
    shape.add("Circle")
    println(shape)

    //menghapus
    shape.remove("Triangle")
    println(shape)

    //mengubah data
    shape[0] = "Oval"
    println(shape)

    val shapesLocked: List<String> = shape
    println(shapesLocked)
}
