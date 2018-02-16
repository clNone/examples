package video;

import common.Logger;
import patterns.creational.LoggerFactory;

public class VideoReader {

    private static final Logger LOGGER = LoggerFactory.getLogger(VideoReader.class);
    private static final String READ_TEMPLATE = "Reading file: %s with codec: %s";

    public static VideoBuffer read(VideoFile sourceFile, VideoCodec sourceCodec) {
        LOGGER.log(String.format(READ_TEMPLATE, sourceFile.getFullFileName(), sourceCodec.getFormat()));
        return new VideoBuffer(sourceFile, sourceCodec);
    }
}
