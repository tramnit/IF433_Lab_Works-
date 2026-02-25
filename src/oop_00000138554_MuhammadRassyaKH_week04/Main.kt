package oop_00000138554_MuhammadRassyaKH_week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepede Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTruck()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myEV = ElectricCar("Tesla", 4, 90)
    myEV.accelerate()
    myEV.honk()
    myEV.openTruck()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager("Budi", 8000000)
    val developer = Developer("Santi", 7000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}