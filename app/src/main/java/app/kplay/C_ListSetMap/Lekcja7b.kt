package app.kplay.C_ListSetMap

fun main() {
    val filmy = mutableListOf<String>()
    println("Podaj 3 ulubione filmy: ")
    for(i in 1..3) {
        print("$i: ")
        val film = readln().trim()
        if (film.isNotBlank()) filmy.add(film)
    }

    println()
    println("Twoje ulubione filmy: $filmy")
    println("Liczba filmów: ${filmy.size}")

    // Nowa lista w odwróconej kolejności, bez zmiany pierwotnej:
    val odwrocone = filmy.reversed()
    println("Odwrotnie: $odwrocone")

    // Lista wielkimi literami:
    val wielkie = filmy.map { it.uppercase() }
    println("Wielkimi literami: $wielkie")
}