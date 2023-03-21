import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Program to Calculate Area and Perimeter of a Circle

        double radius,perimeter,area,pi=3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius= ");
        radius = scanner.nextDouble();
        perimeter = 2*pi*radius;
        area = pi*radius*radius;
        System.out.println("Circle perimeter = "+perimeter);
        System.out.println("Circle area = "+area);
        System.out.println("***************************************");
        //circle slice area
        double centralAngle,area2;
        System.out.print("Central Angle= ");
        centralAngle = scanner.nextDouble();
        area2 = ((pi*(radius*radius)*centralAngle))/360;
        System.out.print("Circle slice area= "+area2);
    }
}
