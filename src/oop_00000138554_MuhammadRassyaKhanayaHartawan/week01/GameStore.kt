package oop_00000138554_MuhammadRassyaKhanayaHartawan.week01 // Pastikan package sesuai

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price - (price * 20 / 100)
    else price - (price * 10 / 100)