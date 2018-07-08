package log4jdemo;

import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Vinoth
 */
class GenLog {

    private static GenLog logObj;

    private GenLog() {

    }

    public static GenLog getInstance() {
        if (logObj == null) {
            logObj = new GenLog();
        }
        return logObj;
    }

    static Logger logger = Logger.getLogger(GenLog.class);

    public static void readlog4jConfig() {
        String log4jConfigFile = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "resources"
                + File.separator + "log4j.properties";

        PropertyConfigurator.configure(log4jConfigFile);

    }

    public void genlog(String message, String type) {
        if (type.equalsIgnoreCase("D")) {
            logger.debug(message);
        }
        if (type.equalsIgnoreCase("I")) {
            logger.info(message);
        }
        if (type.equalsIgnoreCase("W")) {
            logger.warn(message);
        }
        if (type.equalsIgnoreCase("E")) {
            logger.error(message);
        }
        if (type.equalsIgnoreCase("F")) {
            logger.fatal(message);
        }

    }

}
