@file:Command(
    "tetris",
    description = "Tetris utility command",
    permission = "tetris.{0}",
    permissionMessage = "You do not have permission to execute this command"
)

package com.azuyamat.tetris.commands

import com.azuyamat.tetris.utils.format
import com.azuyamat.tetris.utils.generateBlock
import me.honkling.commando.lib.Command
import org.bukkit.entity.Player

fun tetris(executor: Player){
    executor.sendMessage("&bBuilt for &3Drysu".format())
}

fun generate(executor: Player, block: String?){
    generateBlock(executor.location, block?:"I")
}

