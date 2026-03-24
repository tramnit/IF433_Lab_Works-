package oop_00000138554_MuhammadRassyaKh_Week06

fun main() {
    val lamp = SmartLamp("1", "Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== Security Mode ===")
    hub.activateSecurityMode()

    println("\n=== Turn Off All Devices ===")
    hub.turnOffAllSwitches()
}