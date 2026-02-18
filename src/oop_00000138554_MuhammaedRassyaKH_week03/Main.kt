package oop_00000138554_MuhammaedRassyaKH_week03

fun main() {
    //employee
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000

    //weapon
    val sword = Weapon("Sword")
    sword.damage = -50  // Warning
    println(sword.damage)  // 0
    sword.damage = 9999  // 1000
    println(sword.tier)  // Legendary
}

