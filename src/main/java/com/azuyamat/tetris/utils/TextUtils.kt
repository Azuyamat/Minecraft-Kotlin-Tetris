package com.azuyamat.tetris.utils

import net.kyori.adventure.text.TextComponent
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer

class TextUtils() {
    companion object {
        fun format(s: String) : TextComponent = LegacyComponentSerializer.legacyAmpersand().deserialize(s)
    }
}