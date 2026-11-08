import java.io.FileWriter;
import java.io.IOException;

public class MyThread extends Thread {
    private String userName;
    private String pass;

    MyThread(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;
    }

    @Override
    public void run() {
        Student student = new Student(userName, pass);
        student.getinfo();

        try (FileWriter writer = new FileWriter("loginlog.txt", true)) {
            writer.write("Login successful - Username: " + userName + "Pass: " + pass + "\n");
            
        } catch (IOException e) {
            System.out.println("Could not write to the log file.");
        }
    }
}
