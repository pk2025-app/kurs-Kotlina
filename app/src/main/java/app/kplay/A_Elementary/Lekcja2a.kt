package app.kplay.A_Elementary

fun main() {
    // stała (niezmienna)
    val goal = 8000
    // zmienna (można zmieniać)
    print("Podaj dzisiejsze kroki: ")
    var steps = readln().toInt()    // czyta tekst i konwertuje na Int
    println("Wpisałeś: $steps")

    println("Cel dnia: $goal, aktualne kroki: $steps")

    val minutesWalked: Int = 45      // jawny typ
    val avgStepsPerMinute = steps / minutesWalked      // Int / Int -> Int (ucięcie części ułamkowej)
    println("Śr. kroki/min (INT): $avgStepsPerMinute")

    val avgStepsPerMinuteFloat = steps.toDouble() / minutesWalked   // Double / Int -> Double
    println("Śr. kroki/min (DOUBLE): $avgStepsPerMinuteFloat")

    val user = "Przemo"
    val summary = "Użytkownik $user zrobił dziś $steps kroków."
    println(summary)

    val multi = """
        |Dzienny raport:
        | - Kroki: $steps
        | - Cel:   $goal
        | - Postęp: ${steps * 100 / goal}%
    """.trimMargin()
    println(multi)

    val metGoal = steps >= goal
    println("Cel osiągnięty? $metGoal")

    val isActiveDay = steps > 5000 && minutesWalked >= 30
    println("Aktywny dzień? $isActiveDay")

    val needsPush = steps < 3000 || minutesWalked < 20
    println("Przyda się motywacja? $needsPush")

    // --- Mini kalkulator XP ---
    val stepsToday = steps          // użyj aktualnej wartości steps z góry
    val xpPerThousand = 0.1         // 0.1 XP za każde 1000 kroków
    val baseXp = (stepsToday / 1000.0) * xpPerThousand

    // bonus: jeśli przekroczysz cel, +20% XP
    val xp = if (stepsToday >= goal) baseXp * 1.2 else baseXp

    println("XP dzisiaj: ${String.format("%.4f", xp)}")

}