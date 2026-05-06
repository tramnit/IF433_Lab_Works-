package oop_00000138554_MuhammadRassyaKH_week08

data class Address(
    val city: String?
)

data class Customer(
    val address: Address?
)

data class Order(
    val customer: Customer?
)