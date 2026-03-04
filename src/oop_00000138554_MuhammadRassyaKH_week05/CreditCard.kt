package oop_00000138554_MuhammadRassyaKH_week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Transaksi Kartu Kredit sebesar $amount sukses.")
        } else {
            println("[$accountName] Transaksi ditolak: Melebihi limit!")
        }
    }
}

