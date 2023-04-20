@file:Command(
    "gamemode",
    "gm",
    description = "Game mode utility command",
    permission = "tetris.{0}",
    permissionMessage = "You do not have permission to execute this command"
)

package com.azuyamat.tetris.commands

import com.azuyamat.tetris.utils.format
import me.honkling.commando.lib.Command
import org.bukkit.GameMode
import org.bukkit.entity.Player

fun gamemode(executor: Player, mode: String, target: Player?) {
    val target = target ?: executor
    val gameMode = mappedGamemode.entries
        .firstOrNull { it.key.contains(mode.lowercase()) }
        ?.value

    if(gameMode == null) executor.sendMessage("&cGame mode can't be found &4$mode".format())
    else {
        executor.sendMessage("&bGame mode set to &3${gameMode.name} &bfor &3${target.name}".format())
        target.gameMode = gameMode
    }
}

private val mappedGamemode = mapOf(
    setOf("creative", "c", "1") to GameMode.CREATIVE,
    setOf("survival", "s", "0") to GameMode.SURVIVAL,
    setOf("adventure", "a", "2") to GameMode.ADVENTURE,
    setOf("spectator", "sp", "3") to GameMode.SPECTATOR
)