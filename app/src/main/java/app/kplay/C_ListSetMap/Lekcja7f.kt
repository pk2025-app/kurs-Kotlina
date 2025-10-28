package app.kplay.C_ListSetMap

fun main(){
    var oceny = mutableListOf<Pair<String, Int>>()
    var locen = mutableMapOf<Int, Int>()

    println("Oceń filmy (1..10):")
    for(i in 1..5) {
        var ocena: Int? = null
        do {
            print("$i: ")
            val input = readln().trim()
            if (input.isEmpty()) {
                println("Nie wpisałeś oceny, spróbuj jeszcze raz.")
                continue
            }
            if (input.toIntOrNull() != null && input.toInt() in 1..10) {
                ocena = input.toInt()
            } else {
                println("Błędna ocena. Wpisz liczbę od 1 do 10.")
            }
        } while (ocena == null)
        var nr: String = "empty"
        when(i) {
            1 -> nr = "Jeden"
            2 -> nr = "Dwa"
            3 -> nr = "Trzy"
            4 -> nr = "Cztery"
            else -> nr = "Piec"
        }
        oceny.add(Pair(nr, ocena))
        if(!locen.containsKey(ocena)) {
            locen[ocena] = 1
        } else {
            val ocenka = locen[ocena] ?: 0
            locen[ocena] = 1 + ocenka
        }
    }
    for (ocena in 1..10) {
        if (locen.containsKey(ocena)) {
            val wystapien = locen[ocena]
            println("Ocena: $ocena, ma $wystapien ${poprawnosc(wystapien!!)}.")
        }
    }
    var l = 1
    print("Czy ocena 10 pojawiła się? ")
    for((ocena, ilosc) in locen) {
        if(ocena == 10) l++
    }
    if(l == 2) println("Tak") else println("Nie")
    l = 1
    print("Liczby z przedzialu 4-8: ")
    for((ocena, ilosc) in locen) {
        if(ocena > 3 && ocena < 9) {
            print("$ocena, ")
        }
    }
}

fun poprawnosc(liczba: Int): String =
    when(liczba) {
        1 -> "wystąpienie"
        2, 3, 4 -> "wystąpienia"
        else -> "wystąpień"
    }