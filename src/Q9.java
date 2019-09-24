import java.io.*;

public class Q9 {
    public static void main(String[] args) {
        File file = new File("src/file.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            int fileLen = 0;
            while(true){
                String s = br.readLine();
                if(s!=null) {
                    fileLen += 1;
                    sb.append(s).append("\n");
                } else {
                    break;
                }
            }
            String result = sb.toString().toUpperCase();
            System.out.println(result);
            System.out.println("File length was: "+ fileLen);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
