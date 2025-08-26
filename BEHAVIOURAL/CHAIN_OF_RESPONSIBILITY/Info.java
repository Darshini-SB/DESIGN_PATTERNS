// Info logger handler
public class Info extends Logger {
    protected boolean canHandle(LogLevel level)
    {
        return level == LogLevel.INFO;
    }
    protected void write(String msg)
    {
        System.out.println("[INFO]" + msg);
    }
}
