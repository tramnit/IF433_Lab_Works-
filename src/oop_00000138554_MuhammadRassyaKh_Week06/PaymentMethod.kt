package oop_00000138554_MuhammadRassyaKh_Week06

interface PaymentMethod {
    fun pay(amount: Double)
}

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Paying $amount using GoPay")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Paying $amount using Credit Card")
    }
}