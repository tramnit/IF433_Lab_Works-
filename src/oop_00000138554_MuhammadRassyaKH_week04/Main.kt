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
}