package oop_00000138554_MuhammaedRassyaKH_week03

class Employee(val name: String){
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0")
                field = 0
            } else {
                field = value
            }
        }
    private var performanceRating: Int = 3

    fun increasePerformance(){
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1
}

fun main(){
    val e = Employee("Budi")

    //1. Test Validasi Salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. Test Encapsulation
    e.increasePerformance()

    //3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}



