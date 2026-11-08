import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Username: ");
            String userName = sc.nextLine();

            if (userName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Password: ");
            String pass = sc.nextLine();

            if (pass.equalsIgnoreCase("exit")) {
                break;
            }

            MyThread login = new MyThread(userName, pass);
            login.start();
            try {
                login.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Login was interrupted.");
                break;
            }
        }

        sc.close();
    }

}
