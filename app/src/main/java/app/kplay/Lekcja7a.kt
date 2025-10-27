package app.kplay

fun main(){
    val owoce = mutableListOf<String>()     // lub val owoce: MutableList<String> = mutableListOf()
    println("Wprowadz 3 ulubione owoce:")
    var owoc: String? = null
    for(i in 1..3) {
        print("$i: ")
        owoc = readln().trim()
        if(!owoc.isNotBlank()) owoc = "";
        owoce.add(owoc)
    }
    println()
    println("Twoje ulubione owoce to: ")
    print(owoce)
}