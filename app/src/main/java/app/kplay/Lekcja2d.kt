package app.kplay

import kotlin.math.abs

fun main(){
    print("Podaj 1 liczbe: ")
    val liczbaA = readln().toInt()
    print("Podaj 2 liczbe: ")
    val liczbaB = readln().toInt()

    println()

    println("Wieksza liczba to: ${maxOf(liczbaA, liczbaB)}")
    println("Mniejsza liczba to: ${minOf(liczbaA, liczbaB)}")
    println("Bezposrednia liczby 1 to: ${abs(liczbaA)}")
}