package oop_00000138554_MuhammadRassyaKH_week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")
    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")
    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    // ... (Kode Test Singleton s/d Sealed Class yang sudah kamu buat sebelumnya) ...

    println("\n=== SIMULASI GAME RPG ===")
    // Checkpoint 18: Test Singleton [cite: 183]
    GameManager.startGame()
    GameManager.startGame() // Harus mencetak "Game sudah berjalan!" [cite: 183]

    // Checkpoint 19: Factory & Enum [cite: 186, 187]
    println("Drop Chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")
    val mySword = Weapon.forgeStarterSword()
    println("Senjata Awal: ${mySword.item.name}")

    // Checkpoint 20: Copy & Events [cite: 191]
    val upgradedSword = mySword.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedSword))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
} // Selesai: Hanya satu kurung kurawal penutu



