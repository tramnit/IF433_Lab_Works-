package oop_00000138554_MuhammadRassyaKH_week12

fun pembagian(pembilang:Int, penyebut: Int){
    try {
        val hasilBagi = pembilang / penyebut
        println("hasil bagi: $hasilBagi")
    } catch (e: Exception) {
        println("Error di pembagian ${e.message}")
    } finally {
        println("Selesai Pemabagian")
    }
}

//Exception - Expression - Tipe data
fun cek_tipe_data(){
    var angka: Int = try {
        Integer.parseInt("aaaaa");
    } catch (e: Exception) {
        println("ada err di CekTipeData ${e.message}")
        111
    }
    println("Angka kamu adalah ${angka}")
}

//Throw
fun cek_saldo(saldoSaya: Int){
    if(saldoSaya<1000){
        throw IllegalArgumentException("Saldo ${saldoSaya} tidak perlu bayar pajak")
    }else {
        println("Selamat kamu orang kaya")
    }
}
//custom Exception
class CekNilaiKKM(val kkm:Int, val nilai:Int): Exception("Nilai $nilai berada dibawah kkm $kkm")

class nilai_siswa(val kkm:Int){
    fun input_nilai(nilaiKamu:Int){
        if(nilaiKamu < kkm){
            throw CekNilaiKKM(kkm, nilaiKamu)
        } else {
            println("Kamu lulus, dengan nilai $nilaiKamu")
        }
    }
}
fun main(){
    //panggil class custom Exception
    val nsiswa = nilai_siswa(70)
    try {
        nsiswa.input_nilai(71)
    } catch (e: Exception) {
        println("Error di niswa ${e.message}")
    }
    //Throw
    try {
        cek_saldo(990)
    } catch (e: Exception) {
        println("Error diThrow: ${e.message}")
    }
    //Exception - Expression
    cek_tipe_data()
    pembagian(10,2)
}

