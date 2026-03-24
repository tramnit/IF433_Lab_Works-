package oop_00000138554_MuhammadRassyaKh_Week06

class Smartwatch(brand: String) : Watch(brand), Connectable, Chargeable {
    override fun showTime() {
        println("Showing time on $brand smartwatch")
    }

    override fun connect() {
        println("$brand smartwatch connected")
    }

    override fun charge() {
        println("$brand smartwatch charging")
    }
}