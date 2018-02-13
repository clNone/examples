package video;

import common.Logger;
import patterns.creational.LoggerFactory;

public class VideoReader {

    private static final Logger LOGGER = LoggerFactory.getLogger(VideoReader.class);
    private static final String READ_TEMPLATE = "Reading file: %s with codec: %s";

    public static VideoBuffer read(VideoFile sourseFile, VideoCodec sourseCodec) {
        LOGGER.log(String.format(READ_TEMPLATE, sourseFile.getFullFileName(), sourseCodec.getFormat()));
        return new VideoBuffer(sourseFile, sourseCodec);
    }
}
