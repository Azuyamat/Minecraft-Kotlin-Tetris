@file:Command(
    "gamemode",
    "gm",
    description = "Game mode utility command",
    permission = "tetris.{0}",
    permissionMessage = "You do not have permission to execute this command"
)

package com.azuyamat.tetris.commands

import com.azuyamat.tetris.utils.TextUtils
import me.honkling.commando.lib.Command
import org.bukkit.GameMode
import org.bukkit.entity.Player

class GameModeC {

    fun gamemode(executor: Player, mode: String, target: Player?){
        val player : Player = target ?: executor
        var modeM : GameMode? = null
        when (mode.lowercase()) {
            "creative" -> modeM = GameMode.CREATIVE
            "survival" -> modeM = GameMode.SURVIVAL
            "spectator" -> modeM = GameMode.SPECTATOR
            "adventure" -> modeM = GameMode.ADVENTURE
        }
        if (modeM == null) {
            executor.sendMessage(TextUtils.format("&3Game Mode &b"))
        }

    }
}