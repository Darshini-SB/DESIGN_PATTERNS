// Abstract handler in Chain of Responsibility pattern
abstract class Logger {
    protected Logger next;
    public void setLogger(Logger next)
    {
        this.next = next;
    }
    public void message(String msg, LogLevel level)
    {
        if(canHandle(level))
        {
            write(msg);
        }
        else if(next != null)
        {
            next.message(msg, level);
        }
    }

    protected abstract boolean canHandle(LogLevel level);
    
    protected abstract void write(String msg);
}

enum LogLevel{
    INFO, DEBUG, ERROR;
}
