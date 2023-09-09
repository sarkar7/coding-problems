package sarkar.linkedin.localtime;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;

public class LocalTimeTest {

    public static void main(String[] args) {

        LocalTime initialTime = LocalTime.of(6,30,0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));

        HashMap<String, Integer> pantry = new HashMap<>();

        pantry.put("Apples", 3);
        pantry.put("Oranges", 2);

        int currentApples = pantry.get("Apples");
        pantry.put("Apples", currentApples + 4);

        System.out.println(pantry.get("Apples"));

    }

}
