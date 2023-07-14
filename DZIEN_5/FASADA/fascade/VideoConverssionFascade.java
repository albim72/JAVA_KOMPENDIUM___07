package fascade;

import some_complex_media_lib.*;

import java.io.File;

public class VideoConverssionFascade {
    public File convertingVideo(String fileName,String format){
        System.out.printf("VideoConverssionFascade: conversion started");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if(format.equals("mp4")){
            destinationCodec = new MPEG4CompressionCodec();
        }
        else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file,sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer,destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.printf("VideoConverssionFascade: conversion complited");
        return result;
    }
}
