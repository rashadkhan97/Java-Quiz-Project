import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) throws IOException, ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        String userPath = "./src/main/resources/users.json"; //storing the path inside userPath
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(userPath));

        for (Object obj : jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;

            if (jsonObject.get("username").equals(username) && jsonObject.get("password").equals(password)) {
                String role = jsonObject.get("role").toString();
                if (role.equals("admin")) {
                    System.out.println("Welcome admin! Please create new questions in the question bank.");
                    Admin admin = new Admin(); //creating object of admin class
                    admin.adminDashboard();
                } else if (role.equals("student")) {
                    System.out.println("Welcome " + username + " to the quiz!");
                    Student student = new Student(); //creating object of student class
                    student.studentDashboard();
                }
            }
        }
        sc.close();
    }
}
