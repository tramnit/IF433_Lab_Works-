package oop_00000138554_MuhammadRassyaKH_week07

class NetworkClient private constructor (val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}