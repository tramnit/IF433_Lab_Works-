package oop_00000138554_MuhammmadRassyaKH_week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== SISTEM PENDAFTARAN ===")
    println("1. Daftar dengan jurusan")
    println("2. Daftar tanpa jurusan")
    print("Pilih opsi: ")
    val pilihan = scanner.nextInt()
    scanner.nextLine()

    print("Nama: ")
    val name = scanner.nextLine()

    print("NIM (5 karakter): ")
    val nim = scanner.next()
    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: NIM harus 5 karakter.")
        return
    }

    when (pilihan) {
        1 -> {
            print("Jurusan: ")
            val major = scanner.nextLine()
            val student = Student(name, nim, major)
            println("Pendaftaran selesai.")
        }
        2 -> {
            val student = Student(name, nim)
            println("Pendaftaran selesai (Non-Matriculated).")
        }
        else -> println("Pilihan tidak valid.")
    }
}
