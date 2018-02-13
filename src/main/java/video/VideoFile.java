package video;

import common.Logger;
import patterns.creational.LoggerFactory;

public class VideoFile {

    private static final Logger LOGGER = LoggerFactory.getLogger(VideoFile.class);

    private String format;
    private String fileName;
    private String fullFileName;

    public VideoFile(String fileName) {
        LOGGER.log("Opening file: " + fileName);
        String[] file = fileName.split("\\.");
        this.fullFileName = fileName;
        this.fileName = file[0];
        this.format = file[1];
    }

    public String getFormat() {
        return format;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFullFileName() {
        return fullFileName;
    }
}
