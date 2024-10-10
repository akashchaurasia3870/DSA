import java.io.IOException;

/**
 * ReadDemo
 */
public class ReadDemo {

    public static void main(String[] args) {
        System.out.println("Enter a Number");

        int num = 0;
        try {

            // note System.in.read give output in ascii char value
            //if you enter A it will give 65 same for other charactors you enter
            
            num = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something Went Wrong");
        }

        System.out.println(num);
    }
}