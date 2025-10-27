package app.kplay

fun main() {
    print("Jak masz na imie? ")
    val imie = readln()
    print("Ile zrobiles krokow? ")
    val kroki = readln().toInt()
    print("Jaki jest twoj cel krokow? ")
    val cel = readln().toInt()

    var procent = ((kroki * 100) / cel)
    if(procent >= 100) print("Brawo $imie, wykonales swoj cel w $procent%") else print("Niestety $imie, zrobiles poki co jedynie $procent% dziennego celu")
}