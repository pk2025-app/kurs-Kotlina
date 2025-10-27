package app.kplay

fun main(){
    print("Wprowadz nazwe pierwszego produktu: ")
    var input = ""
    val produkt1 = readln()
    print("Wprowadz cene: ")
    input = readln()
    var cena1 = input.replace(",", ".").toDouble()
    print("Wprowadz nazwe drugiego produktu: ")
    val produkt2 = readln()
    print("Wprowadz cene: ")
    input = readln()
    var cena2 = input.replace(",", ".").toDouble()
    print("Wprowadz nazwe trzeciego produktu: ")
    val produkt3 = readln()
    print("Wprowadz cene: ")
    input = readln()
    var cena3 = input.replace(",", ".").toDouble()

    val liczbaproduktow = 3

    println("Kupiles:")
    println("Produkt 1: $produkt1 cena: $cena1")
    println("Produkt 2: $produkt2 cena: $cena2")
    println("Produkt 3: $produkt3 cena: $cena3")

    println()
    val suma = cena1 + cena2 + cena3
    println("Koszt koszyka: $suma")
    val srednia = suma.toDouble() / liczbaproduktow
    println("Średnia cena: ${String.format("%.2f", srednia)}")
}