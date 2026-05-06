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

    val mixedList: List<Any> = listOf(
        "Hello",
        123,
        "World",
        true
    )

    for (item in mixedList) {
        val str = item as? String
        if (str != null) {
            println(str.length)
        }
    }

    for (item in mixedList) {
        val str = item as? String ?: "Default String"
        println(str)

        val nullableString: String? = null
        println(nullableString!!.length)

        val nullableString: String? = null

        val safeString = requireNotNull(nullableString) {
            "String should not be null"
        }

        println(safeString.length)
    }
}