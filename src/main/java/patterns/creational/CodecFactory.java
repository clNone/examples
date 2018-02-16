package patterns.creational;

import common.Logger;
import video.VideoCodec;
import video.VideoFile;

public class CodecFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(CodecFactory.class);

    public static VideoCodec extractCodec(VideoFile sourceFile) {
        LOGGER.log("Extracting codec from: " + sourceFile.getFullFileName());
        return new VideoCodec(sourceFile.getFormat());
    }

    public static VideoCodec createCodec(String format) {
        LOGGER.log("Creating codec for format: " + format);
        return new VideoCodec(format);
    }
}
