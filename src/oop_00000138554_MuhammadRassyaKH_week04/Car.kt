package oop_00000138554_MuhammadRassyaKH_week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTruck() {
        println("Bagasi mobil $brand dengan $numberOfDoors ")
    }
}