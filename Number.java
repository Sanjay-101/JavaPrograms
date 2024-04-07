import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome the world three");
        System.out.println("please the Enter the first number");
        int first=sc.nextInt();
        System.out.println("please the second number");
        int second=sc.nextInt();
        System.out.println("Enter the third number");
        int third=sc.nextInt();
        if(first>=second && first>=third){
            System.out.println(first+"first is grather than");
        }else if(second>=third){
            System.out.println(second+"second is grather than");
        }else {
            System.out.println(third+"third is grather than");
        }

    }
    
}
