package oop_00000138554_MuhammadRassyaKh_Week06

interface Clickable {
    var name: String = "Tombol Rahasia" // ERROR: interface tidak boleh punya backing field

    fun click()
}