package video;

import common.Logger;
import patterns.creational.LoggerFactory;

public class VideoCodec {

    private static final Logger LOGGER = LoggerFactory.getLogger(VideoCodec.class);

    private String format;

    public VideoCodec(String format) {
        LOGGER.log("Created codec for: " + format);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
