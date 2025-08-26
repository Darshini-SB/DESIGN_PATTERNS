package PROXY;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        image1.display(); // First call - loads image
        System.out.println("");
        image1.display(); // Second call - uses cached image
    }
}
