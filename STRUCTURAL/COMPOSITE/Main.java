class Main{
    public static void main(String[] args){
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        File file3 = new File("file3.txt", 300);

        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        Folder root = new Folder("root");
        folder1.addFile(file1);
        folder1.addFile(file2);
        folder2.addFile(file3);
        root.addFile(folder1);
        root.addFile(folder2);
        root.showDetails("");
    }
}