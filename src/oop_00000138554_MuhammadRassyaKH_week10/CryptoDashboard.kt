package oop_00000138554_MuhammadRassyaKH_week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 500.0))