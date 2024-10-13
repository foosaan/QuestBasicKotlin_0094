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


fun ContohMap() {

    println()

    println("== Map ==")

// Map Read-Only

    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

// Map Mutable

// Menambahkan data ke dalam Map Mutable

    shape["Rectangle"] = 4
    println(shape)

// Menghapus data dari Map Mutable

    shape.remove("Circle")
    println(shape)

// Mengubah data di dalam Map Mutable

    shape["Square"] = 5
    println(shape)

// Map Read-Only

    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}


fun main() {
    ContohList()
    ContohSet()
    ContohMap()

}