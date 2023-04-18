package com.azuyamat.tetris.utils

import net.kyori.adventure.text.TextComponent
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer

fun String.format(): TextComponent {
    return LegacyComponentSerializer.legacyAmpersand()
        .deserialize(this)
}