// Italic text decorator
public class ItalicText extends TextDecor{
    public ItalicText(Text textDecor)
    {
       super(textDecor);
    }
    public String style()
    {
        return "<i>" + super.style() + "</i>";
    }
}
