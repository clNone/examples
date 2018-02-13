package video;

import common.Logger;
import patterns.creational.LoggerFactory;

public class VideoWriter {

    private static final Logger LOGGER = LoggerFactory.getLogger(VideoWriter.class);

    public static VideoFile write(VideoBuffer buffer, VideoCodec destinationCodec) {
        LOGGER.log("Writing file with format: " + destinationCodec.getFormat());
        return new VideoFile(buffer.getFileName() + '.' + destinationCodec.getFormat());
    }
}
