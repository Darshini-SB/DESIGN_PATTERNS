public class Main {
    public static void main(String[] args) {
        Document doc1 = new Document("Hello, world!", "My Document");
        Document doc2 = doc1.Clone();
        doc2.setContent("Hello, world! updated");
        doc1.showdetails();
        doc2.showdetails();
    }
}