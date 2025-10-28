package app.kplay.B_IfForWhenWhile

fun main(){
    print("Podaj losową liczbę... ")
    val liczba = readln().toInt()
    println("\nWynik FizzBuzz:\n")

    for (i in 1..liczba) {
        when {
            i % 15  == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }

    }
}