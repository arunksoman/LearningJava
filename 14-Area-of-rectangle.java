import java.util.Scanner;

public class RectangleArea
{
   public static void main(String[] args)
   {
      int length;
      int width;
      int area;
      
      Scanner console = new Scanner(System.in);

      // Get length from the user.
      System.out.print("Enter length: ");
      length = console.nextInt();

      // Get width from the user.
      System.out.print("Enter width: ");
      width = console.nextInt();

      // Calculate area.
      area = length * width;

      // Display area.
      System.out.println("The area of rectangle is " + area);
   }
}