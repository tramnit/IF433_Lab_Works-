package oop_00000138554_MuhammadRassyaKh_Week06

fun processCheckout(payment: PaymentMethod, amount: Double) {
    payment.pay(amount)
}

fun main() {
    val gopay = Gopay()
    val creditCard = CreditCard()

    processCheckout(gopay, 50000.0)
    processCheckout(creditCard, 150000.0)
}