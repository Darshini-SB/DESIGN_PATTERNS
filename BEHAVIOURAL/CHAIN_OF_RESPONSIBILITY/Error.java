// Error logger handler
public class Error extends Logger{
    protected boolean canHandle(LogLevel level)
    {
        return level == LogLevel.ERROR;
    }
    protected void write(String msg)
    {
        System.out.println("[ERROR]" + msg);
    }
}
