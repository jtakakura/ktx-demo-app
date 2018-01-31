package com.github.jtakakura.demos.ktx.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.github.jtakakura.demos.ktx.KtxDemoApp

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        LwjglApplication(KtxDemoApp(), config)
    }
}
