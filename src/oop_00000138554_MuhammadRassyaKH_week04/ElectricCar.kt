package oop_00000138554_MuhammadRassyaKH_week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    // Gunakan final agar tidak bisa di-override lagi oleh keturunan ElectricCar
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}