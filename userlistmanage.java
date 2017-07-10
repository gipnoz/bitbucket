package Module2_1;


import java.util.Scanner;

public class userlistmanage {
    private static int scanner() {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Enter the integer");
            scanner();
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Enter list size: ");
        list list = listsize(scanner());
        while (true){
            menu();
            int menu = scanner();
            if (menu==1){
                System.out.printf("Enter your number: ");
                list.add(scanner());
            }

        else if (menu==2){
                System.out.println("Select remove type: ");
                System.out.println("1.Remove by value");
                System.out.println("2.Remove by index");
                if (scanner()==1){System.out.println("Enter value");
                    list.removebyvalue(scanner());}
                else if (scanner()==2){System.out.println("Enter index");
                    list.removebyindex(scanner());}
                else break;
            }
            else if (menu==3){
                System.out.println("enter index");
                list.getbyindex(scanner());
            }
            else if (menu==4){
                System.out.println("enter volue");
                list.getbyvalue(scanner());
            }
            else if (menu==5){
                System.out.println(list.maxvalue());
            }
            else if (menu==6){
                System.out.println(list.minvalue());
            }
            else if (menu==7){
                System.out.println(list.mediumarithmetic());
            }
            else break;
        }}

    private static void menu(){
        System.out.println("Select menu below:");
        System.out.println("1. Add element");
        System.out.println("2. Remove element");
        System.out.println("3. Find element by index");
        System.out.println("4. Find element by value");
        System.out.println("5. Find max value");
        System.out.println("6. Find min value");
        System.out.println("7. Find average");
        System.out.println("For EXIT - press any button");
    }

    private static list listsize(int sizecheck) {
        if (sizecheck < 0) {
            System.out.println("Enter positive value");
            listsize(sizecheck);
        }
        return new list(sizecheck);
    }
}
