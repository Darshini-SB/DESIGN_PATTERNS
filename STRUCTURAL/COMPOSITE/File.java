class File implements FileSystem{
    private String name;
    private int size;
    public File(String name, int size){
        this.name = name;
        this.size = size;
    }
    public void showDetails(String indent){
        System.out.println(indent + name + "(" + size + "KB)");
    }
}