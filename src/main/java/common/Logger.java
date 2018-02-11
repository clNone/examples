package common;

public class Logger {

    private static final String LOG_TEMPLATE = "[%s.class]: %s";
    private String className;

    public Logger(Class clazz) {
        this.className = clazz.getName();
    }

    public void log(String message) {
        System.out.println(String.format(LOG_TEMPLATE, this.className, message));
    }
}
