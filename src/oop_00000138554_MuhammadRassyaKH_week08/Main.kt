package oop_00000138554_MuhammadRassyaKH_week08

fun main() {
    val order = Order(
        Customer(
            Address("Jakarta")
        )
    )

    val city = order.customer?.address?.city ?: "Unknown City"
    println(city)

    order.customer?.address?.city?.let {
        println("City found: $it")
    }

    // CHECKPOINT 6
    val mixedList: List<Any> = listOf(
        "Hello",
        123,
        "World",
        true
    )

    // CHECKPOINT 7
    for (item in mixedList) {
        val str = item as? String
        if (str != null) {
            println(str.length)
        }
    }
}