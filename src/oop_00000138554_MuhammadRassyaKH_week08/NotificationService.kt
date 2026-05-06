package oop_00000138554_MuhammadRassyaKH_week08

class NotificationService {

    fun sendNotification(user: UserProfile) {
        if (user.email != null) {
            println("Sending email to ${user.email}")
        }

        if (user.phoneNumber != null) {
            println("Sending SMS to ${user.phoneNumber}")
        }
    }
}