package oop_00000138554_MuhammadRassyaKhanayaHartawan.week01 // Pastikan package sesuai

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote ?: "Tidak ada catatan"
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price - (price * 20 / 100)
    else price - (price * 10 / 100)

fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : $note")
}