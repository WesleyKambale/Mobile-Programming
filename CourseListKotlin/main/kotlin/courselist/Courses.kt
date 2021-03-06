package com.example.testapp

fun main(args : Array<String>) {
    val courseList : Array<String> = arrayOf("Artificial Intelligence, ", "Entrepreneurship, ", "Computer and Network Security, ", "Mobile Programming, ", "Data Communications and Networks, ", "Automata, Complexity and Computability.")

    courseList.forEach { System.out.print(it) }
}