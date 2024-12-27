import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Admin {

    public void adminDashboard() throws IOException, ParseException {

        Scanner sc = new Scanner(System.in);

        String quizPath="./src/main/resources/quiz.json"; //storing the path inside quizPath
        JSONParser parser= new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(quizPath));

        while (true)
        {
            System.out.println("Input your question");
            String question = sc.nextLine();

            System.out.println("Input option 1:");
            String option_01 = sc.nextLine();

            System.out.println("Input option 2:");
            String option_02 = sc.nextLine();

            System.out.println("Input option 3:");
            String option_03 = sc.nextLine();

            System.out.println("Input option 4:");
            String option_04 = sc.nextLine();

            System.out.println("What is the answer key?");
            String answerKey = sc.nextLine();

            JSONObject questionObj = new JSONObject();
            questionObj.put("question", question);
            questionObj.put("option 1", option_01);
            questionObj.put("option 2", option_02);
            questionObj.put("option 3", option_03);
            questionObj.put("option 4", option_04);
            questionObj.put("answerkey", answerKey);

            jsonArray.add(questionObj); //add as array

            System.out.println("Saved successfully! Do you want to add more questions? (press s for start and q for quit)");
            String pressKey = sc.nextLine();

            if (pressKey.equalsIgnoreCase("q"))
            {
                break;
            }
        }

        FileWriter writer = new FileWriter(quizPath);
        writer.write(jsonArray.toJSONString());
        writer.flush();
        writer.close();

        sc.close();
    }

}
