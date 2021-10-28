package com.veldan.fragment_test

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils

class FragmentTestGame : ApplicationAdapter() {

    private val batch by lazy { SpriteBatch() }
    private val img by lazy { Texture("badlogic.jpg") }

    override fun render() {
        ScreenUtils.clear(1f, 0f, 0f, 1f)
        batch.begin()
        batch.draw(img, 0f, 0f)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        img.dispose()
    }
}