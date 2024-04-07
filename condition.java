import java.util.Scanner;
 class condition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome for  your driving licince");
        System.out.println("please your enter age");
        int age = sc.nextInt();
        int gender = sc.nextInt();
        if(age >= 18){
            System.out.println("your elegibal lisence");

        }else{
            System.out.println("Not eligble");
        } if(gender>=20){
            System.out.println("beta aalu khao");

        }else{
            System.out.println("beta mugha khao");
        }
    }
    
}
