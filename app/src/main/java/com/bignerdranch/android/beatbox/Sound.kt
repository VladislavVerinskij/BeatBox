package com.bignerdranch.android.beatbox

private const val WAV = ".wav"

class Sound(val assetPatch: String, var soundId: Int? = null ) {

    val name = assetPatch.split("/").last().removeSuffix(WAV)
}