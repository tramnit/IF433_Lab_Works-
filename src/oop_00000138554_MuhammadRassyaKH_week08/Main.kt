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

        val mixedList: List<Any> = listOf(
            "Hello",
            123,
            "World",
            true
        )
    }
}

