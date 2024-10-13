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