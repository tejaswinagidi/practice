import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class FileToByteArrayDemo {

    public static void main(String[] args) {
        File file = new File("Employee.txt");
        
   
        byte[] bArray = readFileToByteArray(file);
        //displaying content of byte array
        for (int i = 0; i < bArray.length; i++){
           System.out.print((char) bArray[i]);
        }  
    }
    
    private static byte[] readFileToByteArray(File file){
        FileInputStream fis = null;
        // Creating a byte array using the length of the file
        // file.length returns long which is cast to int
        byte[] bArray = new byte[(int) file.length()];
        try{
            fis = new FileInputStream(file);
            fis.read(bArray);
            fis.close();        
            
        }catch(IOException ioExp){
            ioExp.printStackTrace();
        }
        return bArray;
    }
}