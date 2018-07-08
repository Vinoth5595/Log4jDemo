
package log4jdemo;

/**
 *
 * @author Vinoth
 */
public class Log4jDemo {

    GenLog logObj = GenLog.getInstance();

    static {
        GenLog.readlog4jConfig();
    }

    /**
     *Sample method used for logging using LOg4j
     */
    public void start() {
        logObj.genlog("Debug", "D");
        logObj.genlog("Info", "I");
        logObj.genlog("Warn", "W");
        logObj.genlog("Fatal", "F");
        logObj.genlog("Error", "E");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Log4jDemo obj = new Log4jDemo();
        obj.start();

    }

}
