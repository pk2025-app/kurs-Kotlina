package app.kplay

fun main() {

    val wiek = 25
    val kraj = "PL"

    when {
        wiek >= 18 && kraj == "Polska" -> println("Masz dostęp")
        wiek < 18 -> println("Za młody jesteś")
        kraj != "Polska" -> println("Jesteś z innego kraju")
        else -> println("Nie spełniasz warunków")
    }
}