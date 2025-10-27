package app.kplay

fun main(){
    val wiek = 25
    val kraj = "PL"

    if (wiek >= 18 && kraj == "PL") {
        println("Pełnoletni obywatel Polski")
    } else {
        println("Nie spełniasz warunków")
    }
}