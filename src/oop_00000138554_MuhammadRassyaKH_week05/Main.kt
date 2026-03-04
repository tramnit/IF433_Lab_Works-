package oop_00000138554_MuhammadRassyaKH_week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    // Polymorphic Collection
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja() // Runtime Polymorphism

        // Smart Casting menggunakan 'is' dan 'when'
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast otomatis
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }

    // Tambahkan di dalam fun main() sebelumnya
    val math = MathHelper()
    println("Luas Persegi: ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(4, 6)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    // Inisialisasi objek sesuai instruksi modul
    val myEWallet = EWallet("JohnThor Pay", 50000.0)
    val myCreditCard = CreditCard("JohnThor Card", 100000.0)

// Masukkan ke dalam list bertipe Parent (PaymentMethod)
    val payments: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    println("=== SIMULASI PEMBAYARAN (Checkpoint 10) ===")
    for (payment in payments) {
        // Memanggil fungsi abstract yang sudah di-override
        payment.processPayment(75000.0)
    }
}