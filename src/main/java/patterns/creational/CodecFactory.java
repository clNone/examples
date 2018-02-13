package patterns.creational;

import common.Logger;
import video.VideoCodec;
import video.VideoFile;

public class CodecFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(CodecFactory.class);

    public static VideoCodec extractCodec(VideoFile sourseFile) {
        LOGGER.log("Extracting codec from: " + sourseFile.getFullFileName());
        return new VideoCodec(sourseFile.getFormat());
    }

    public static VideoCodec createCodec(String format) {
        LOGGER.log("Creating codec for format: " + format);
        return new VideoCodec(format);
    }
}
