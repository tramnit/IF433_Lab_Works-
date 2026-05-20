package oop_00000138554_MuhammadRassyaKH_week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length // Mengembalikan nilai expression terakhir
    }
    println("Panjang nama: $length")
    // Tambahkan kode berikut ke dalam fungsi main() yang sama di atas
    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        this.length * 2
    }
    println("Hasil kalkulasi run: $result")
}