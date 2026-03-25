package oop_00000138554_MuhammadRassyaKH_week07

class NetworkClient private constructor(val baseUrl: String) {

    companion object {
        fun create(baseUrl: String): NetworkClient {
            return NetworkClient(baseUrl)
        }
    }
}