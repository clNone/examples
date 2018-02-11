import common.Logger;
import patterns.creational.LoggerFactory;

public class Main {
    public Main() {}

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.log("test");
    }
}
