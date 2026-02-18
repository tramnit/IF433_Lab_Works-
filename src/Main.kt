import oop_00000138554_MuhammmadRassyaKH_week02.Hero
import oop_00000138554_MuhammmadRassyaKH_week02.Loan
import oop_00000138554_MuhammmadRassyaKH_week02.Student
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // =========================
    // SISTEM PMB
    // =========================

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
    // SISTEM DENDA PERPUSTAKAAN (Commit 8)
    // =========================

    scanner.nextLine()

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

    // =========================
    // MINI RPG BATTLE (Commit 10)
    // =========================

    scanner.nextLine()

    println("\n=== MINI RPG BATTLE ===")

    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Base Damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val action = scanner.nextInt()

        when (action) {
            1 -> {
                hero.attack("Musuh")
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0

                println("HP Musuh: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Musuh menyerang balik!")
                    hero.takeDamage(enemyDamage)
                    println("HP Hero: ${hero.hp}")
                }
            }
            2 -> {
                println("Kamu kabur dari pertempuran!")
                break
            }
            else -> println("Pilihan tidak valid.")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    when {
        hero.isAlive() && enemyHp == 0 -> println("Hero Menang!")
        !hero.isAlive() -> println("Hero Kalah!")
        else -> println("Pertarungan berakhir.")
    }
}
