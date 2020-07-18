package com.handen.facade

class VideoFile(val name: String) {
    val codecType = name.substring(name.indexOf(".") + 1)

}