package oop_00000138554_MuhammadRassyaKH_week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000 // Bonus parent + Rp 500.000 [cite: 89]
    }
}