public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDocument = pdfFactory.createDoc();
        pdfDocument.open();

        DocumentFactory wordFactory = new WordFactory();
        Document wordDocument = wordFactory.createDoc();
        wordDocument.open();
    }
}
