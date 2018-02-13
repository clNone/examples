package patterns.structural;

import common.Logger;
import patterns.creational.CodecFactory;
import patterns.creational.LoggerFactory;
import video.*;

public class VideoConverterFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(VideoConverterFacade.class);

    public VideoFile convert(String fileName, String format) {
        LOGGER.log("Conversion started");
        VideoFile sourceFile = new VideoFile(fileName);
        VideoCodec sourceCodec = CodecFactory.extractCodec(sourceFile);
        VideoCodec destinationCodec = CodecFactory.createCodec(format);
        VideoBuffer buffer = VideoReader.read(sourceFile, sourceCodec);
        VideoFile destinationFile = VideoWriter.write(buffer, destinationCodec);
        LOGGER.log("Conversion finished");
        return destinationFile;
    }
}
