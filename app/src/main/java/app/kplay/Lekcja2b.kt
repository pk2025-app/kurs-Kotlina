package app.kplay

fun main() {
    val imie = "Przemo"
    var wiek = 12
    val wzrost = 1.82
    val pelnoletni = wiek >= 18

    println("Cześć, $imie!")
    println("Masz $wiek lat i ${wzrost}m wzrostu.")
    println("Czy jesteś pełnoletni? $pelnoletni")

    wiek += 1
    println("Za rok będziesz mieć $wiek lat!")
}
