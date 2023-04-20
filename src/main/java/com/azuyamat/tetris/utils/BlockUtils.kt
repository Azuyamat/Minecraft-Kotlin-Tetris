package com.azuyamat.tetris.utils

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material

val blockMap = mapOf(
    "I" to "4444",
    "J" to "4000,4440",
    "L" to "0004,0444",
    "O" to "0044,0044",
    "S" to "0044,0440",
    "T" to "0040,0444",
    "Z" to "0440,0044",
)
val blockColorMap = mapOf(
    "I" to Material.BLUE_WOOL,
    "J" to Material.PINK_WOOL,
    "L" to Material.ORANGE_WOOL,
    "O" to Material.YELLOW_WOOL,
    "S" to Material.RED_WOOL,
    "T" to Material.PURPLE_WOOL,
    "Z" to Material.GREEN_WOOL,
)

fun generateBlock(loc : Location,type : String?){
    type?:"I"
    val block = blockMap[type?.uppercase()]?:"4444"
    for ((ti, si) in block.split(",").withIndex()){
        val list : List<String> = si.replace("\\d".toRegex(), "|$0").split("|")
        for ((i, s : String) in list.withIndex()) {
            if (s != "4") continue
            val newLoc = loc.toBlockLocation().add(i.toDouble(), (-ti).toDouble(), 0.0)
            newLoc.block.blockData = blockColorMap[type?.uppercase()]?.let { Bukkit.createBlockData(it) }!!
        }
    }
}
