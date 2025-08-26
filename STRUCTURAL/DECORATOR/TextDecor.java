// Abstract decorator class
public abstract class TextDecor implements Text{
    protected Text textDecor;
    public TextDecor(Text textDecor)
    {
        this.textDecor = textDecor;
    }
    public String style()
    {
        return textDecor.style();
    }
}
