package app.kplay

fun main(){
    var opis: String? = null
    println("Wpisz jakis tekst:")
    val wpis = readln()
    if(wpis.trim().isNotBlank()) opis = wpis

    val dlugosc = opis?.length ?: 0
    println("Długość opisu: $dlugosc")

    if (opis == null) {
        println("Brak opisu")
    } else {
        println("Twój opis: $opis")
    }
}