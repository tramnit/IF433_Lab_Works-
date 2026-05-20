package oop_00000138554_MuhammadRassyaKH_week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    // Lanjutan fungsi main()
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
    // Lanjutan fungsi main()
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }