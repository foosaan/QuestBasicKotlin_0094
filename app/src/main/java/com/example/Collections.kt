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


fun ContohSet() {
    println()
    println("=== Set ===")
    //list read-only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableSet<String> = mutableSetOf("circle", "Square", "Triangle")
    println(shape)

    //menambahkab Data
    shape.add("Rectangle")
    println(shape)

    //menghapus
    shape.remove("Circle")
    println(shape)

    val shapesLocked: Set<String> = shape
    println(shapesLocked)

}

