package sarkar.java.stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import sarkar.java.common.Enrollment;
import sarkar.java.common.ModelJson;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JsonStreamTest {

    static ArrayList<ModelJson> mono = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException {

        loadMonoList();
    /*
        // Solution 1
        boolean isEnrolled = mono.stream()
                .anyMatch(m -> (m.getName().equals("PLAN-IT-AMOUNT") || m.getName().equals("PLAN-IT-TRANSACTION"))
                        && m.getEnrollment().getStatus().equals("ENROLLED"));
        
        if (isEnrolled) {
            System.out.println("Update the List");
        }
    */


        // Solution 2
        long count = mono.stream()
                .filter(m -> m.getName().equals("PLAN-IT-AMOUNT") || m.getName().equals("PLAN-IT-TRANSACTION"))
                .filter(a -> a.getEnrollment().getStatus().equals("ENROLLED"))
                .count();

        if (count > 0) {
            System.out.println("Update the List");
        }


        mono.stream()
                .filter(f -> f.getName().startsWith("PLAN-IT"))
                .forEach(s -> System.out.println(s.getName()));


    }

    private static void loadMonoList() {
        Object obj = null;
        try (FileReader reader = new FileReader("test.json")) {
            obj = new JSONParser().parse(reader);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        JSONArray jsonArray = (JSONArray) obj;
        jsonArray.forEach(ent -> parseModelJson((JSONObject) ent));
    }

    private static void parseModelJson(JSONObject ent) {
        ModelJson modelJson = new ModelJson();
        modelJson.setId((String) ent.get("id"));
        modelJson.setName((String) ent.get("name"));

        JSONArray jsonArray = (JSONArray) ent.get("enrollments");
        for (Object obj : jsonArray) {
            modelJson.setEnrollment(buildEnrollmentObject((JSONObject) obj));
        }
        mono.add(modelJson);
    }

    private static Enrollment buildEnrollmentObject(JSONObject obj) {
        return new Enrollment((String) obj.get("id"), (String) obj.get("enrollment-type"), (String) obj.get("status"));
    }


}
