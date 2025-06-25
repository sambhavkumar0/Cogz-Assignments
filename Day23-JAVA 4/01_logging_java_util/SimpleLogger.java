import java.util.logging.*;

public class SimpleLogger {
    private static final Logger logger = Logger.getLogger(SimpleLogger.class.getName());

    public static void main(String[] args) {
        logger.info("Application started");
        logger.warning("This is a warning");
        logger.severe("This is an error");
    }
}