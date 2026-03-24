package oop_00000138554_MuhammadRassyaKh_Week06

class Smartphone : Camera, Phone {
    override fun takePhoto() {
        super<Camera>.takePhoto()
        super<Phone>.takePhoto()
    }
}