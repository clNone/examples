package video;

import common.Logger;
import patterns.creational.LoggerFactory;

public class VideoBuffer {

    private static final Logger LOGGER = LoggerFactory.getLogger(VideoBuffer.class);
    private static final String READ_TEMPLATE = "File read: %s with codec: %s";

    private String fileName;

    public VideoBuffer(VideoFile sourseFile, VideoCodec sourceCodec) {
        LOGGER.log(String.format(READ_TEMPLATE, sourseFile.getFullFileName(), sourceCodec.getFormat()));
        this.fileName = sourseFile.getFileName();
    }

    public String getFileName() {
        return fileName;
    }
}
