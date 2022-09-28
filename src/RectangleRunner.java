import java.util.Scanner;
public class RectangleRunner {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();

        // write the rest of your program below
        Rectangle rect1 = new Rectangle (rect1Length, rect1Width);
        Rectangle rect2 = new Rectangle (rect2Length, rect2Width);

        //area and volume
        int area1 = rect1.calculateArea();
        int area2 = rect2.calculateArea();
        double vol1= rect1.calculateBoxVolume(rect1Height);
        double vol2 = rect2.calculateBoxVolume(rect2Height);

        //printing
        System.out.println("Rectangle 1's area " + area1+ ", Box Volume: " + vol1);
        System.out.println("Rectangle 2's area " + area2+ ", Box Volume: " + vol2);
        myScanner.close();
    }
}



