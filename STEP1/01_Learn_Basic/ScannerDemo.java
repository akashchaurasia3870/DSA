import java.util.Scanner;

class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();        

        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();        

        System.out.println("Enter Your Weight : ");
        float weight = sc.nextFloat();   

        sc.close();
        
        
        System.out.println(name +" "+age+" "+weight);
    }
}