package app.kplay.C_ListSetMap

fun main(){
    val slowa = mutableMapOf<String, Int>()
    println("Wprowadz 5 losowych slow: ")
    for(i in 1..5){
        print("$i: ")
        val slowo: String = readln()
        if(!slowa.containsKey(slowo)) {
            slowa[slowo] = 1
        } else {
            val licznik: Int = slowa[slowo] ?: 0
            slowa[slowo] = licznik + 1
        }
    }
    println()
    println("Map -> $slowa")
}