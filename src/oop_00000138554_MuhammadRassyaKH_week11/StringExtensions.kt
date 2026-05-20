package oop_00000138554_MuhammadRassyaKH_week11

// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

// Tambahkan fungsi berikut di file StringExtensions.kt yang sama
fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}