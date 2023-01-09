import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day1a {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Moises.garcia\\repos\\AdventOfCode\\2022\\day-1\\input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int calorieTracker = 0;
        int mostCalories = 0;


        while ((st = br.readLine()) != null) {
            if (st.isEmpty()) {
                if (calorieTracker > mostCalories) {
                    mostCalories = calorieTracker;
                }
                calorieTracker = 0;
                continue;
            }
            calorieTracker += Integer.parseInt((st));
        }
        System.out.println(mostCalories);
        br.close();
        
    }
}