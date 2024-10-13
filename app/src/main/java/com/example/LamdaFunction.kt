package com.example

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main(){
    uppercaseString("Hallo")
    println({ string: String -> string.uppercase()}("Hallo"))
}