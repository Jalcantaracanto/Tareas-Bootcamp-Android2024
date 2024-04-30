fun main() {

    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

}

fun printNotificationSummary(eveningNotification: Int) {
    if (eveningNotification >= 0 && eveningNotification <= 100) println("You have $eveningNotification notifications")
    else println("Your phone is blowing up! You have 99+ notifications.")
}