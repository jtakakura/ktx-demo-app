package com.github.jtakakura.demos.ktx

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import ktx.app.KtxInputAdapter
import ktx.log.info

class KtxDemoApp : ApplicationAdapter(), KtxInputAdapter {
    private lateinit var batch: SpriteBatch
    private lateinit var img: Texture

    override fun create() {
        Gdx.input.inputProcessor = this

        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
    }

    override fun render() {
        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        batch.draw(img, 0f, 0f)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        img.dispose()
    }

    override fun touchDown(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
        info { "Touched=> x: $screenX / y: $screenY" }

        return false
    }
}
