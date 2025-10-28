package app.kplay.B_IfForWhenWhile

fun main(){
    print("Ile kroków dzisiaj zrobileś? ")
    val cel = 7000;
    val kroki = readln().toInt()

    print(stepGoalCheck(kroki, cel))
}

fun stepGoalCheck(steps: Int, goal: Int) =
    if(steps >= goal) "Brawo! Zrobiłeś $steps kroków i osiągnąłeś cel!"
    else "Zrobiłeś $steps, zostało jeszcze ${goal - steps} do celu."
