import java.util.List;
import java.util.ArrayList;

class Folder implements FileSystem{
    private String name;
    private List<FileSystem> files;
    public Folder(String name){
        this.name = name;
        this.files = new ArrayList<>();
    }
    public void addFile(FileSystem file){
        files.add(file);
    }
    public void showDetails(String indent){
        System.out.println(indent + name);
        for(FileSystem file : files){
            file.showDetails(indent + "  ");
        }
    }
}