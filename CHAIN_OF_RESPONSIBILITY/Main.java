public class Main {
    public static void main(String args[])
    {
        Logger infoLogger = new Info();
        Logger debugLogger = new Debug();
        Logger errorLogger = new Error();
        
        infoLogger.setLogger(debugLogger); // Chain: Info -> Debug
        debugLogger.setLogger(errorLogger); // Chain: Debug -> Error

        infoLogger.message("the info message ", LogLevel.INFO);
        infoLogger.message("the debug message ", LogLevel.DEBUG);
        infoLogger.message("the error message ", LogLevel.ERROR);
    }
}
