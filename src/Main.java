public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java\uD83D\uDE80");

        // Question 1:
        // Check Positive, Negative, or Zero

        int number = -5;

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Question 2:
// Check Even or Odd

        int num = 5;

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Question 3:
// Largest of Two Numbers

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("A is Largest");
        } else {
            System.out.println("B is Largest");
        }

        // Question 4:
// Largest of Three Numbers

        int x = 10;
        int y = 40;
        int z = 25;

        if (x > y && x > z) {
            System.out.println("X is Largest");
        } else if (y > x && y > z) {
            System.out.println("Y is Largest");
        } else {
            System.out.println("Z is Largest");
        }

        // Question 5:
// Divisible by 5 and 11

        int n = 55;

        if (n % 5 == 0 && n % 11 == 0) {
            System.out.println("Divisible by 5 and 11");
        } else {
            System.out.println("Not Divisible");
        }

        // Question 6:
        // Check Leap Year

        int year = 2024;

        if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }


        // Question 7:
        // Check Alphabet or Not

        char ch = 'A';

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not Alphabet");
        }


        // Question 8:
        // Check Vowel or Consonant

        char letter = 'e';

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }


        // Question 9:
        // Check Divisible by 5 or 11

        int n2 = 55;

        if (n2 % 5 == 0 || n2 % 11 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }


        // Question 10:
        // Largest of Two Numbers Using Ternary Operator

        int p = 10;
        int q = 20;

        int max = (p > q) ? p : q;

        System.out.println("Largest = " + max);


        // Question 11:
        // Check Whether Character is Uppercase or Lowercase

        char ch1 = 'A';

        if(ch1 >= 'A' && ch1 <= 'Z')
        {
            System.out.println("Uppercase");
        }

        else
        {
            System.out.println("Lowercase");
        }

        // Question 12:
        // Check Whether Number is Three Digit or Not

        int num1 = 456;

        if(num1 >= 100 && num1 <= 999)
        {
            System.out.println("Three Digit Number");
        }

        else
        {
            System.out.println("Not Three Digit");
        }


        // Question 13:
        // Check Whether Number is Multiple of 7

        int num2 = 21;

        if(num2 % 7 == 0)
        {
            System.out.println("Multiple of 7");
        }

        else
        {
            System.out.println("Not Multiple of 7");
        }

        // Question 14:
        // Check Eligibility for Voting

        int age = 20;

        if(age >= 18)
        {
            System.out.println("Eligible for Voting");
        }

        else
        {
            System.out.println("Not Eligible");
        }

        // Question 15:
        // Check Whether Character is Digit or Alphabet

        char ch2 = '5';

        if(ch2 >= '0' && ch2 <= '9')
        {
            System.out.println("Digit");
        }

        else
        {
            System.out.println("Alphabet");



            // Question 16:
            // Greater Between Two Numbers Using Ternary Operator

            int m1 = 50;
            int n1 = 80;

            int greater = (m1 > n1) ? m1 : n1;

            System.out.println("Greater Number = " + greater);




            // Question 17:
            // Smaller Between Two Numbers

            int p1 = 25;
            int q1 = 15;

            if(p1 < q1)
            {
                System.out.println("P is Smaller");
            }

            else
            {
                System.out.println("Q is Smaller");
            }




            // Question 18:
            // Check Whether Number is Positive Even Number

            int num3 = 8;

            if(num3 > 0 && num3 % 2 == 0)
            {
                System.out.println("Positive Even Number");
            }

            else
            {
                System.out.println("Not Positive Even");
            }




            // Question 19:
            // Check Whether Number is Negative Odd Number

            int num4 = -9;

            if(num4 < 0 && num4 % 2 != 0)
            {
                System.out.println("Negative Odd Number");
            }

            else
            {
                System.out.println("Not Negative Odd");
            }




            // Question 20:
            // Check Whether Temperature is Hot or Cold

            int temp = 35;

            if(temp >= 30)
            {
                System.out.println("Hot");
            }

            else
            {
                System.out.println("Cold");
            }
        }
    }
}