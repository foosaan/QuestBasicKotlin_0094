package com.example


class Motor()
class Contact (val id: Int, var email: String)

fun main(){
    val contact = Contact(1, "aisfarisais1@gmail.com")
    println(contact.email)
    contact.email = "abangais123@gmail.com"

    println(contact.email)
}