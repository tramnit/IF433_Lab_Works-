package oop_00000138554_MuhammmadRassyaKH_week02

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {

    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated")

    init {
        if (nim.length != 5) {
            println("PERINGATAN: NIM harus 5 karakter!")
        }

        if (name.isBlank()) {
            println("PERINGATAN: Nama tidak boleh kosong!")
        }
    }
}