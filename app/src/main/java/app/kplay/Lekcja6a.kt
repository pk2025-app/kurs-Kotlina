package app.kplay

fun main(){
    println("Wprowadz 5 liczb:")
    var suma: Int = 0

    for(i in 1..5) {
        print("$i: ")
        var liczba = readln().toInt()
        if(liczba == 0) break
        if(liczba < 0) continue
        if(isEven(liczba)) suma += liczba
    }

    print("Suma wszystkich liczb parzystych to: $suma")

}

fun isEven(liczba: Int) = liczba % 2 == 0