package com.handen.facade

class CodecFactory {
    companion object {
        fun extract(file: VideoFile): Codec {
            val type = file.codecType
            if (type == "mp4") {
                println("CodecFactory: extracting mpeg audio...")
                return MPEG4CompressionCodec()
            } else {
                println("CodecFactory: extracting ogg audio...")
                return OGGCompressionCodec()
            }
        }
    }
}