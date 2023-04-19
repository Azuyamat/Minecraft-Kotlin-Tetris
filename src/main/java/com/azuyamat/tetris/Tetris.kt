package com.azuyamat.tetris

import me.honkling.commando.CommandManager
import org.bukkit.plugin.java.JavaPlugin

class Tetris : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        val commandManager = CommandManager(this)
        commandManager.registerCommands("com.azuyamat.tetris.commands")
        println("3")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
