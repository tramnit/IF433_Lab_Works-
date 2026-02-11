import oop_00000138554_MuhammmadRassyaKH_week02.Loan
import oop_00000138554_MuhammmadRassyaKH_week02.Student
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    val studentReguler = Student(name, nim, major)

    println("Status: Pendaftaran Selesai.")

    println("Pilih Jalur (1. Reguler, 2. Umum): ")
    val pilihan = scanner.nextInt()

    when (pilihan) {
        1 -> {
            println("Terdaftar di: ${studentReguler.major} dengan GPA awal ${studentReguler.gpa}")
        }
        2 -> {
            val studentUmum = Student(name, nim)
            println("Terdaftar di: ${studentUmum.major} dengan GPA awal ${studentUmum.gpa}")
        }
        else -> println("Pilihan tidak valid.")
    }

    // =========================
    // TAMBAHAN UNTUK COMMIT 8
    // =========================

    scanner.nextLine() // bersihkan newline

    println("\n=== SISTEM DENDA PERPUSTAKAAN ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Durasi tidak boleh minus. Diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("Total Denda: Rp ${loan.calculateFine()}")
}
