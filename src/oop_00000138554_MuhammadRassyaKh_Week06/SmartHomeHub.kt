package oop_00000138554_MuhammadRassyaKh_Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}

fun SmartHomeHub.activateSecurityMode() {
    for (device in devices) {
        if (device is Recordable) {
            device.startRecord()
        }

        if (device is SmartSpeaker) {
            device.playMusic("Sirine Peringatan")
        }
    }
}

