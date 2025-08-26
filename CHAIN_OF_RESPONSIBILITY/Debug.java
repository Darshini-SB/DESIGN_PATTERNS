// Debug logger handler
public class Debug extends Logger{
    protected boolean canHandle(LogLevel level)
    {
        return level == LogLevel.DEBUG;
    }
    protected void write(String msg)
    {
        System.out.println("[DEBUG]" + msg);
    }
}
