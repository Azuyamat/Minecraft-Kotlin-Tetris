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

class  GameModeC {

    fun gamemode(executor: Player, mode: String, target: Player?) {
        val target = target ?: executor
        val gameMode = mappedGamemode.entries
            .firstOrNull { it.key.contains(mode.lowercase()) }
            ?.value

        if(gameMode == null) {
            executor.sendMessage("&3Game Mode &b".format())
        }
    }

    private val mappedGamemode = mapOf(
        setOf("creative", "c", "1") to GameMode.CREATIVE,
        setOf("survival", "s", "0") to GameMode.SURVIVAL,
        setOf("adventure", "a", "2") to GameMode.ADVENTURE,
        setOf("spectator", "sp", "3") to GameMode.SPECTATOR
    )
}