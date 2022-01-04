import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float width;
        float hieght;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        width=scanner.nextFloat();
        System.out.println("Enter hieght");
        hieght=scanner.nextFloat();
        float area=width*hieght;
        System.out.println("Area is:"+area);
    }
}
