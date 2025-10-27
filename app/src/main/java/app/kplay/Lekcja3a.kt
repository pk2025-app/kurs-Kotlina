package app.kplay

fun main(){
    var kroki: Int = 0
    do {
        print("Wprowadz ile krokow dzisiaj zrobiles? ")
        kroki = readln().toInt()
        if(kroki >= 7000) println("Swietny wynik!") else println("Zacznij spacerowac wiecej!")
        println()
    }while(kroki < 7000)
}