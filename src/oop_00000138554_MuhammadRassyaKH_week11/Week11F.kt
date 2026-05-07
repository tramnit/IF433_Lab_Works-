package oop_00000138554_MuhammadRassyaKH_week11

//function biasa
fun panggil_nama(nama:String):String {
    return "Hai $nama";
}
//function Extension - basic
fun String.panggil_mahasiswa(): String {
    //return "Hellp $this";
    var hasil = this.split(" ").joinToString( " ") {
        it.replaceFirstChar {
                c -> c.uppercase()
        }
    }
    return hasil;
}

//function Extension - Parameter
fun Int.tentukanlulus(nama:String):String {
    var keputusan = "";
    if (this >= 70){
        keputusan = "Lulus"
    } else {
        keputusan = "Remedial"
    }
    return "Mahasiswa $nama hasil kelulusan adalah $keputusan";
}

//function extension - cek NULL
fun String?.cekNulldanEmpty():String {
    if (this == null || this.isEmpty()) {
        return "gaboleh null atau kosong bang"
    } else {
        return "username kamu adalah $this"
    }

}
class Mahasiswa () {
    var nim:String = ""
    var nama:String = ""
    var ipk:Int = 0
}

fun main() {
    //cara panggil function extension - nul/
    var inpuUsername: String? = null
    println(inpuUsername.cekNulldanEmpty());

    //cara panggil function extension - parameter
    println(80.tentukanlulus("revan"));

    //cara panggil function biasa
    println(panggil_nama("TONI").uppercase());

    // cara panggil function Extension - BASIC
    println("tonyyy sugianto suprapto bos".panggil_mahasiswa());

    //SCOPE - Let
    var kampusSaya = "UMN";
    kampusSaya.let {
        if (it == "UMN") {
            println("kampus " + it + " Keren")
        } else {
            println("AMAZING $it")
        }
    }

    //SCOPE - Run
    var alamatSaya = "Gading Serpong";
    alamatSaya.run {
        println("Saya tinggal di "+ this)
    }

    //SCOPE - WITH
    var gradeSaya = with(90){
        if (this >= 80){
            "A"
        }else if (this >= 70){
            "B"
        } else {
            "C"
        }
    }
    println("Grade kamu adalah $gradeSaya");

    //SCOPE - APPLY
    var dataMahasiswa = Mahasiswa().apply {
        nim = "12345";
        nama = "Yudi";
        ipk = 3;
    }
    println("Mahasiswa ${dataMahasiswa.nama} dengan nim ${dataMahasiswa.nim} ipk nya ${dataMahasiswa.ipk}");

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(80,70,75,60,85);
    deretAngka.also {
        println("Sebelum $deretAngka");
    }.add(90)
    println("Setelah $deretAngka")

}