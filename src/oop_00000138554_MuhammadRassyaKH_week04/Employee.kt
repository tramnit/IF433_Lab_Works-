package oop_00000138554_MuhammadRassyaKH_week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja.")
    }
    open fun calculateBonus(): Int {
        return (0.1 * baseSalary).toInt()
    }
}