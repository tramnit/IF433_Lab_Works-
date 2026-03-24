package oop_00000138554_MuhammadRassyaKh_Week06

interface Clickable {
    var name: String

    fun click()
}

class Button(override var name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik")
    }
}