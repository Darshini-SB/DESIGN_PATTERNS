package PROXY;

public class RealImage implements Image{
    private String fileName;
    
    public RealImage(String fileName)
    {
        this.fileName = fileName;
        loadImageFromDisk(); // Expensive operation - loads immediately
    }
    
    private void loadImageFromDisk()
    {
       System.out.println("loading image " + fileName);
    }
    
    public void display()
    {
       System.out.println("displaying image " + fileName);
    }
}
