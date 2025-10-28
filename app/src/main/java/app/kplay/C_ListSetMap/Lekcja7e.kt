package app.kplay.C_ListSetMap

fun main(){
    val filmy = mutableListOf<Pair<String, String>>()
    val licz_gatunki = mutableMapOf<String, Int>()
    val gatunki = mutableSetOf<String>()
    println("Wprowadź nazwę filmu oraz jego gatunek:")
    for(i in 1..5) {
        print("$i. F: ")
        val film: String = readln().trim()
        print("$i. F: $film G: ")
        val gatunek: String = readln().trim()
        filmy.add(Pair(film, gatunek))
        if(!licz_gatunki.containsKey(gatunek)) {
            licz_gatunki[gatunek] = 1
        } else {
            val licznik: Int = licz_gatunki[gatunek] ?: 0
            licz_gatunki[gatunek] = 1 + licznik
        }
        gatunki.add(gatunek)
    }
    println()
    println("Wybrane filmy:")
    println(filmy)
    println()
    println("Ile filmów z gatunku:")
    println(licz_gatunki)
    println()
    println("Unikalne gatunki:")
    println(gatunki)
}