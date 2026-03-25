package oop_00000138554_MuhammadRassyaKH_week07

fun main() {
    DatabaseManager.connect()

    val client = NetworkClient.create("https://api.umn.ac.id")
    println("Client created with URL: ${client.baseUrl}")
}