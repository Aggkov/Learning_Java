import java.io.*;
import java.util.Scanner;


public class Main {

    //check user input
    public static int readInt(Scanner sc, int lower, int upper) {
        int choice;
        while(true) {
            System.out.println("Your choice please: ");
            if(sc.hasNextInt()) {
                choice = sc.nextInt();
                if(choice < lower || choice > upper) {
                    System.out.println("Error:  Between " + lower + " and " + upper);
                }
                else
                    return choice;
            }
            else {
                //flush input
                sc.next();
                System.out.println("Invalid input");
            }
        }
    }

    public static void saveFile(String fileName, User[] array, int currentUsers) {
        File f = new File("Users.bin");

        try (ObjectOutputStream os = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(f)))) {
            //write users in file and save
            for(int i = 0; i <= currentUsers; i++)
                os.writeObject(array[i]);
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }

    public static int readFile(String fileName, User[] array) {
        File f = new File("Users.bin");

        //count users in file
        int count = 0;
        try (ObjectInputStream os = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(f)))) {
            //while loop because I don't know how many records are in
            while(true) {
                array[count] = (User) os.readObject();
                count++;
            }
        }
        catch(IOException  | ClassNotFoundException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        final int MAXUSERS = 10;
        //if we want to change fileName we can do it here once.
        final String fileName = "Users.bin";
        User[] array = new User[MAXUSERS];

        //Read bin.file
        int currentUsers = readFile(fileName,array);

        //get user input
        try(Scanner sc = new Scanner(System.in)) {
            boolean exit = false;
            while (!exit) {

                //Print Menu to User
                System.out.println("==================");
                System.out.println("Menu");
                System.out.println("1-Insert User");
                System.out.println("2-Delete User");
                System.out.println("3-Print User");
                System.out.println("4-Exit");

                //Choice gets saved
                int choice = readInt(sc,1,4);

                switch(choice) {
                    case 1:
                        if(currentUsers == 10) {
                            System.out.println("Max users reached");
                            break;
                        }
                        sc.nextLine();
                        System.out.println("Insert new user");
                        System.out.print("Full name: ");
                        String fullName = sc.nextLine();
                        System.out.print("username: ");
                        String username = sc.next();
                        System.out.print("password: ");
                        String password = sc.next();
                        System.out.print("Role(1-admin, 2-user): ");
                        int role = readInt(sc,1,2);
                        array[currentUsers] = new User(fullName, username, password, role);
                        currentUsers++;
                        System.out.println("User added! ");

                        break;
                    case 2:
                        sc.nextLine();
                        System.out.println("Delete user");
                        System.out.print("Give full name: ");
                        String name = sc.nextLine();

                        //delete user if found
                        boolean found = false;
                        for (int i = 0; i < currentUsers; i++) {
                            if (array[i].getFullName().equals(name)) {
                                found = true;
                                array[i] = array[currentUsers - 1];
                                currentUsers--;
                                System.out.println("User deleted! ");
                            }
                        }
                        if(!found) {
                            System.out.println("Cant delete, user not found");
                        }
                        break;
                    case 3:
                        for(int i = 0; i < currentUsers; i++)
                            System.out.println(array[i]);
                        break;
                    case 4:
                        exit = true;
                        //save
                        saveFile(fileName,array,currentUsers);
                }
            }
        }
    }
}