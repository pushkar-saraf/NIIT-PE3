import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q11 {
    public static void main(String[] args) {
        Map<String, Integer> frequencies = new HashMap<String, Integer>();
        File file = new File("src/FileDemo.txt");
        try {
            System.out.println("The frequencies are:");
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String s = br.readLine();
                if (s != null) {
                    String[] words = s.split(" ");
                    for (String word : words) {
                        if (word.contains(",")){
                            word = word.replace(",","");
                        }
                        if (word.contains(".")){
                            word = word.replace(".","");
                        }
                        int frequency = frequencies.getOrDefault(word, 0) + 1;
                        frequencies.put(word, frequency);
                    }
                } else {
                    break;
                }
            }
            for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

