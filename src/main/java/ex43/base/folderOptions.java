package ex43.base;

public class folderOptions {
    public boolean willCreateFolder(String answer){
        if(answer.equalsIgnoreCase("y"))
            return true;
        else
            return false;
    }
}
