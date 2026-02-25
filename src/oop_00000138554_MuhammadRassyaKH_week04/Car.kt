package oop_00000138554_MuhammadRassyaKH_week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }

    fun openTruck() {
        println("Bagasi mobil $brand dengan $numberOfDoors ")
    }
}