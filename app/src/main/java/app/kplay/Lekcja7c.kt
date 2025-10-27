package app.kplay

import java.text.Collator
import java.util.Locale

val collator = Collator.getInstance(Locale("pl", "PL"))

fun main(){
    var zwierzeta = mutableSetOf<String>()
    println("Wprowadź 5 swoich ulubionych zwierząt: ")
    for(i in 1..5) {
        print("$i: ")
        var zwierzak = readln().trim()
        zwierzeta.add(zwierzak)
    }
    println()
    println("Oto lista unikalnych zwierząt: ${zwierzeta.joinToString(" ")}")
    println("Liczba zwierząt: ${zwierzeta.size}")
    print("Posortowane: ${zwierzeta.sortedWith(collator).joinToString(" ")}")
}