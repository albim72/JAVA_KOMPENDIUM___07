package some_complex_media_lib;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec){
        System.out.printf("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec){
        System.out.printf("BitrateReader: writing file...");
        return buffer;
    }
    
}
