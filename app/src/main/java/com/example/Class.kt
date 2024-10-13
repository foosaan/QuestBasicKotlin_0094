package com.example


class Motor()
class Contact (val id: Int, var email: String)

fun main(){
    val contact = Contact(1, "Fosan01@gmail.com")
    println(contact.email)
    contact.email = "kenro01@gmail.com"

    println(contact.email)

}