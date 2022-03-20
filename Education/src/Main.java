import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String s = "Education is one thing no one can take away from you";

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Type a string: ");
            String s2 = sc.next();
            if(s2.equals("quit")) {
                System.out.println("End of program");
                break;
            }
            if(s.indexOf(s2) == -1)
                System.out.println("String not found");
            else {
                int pos = s.indexOf(s2);
                System.out.println("pos after initialization " + pos);
                while(pos != s.lastIndexOf(s2)) {
                    System.out.println("Pos inside while: " + pos);
                    System.out.println("Position: " + s.indexOf(s2,pos) + "-" + (s.indexOf(s2,pos) + s2.length() - 1));
                    pos = s.indexOf(s2, pos + 1);
                    System.out.println("Pos inside while 2: " + pos);
                }
                System.out.println("Position: " + s.indexOf(s2,pos) + "-" + (s.indexOf(s2,pos) + s2.length() - 1));
                System.out.println("pos outside while " + pos);

                System.out.println(s.replace(s2, "X".repeat(s2.length())));
            }
        }
    }
}

