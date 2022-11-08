import java.util.Scanner;

/* Welcome to project
    @author: tienb
    Date: 11/5/2022
    Time: 11:26 AM
    
    ProjectName: Bai8
*/public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCard managerCard = new ManagerCard();
        while(true){
            System.out.println("Enter code to choice:");
            System.out.println("Enter 1: Insert card");
            System.out.println("Enter 2: Remove card");
            System.out.println("Enter 3: Show cards");
            System.out.println("Enter 4: Exit System");
            String choice = scanner.nextLine();
            switch (choice){
                case "1": {
                    System.out.println("");
                }
            }

        }

    }
}
