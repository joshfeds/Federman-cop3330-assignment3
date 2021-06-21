package ex43.base;

public class folderOptions {
    //boolean to determine if folder will be created
    public boolean willCreateFolder(String answer){
        if(answer.equalsIgnoreCase("y"))
            return true;
        else
            return false;
    }
}
