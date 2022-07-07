fun main() {
    val fortune = getFortune(getBirthday())
    println("Your fortune is: $fortune")
}

fun getBirthday() : Int {
    println("Enter your birthday: ")
    var birthday = readLine()
    return birthday?.toIntOrNull() ?: 1
}

fun getFortune(birthday : Int): Int {
    return when (birthday) {
        in 0..10 -> 10000
        in 11..20 -> 8000
        in 21..27 -> 30000
        else -> 999
    }

/*val fortuneList: List<String> =
        listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.") */
//return fortuneList[result]
}