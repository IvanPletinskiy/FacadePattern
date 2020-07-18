package com.handen.facade

fun main() {
    val facade = VideoConversionFacade()
    val mp4Video = facade.convertVideo("youtubevideo.ogg", "mp4")
}