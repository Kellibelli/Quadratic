import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double rootTwo =  0;
        double rootOne = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in a: ");
        double a = input.nextDouble();
        System.out.print("Enter in b: ");
        double b = input.nextDouble();
        System.out.print("Enter in c: ");
        double c = input.nextDouble();

        double sq = (b*b) - (4*a*c);
        double sqrt = Math.sqrt(sq);

        if(sq>0) {
            rootOne = (-b + sqrt)/ (2 * a);
            rootTwo = (-b - sqrt)/ (2 * a);
            System.out.println("The Roots are : " + rootOne + " and " + rootTwo);


        } else if (sq == 0) {
            System.out.println("The Root is: " + (-b + sqrt)/(2 * a) );
        } else {
            System.out.println("The equation has no roots");
        }

    }


}
