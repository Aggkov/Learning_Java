import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "";

        while (!s.equals("q")) {
            System.out.print("> ");
            //system waits for user to type something
            s = sc.next();
            //Inputs get read as Strings(Tokens)
            System.out.println("Token: " + s);
        }

        sc.close();
    }
}
