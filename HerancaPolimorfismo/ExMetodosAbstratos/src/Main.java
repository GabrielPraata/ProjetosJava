import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        for (int i=1; i<n; i++) {
            System.out.println("Shape #" + i + "data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("With:");
                double with = sc.nextDouble();
                System.out.print("Height:");
                double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(color, with, height);
                list.add(rectangle);
            } else {
                System.out.print("Radius:");
                double radius = sc.nextDouble();
                Circle circle = new Circle(color, radius);
                list.add(circle);
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape: list) {
            System.out.println(shape.area());
        }

        sc.close();
    }
}