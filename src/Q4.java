import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        while (true){
            String country = scanCountry();
            if(country.isBlank()){
                break;
            } else {
                countries.add(country);
            }
        }
        int i = 0;
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        for (String country : countries) {
            for (String vowel : vowels) {
                country = country.replace(vowel, "");
            }
            System.out.println("Place name without vowels:" + i +" "+country);
            i += 1;
        }
    }

    private static String scanCountry() {
        boolean done = false;
        String result = "";
        while (!done) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Country: ");
            result = sc.nextLine();
            done = true;
        }
        return result;
    }
}
