import common.Logger;
import patterns.creational.LoggerFactory;
import patterns.structural.VideoConverterFacade;
import video.VideoFile;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public Main() {
    }

    public static void main(String[] args) {
        LOGGER.log("Program start");
        VideoConverterFacade videoConverterFacade = new VideoConverterFacade();
        VideoFile videoFile = videoConverterFacade.convert("filename.oldFormat", "newFormat");
        LOGGER.log("Program end");
    }
}
