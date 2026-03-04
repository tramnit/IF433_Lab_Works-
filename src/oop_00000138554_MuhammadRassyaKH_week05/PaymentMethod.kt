package oop_00000138554_MuhammadRassyaKH_week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}