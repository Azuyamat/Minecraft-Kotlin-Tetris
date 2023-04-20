package com.azuyamat.tetris

import me.honkling.commando.CommandManager
import org.bukkit.plugin.java.JavaPlugin


var instance : Tetris? = null

class Tetris : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        val commandManager = CommandManager(this)
        commandManager.registerCommands("com.azuyamat.tetris.commands")
        logger.info("Loaded commands: ${commandManager.commands.size}\n\n${commandManager.commands}\n")
        instance = this
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
