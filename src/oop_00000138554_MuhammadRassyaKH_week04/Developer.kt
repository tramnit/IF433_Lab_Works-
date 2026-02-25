package oop_00000138554_MuhammadRassyaKH_week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
    // calculateBonus tidak di-override agar sesuai bawaan parent [cite: 95]
}