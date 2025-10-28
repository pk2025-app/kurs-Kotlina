package app.kplay.A_Elementary

fun main() {

    print("Jak masz na imie?")
    var imie = readln();
    print("Ile masz lat?")
    var wiek = readln().toInt()

    val pelnoletni = wiek >= 18

    println("Witaj, mam na imie $imie i mam $wiek")
    println("Czy jestem pelnoletni? $pelnoletni")

    println("Za rok będziesz mieć ${wiek + 1} lat.")
}

//lepsza wersja

/*
fun main() {
    print("Jak masz na imię? ")
    val imie = readln()

    print("Ile masz lat? ")
    val wiek = readln().toInt()   // 👈 zamiana tekstu na liczbę

    val pelnoletni = wiek >= 18   // 👈 teraz to działa poprawnie

    println("Witaj, mam na imię $imie i mam $wiek lat.")
    println("Czy jestem pełnoletni? $pelnoletni")
}
 */