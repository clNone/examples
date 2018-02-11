package patterns.creational;

import common.Logger;

public class LoggerFactory {

    private LoggerFactory() {}

    public static Logger getLogger(Class clazz) {
        return new Logger(clazz);
    }
}
