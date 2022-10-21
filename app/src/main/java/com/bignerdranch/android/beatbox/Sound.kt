package com.bignerdranch.android.beatbox

private const val WAV = ".wav"

class Sound(val assetPatch: String) {

    val name = assetPatch.split("/").last().removeSuffix(WAV)
}