// Concrete component implementation
public class PlainText implements Text{
    private String content;
    public PlainText(String content)
    {
        this.content = content;
    }
    public String style()
    {
        return content;
    }
}
