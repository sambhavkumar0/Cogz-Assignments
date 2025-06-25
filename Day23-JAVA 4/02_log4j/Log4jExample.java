import org.apache.log4j.Logger;

public class Log4jExample {
    static Logger logger = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.info("Info message using Log4J");
        logger.error("Error message");
    }
}