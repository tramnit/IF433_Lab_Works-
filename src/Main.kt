package oop_00000138554_MuhammmadRassyaKH_week02

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

        // Object pertama (jalur reguler)
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
    }