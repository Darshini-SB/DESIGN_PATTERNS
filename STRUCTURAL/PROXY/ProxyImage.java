package PROXY;

public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;
    
    public ProxyImage(String fileName)
    {
        this.fileName = fileName;
        // RealImage not created here - lazy loading
    }
    
    public void display()
    {
        if(realImage == null)
        {
            realImage = new RealImage(fileName); // Create only when first needed
        }
        realImage.display();
    } 
}
