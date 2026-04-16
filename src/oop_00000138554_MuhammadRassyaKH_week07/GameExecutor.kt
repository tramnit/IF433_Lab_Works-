package oop_00000138554_MuhammadRassyaKH_week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Awas! Muncul monster ${event.monsterName}!")
        is BattleState.LootDropped -> println("Mendapat loot: ${event.item.name} (${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over: ${event.reason}")
        BattleState.SafeZone -> println("Kamu berada di zona aman.")
    }
}