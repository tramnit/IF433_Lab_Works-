package oop_001_johntor.week01 // Pastikan package sesuai

fun main(){
    val name = "John Thor"
    val score = 80

    println("Name: $name, Nilai: + $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu : $grade")

    //Panggil di dalam main()
    println("Status: ${calculateStatus(score)}")
}

//Tulis diluar main
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"
