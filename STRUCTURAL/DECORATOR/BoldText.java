// Bold text decorator
public class BoldText extends TextDecor{
    public BoldText(Text textDecor)
    {
        super(textDecor);
    }
    public String style()
    {
        return "<b>" + super.style() + "</b>";
    }
}
