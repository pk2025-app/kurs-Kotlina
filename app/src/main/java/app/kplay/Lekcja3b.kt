package app.kplay

fun main(){
    print("Podaj nazwe ulubionego owocu: ")
    val owoc = readln()
    print("Podaj ile sztuk chcesz kupić: ")
    val ile = readln().toInt()

    for(i in 1..ile) {
        println("Kupujesz $owoc, $i sztuka")
    }
}