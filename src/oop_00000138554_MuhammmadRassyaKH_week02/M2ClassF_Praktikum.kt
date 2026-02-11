package oop_00000138554_MuhammmadRassyaKH_week02

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {

    constructor(name: String, nim: String)
            : this(name, nim, "Non-Matriculated") {

        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }

    init {
        println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
    }
}