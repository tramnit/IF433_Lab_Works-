package oop_00000138554_MuhammadRassyaKH_week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar $amount berhasil.")
        } else {
            println("[$accountName] Saldo tidak cukup!")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil top up sebesar $amount. Saldo sekarang: $balance")
    }
}