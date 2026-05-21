public class Main {
    public static void main(String[]args)
    {
        System.out.println("Hello Java\uD83D\uDE80");

        // Question 1:
        // Check Positive, Negative, or Zero

        int number = -5;

        if(number > 0)
        {
            System.out.println("Positive");
        }

        else if(number < 0)
        {
            System.out.println("Negative");
        }

        else {
            System.out.println("Zero");
        }

            // Question 2:
// Check Even or Odd

            int num = 5;

            if(num % 2 == 0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }

        // Question 3:
// Largest of Two Numbers

        int a = 10;
        int b = 20;

        if(a > b)
        {
            System.out.println("A is Largest");
        }
        else
        {
            System.out.println("B is Largest");
        }

        // Question 4:
// Largest of Three Numbers

        int x = 10;
        int y = 40;
        int z = 25;

        if(x > y && x > z)
        {
            System.out.println("X is Largest");
        }

        else if(y > x && y > z)
        {
            System.out.println("Y is Largest");
        }

        else
        {
            System.out.println("Z is Largest");
        }

        // Question 5:
// Divisible by 5 and 11

        int n = 55;

        if(n % 5 == 0 && n % 11 == 0)
        {
            System.out.println("Divisible by 5 and 11");
        }

        else
        {
            System.out.println("Not Divisible");
        }
        }

    }
