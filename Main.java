import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? : ");
        String name = scanner.nextLine();
        System.out.print("How old are du? : ");
        int age = scanner.nextInt();
        System.out.print("Where do you live? : ");
        String placeOfResidence = scanner.next();
        System.out.print("What is your hobby? : ");
        String myHobby = scanner.next();

        System.out.println("Firs variant (tabular format): ");
        System.out.println("Name:\t" + name);
        System.out.println("Age:\t" + age);
        System.out.println("City:\t" + placeOfResidence);
        System.out.println("Hobby:\t" + myHobby);
    }
}