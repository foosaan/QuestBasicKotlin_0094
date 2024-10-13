package com.example

fun withoutParameter() {
    println("= without Parameter ==")
    println("Hello, World!")
}
fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!") // Menampilkan pesan dengan nama yang diberikan
}
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.") // Menampilkan pesan dengan nama dan usia
}
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.") // Menampilkan pesan dengan nama default jika tidak diberikan
}

fun calculateArea(panjang: Int, lebar: Int) {
    println()
    println("== calculateArea ==")
    println("Area: ${panjang * lebar}") // Menghitung dan menampilkan luas
}
