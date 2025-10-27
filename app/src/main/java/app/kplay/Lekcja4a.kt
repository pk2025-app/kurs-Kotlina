package app.kplay

fun main(){
    print("Ile zrobiles krokow? ")
    val kroki = readln().toInt()

    print("Zrobiles $kroki kroków, czyli zdobyles ${computeXp(kroki)} XP")
}

fun computeXp(kroki: Int): Double {
    val xp = kroki * 0.1
    return if (xp < 1) 1.0 else xp
}