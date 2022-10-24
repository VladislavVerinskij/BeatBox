package com.bignerdranch.android.beatbox


import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class SoundViewModelTest {
    private lateinit var sound: Sound
    private lateinit var subject: SoundViewModel

    @org.junit.Before
    fun setUp() {
        sound = Sound("assetPatch")
        subject = SoundViewModel()
        subject.sound = sound
    }

    @Test
    fun exposesSoundNameAsTitle() {
        assertThat(subject.title, `is`(sound.name))
    }

    @Test
    fun callsBeatBoxPlayOnButtonClicked() {
        subject.onButtonClicked()
    }
}