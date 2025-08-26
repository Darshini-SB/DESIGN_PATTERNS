// Underline text decorator
public class Underline extends TextDecor{
    public Underline(Text textDecor)
    {
        super(textDecor);
    }
    public String style()
    {
        return "<u>" + super.style() + "</u>";
    }
}
