import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q10 {
    public static void main(String[] args) {
        File folder = new File("src");
        String[] files = folder.list();
        String filename = "";
        if (files != null) {
            System.out.println("Files in current dir");
            for (String file : files) {
                System.out.println(file);
                if (file.contains(".")) {
                    if (file.split("\\.")[1].equals("pps")) {
                        filename = file.split("\\.")[0];
                    }
                }
            }
        }
        System.out.println("The file was read as:");
        if (!filename.isBlank()) {
            File fileToRead = new File("src/" + filename + ".pps");
            byte[] fileArray = readFileToByteArray(fileToRead);
            for (byte b : fileArray) {
                System.out.print((char) b);
            }
        }
    }

    private static byte[] readFileToByteArray(File file) {
        FileInputStream fis = null;
        // Creating a byte array using the length of the file
        // file.length returns long which is cast to int
        byte[] bArray = new byte[(int) file.length()];
        try {
            fis = new FileInputStream(file);
            int status = fis.read(bArray);
            fis.close();
        } catch (IOException ioExp) {
            ioExp.printStackTrace();
        }
        return bArray;
    }
}
