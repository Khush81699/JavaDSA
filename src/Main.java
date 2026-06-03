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
        // Take three sides and check if they form a valid triangle.

        int a1 = 5;
        int b1 = 6;
        int c1 = 7;

        if ((a1 + b1 > c1) && (a1 + c1 > b1) && (b1 + c1 > a1)) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }


// Question 12:
// If valid triangle, determine whether it is Equilateral, Isosceles, or Scalene.

        int a2 = 5;
        int b2 = 5;
        int c2 = 5;

        if (a2 == b2 && b2 == c2) {
            System.out.println("Equilateral Triangle");
        } else if (a2 == b2 || b2 == c2 || a2 == c2) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }


// Question 13:
// Take marks (0–100) and print grade (A/B/C/D/F).

        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }


// Question 14:
// Check if one number is a multiple of the other.

        int x1 = 20;
        int y1 = 5;

        if (x1 % y1 == 0 || y1 % x1 == 0) {
            System.out.println("One is Multiple of Other");
        } else {
            System.out.println("Not Multiple");
        }


// Question 15:
// Take hour (0–23) and print greeting.

        int hour = 14;

        if (hour >= 0 && hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon");
        } else if (hour >= 17 && hour < 21) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }


// Question 16:
// Check voting eligibility (18+).

        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible for Voting");
        } else {
            System.out.println("Not Eligible for Voting");
        }


// Question 17:
// Determine whether both numbers are even, both odd,
// or one even and one odd.

        int numA = 8;
        int numB = 11;

        if (numA % 2 == 0 && numB % 2 == 0) {
            System.out.println("Both Even");
        } else if (numA % 2 != 0 && numB % 2 != 0) {
            System.out.println("Both Odd");
        } else {
            System.out.println("One Even and One Odd");
        }

// Question 18:
// Check if alphabet lies between a-m or n-z.

        char ch3 = 'h';

        if (ch3 >= 'a' && ch3 <= 'm') {
            System.out.println("Between a and m");
        } else if (ch3 >= 'n' && ch3 <= 'z') {
            System.out.println("Between n and z");
        } else {
            System.out.println("Invalid Character");
        }

// Question 19:
// Take day number (1–7) and print day name.

        int day = 3;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Day");
        }


// Question 20:
// Take month number (1–12) and print number of days.

        int month = 2;

        if (month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 Days");
        } else if (month == 4 || month == 6 ||
                month == 9 || month == 11) {
            System.out.println("30 Days");
        } else if (month == 2) {
            System.out.println("28 Days");
        } else {
            System.out.println("Invalid Month");
        }
// Question 21
// Check Whether All Digits Are Distinct

        int num21 = 123;

        int first21 = num21 / 100;
        int middle21 = (num21 / 10) % 10;
        int last21 = num21 % 10;

        if (first21 != middle21 && middle21 != last21 && first21 != last21) {
            System.out.println("All Digits Are Distinct");
        } else {
            System.out.println("Digits Are Not Distinct");
        }


// Question 22
// Middle Digit Largest, Smallest or Neither

        int num22 = 582;

        int first22 = num22 / 100;
        int middle22 = (num22 / 10) % 10;
        int last22 = num22 % 10;

        if (middle22 > first22 && middle22 > last22) {
            System.out.println("Middle Digit is Largest");
        } else if (middle22 < first22 && middle22 < last22) {
            System.out.println("Middle Digit is Smallest");
        } else {
            System.out.println("Middle Digit is Neither");
        }


// Question 23
// First and Last Digit Equal

        int num23 = 1221;

        int first23 = num23 / 1000;
        int last23 = num23 % 10;

        if (first23 == last23) {
            System.out.println("First and Last Digits are Equal");
        } else {
            System.out.println("Not Equal");
        }


// Question 24
// Single, Double or Multi Digit

        int num24 = 456;

        if (num24 >= 0 && num24 <= 9) {
            System.out.println("Single Digit");
        } else if (num24 >= 10 && num24 <= 99) {
            System.out.println("Double Digit");
        } else {
            System.out.println("Multi Digit");
        }


// Question 25
// Multiple of 7 OR Ends with 7

        int num25 = 127;

        if (num25 % 7 == 0 || num25 % 10 == 7) {
            System.out.println("Condition Satisfied");
        } else {
            System.out.println("Condition Not Satisfied");
        }

        // Question 26
// Find Quadrant

        int x26 = 5;
        int y26 = -3;

        if (x26 > 0 && y26 > 0) {
            System.out.println("1st Quadrant");
        } else if (x26 < 0 && y26 > 0) {
            System.out.println("2nd Quadrant");
        } else if (x26 < 0 && y26 < 0) {
            System.out.println("3rd Quadrant");
        } else if (x26 > 0 && y26 < 0) {
            System.out.println("4th Quadrant");
        } else {
            System.out.println("Point on Axis");
        }

        // Question 27
// Currency Notes Check

        int amount27 = 5600;

        if (amount27 % 100 == 0) {
            System.out.println("Can be divided into 2000, 500 and 100 notes");
        } else {
            System.out.println("Cannot be divided");
        }

        // Question 28
// Check Range

        int num28 = 456;

        if (num28 >= 100 && num28 <= 999) {
            System.out.println("Within Range");
        } else {
            System.out.println("Out of Range");
        }

        // Question 29
// Third Angle of Triangle

        int angle1 = 60;
        int angle2 = 50;

        int angle3 = 180 - (angle1 + angle2);

        System.out.println("Third Angle = " + angle3);

    // Question 30
// Perfect Square

    int num30 = 25;
    boolean perfect = false;

for(int i = 1; i <= num30; i++)
    {
        if(i * i == num30)
        {
            perfect = true;
            break;
        }
    }

if(perfect)
    {
        System.out.println("Perfect Square");
    }
else
    {
        System.out.println("Not Perfect Square");
    }
// Question 31
// Check Letter, Digit or Special Character

        char ch31 = '@';

        if((ch31 >= 'A' && ch31 <= 'Z') || (ch31 >= 'a' && ch31 <= 'z'))
        {
            System.out.println("Letter");
        }
        else if(ch31 >= '0' && ch31 <= '9')
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Character");
        }

        // Question 32
// Print Fizz, Buzz or FizzBuzz

        int num32 = 15;

        if(num32 % 3 == 0 && num32 % 5 == 0)
        {
            System.out.println("FizzBuzz");
        }
        else if(num32 % 3 == 0)
        {
            System.out.println("Fizz");
        }
        else if(num32 % 5 == 0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println("Neither Fizz nor Buzz");
        }

        // Question 33
// Find Median Value

        int a33 = 10;
        int b33 = 20;
        int c33 = 15;

        if((a33 > b33 && a33 < c33) || (a33 < b33 && a33 > c33))
        {
            System.out.println("Median = " + a33);
        }
        else if((b33 > a33 && b33 < c33) || (b33 < a33 && b33 > c33))
        {
            System.out.println("Median = " + b33);
        }
        else
        {
            System.out.println("Median = " + c33);
        }

        // Question 34
// Check AM or PM

        int hour34 = 18;

        if(hour34 >= 0 && hour34 < 12)
        {
            System.out.println("AM");
        }
        else if(hour34 >= 12 && hour34 <= 23)
        {
            System.out.println("PM");
        }
        else
        {
            System.out.println("Invalid Hour");
        }

        // Question 35
// Check Tax Eligibility

        int age35 = 25;
        int income35 = 600000;

        if(age35 >= 18 && income35 > 500000)
        {
            System.out.println("Eligible for Tax");
        }
        else
        {
            System.out.println("Not Eligible for Tax");
        }

        // Question 36
// Check Two Positive Numbers and Sum Less Than 100

        int a36 = 30;
        int b36 = 40;

        if(a36 > 0 && b36 > 0 && (a36 + b36) < 100)
        {
            System.out.println("Condition Satisfied");
        }
        else
        {
            System.out.println("Condition Not Satisfied");
        }
        // Question 37
// Convert Digit into Word

        int digit37 = 5;

        if(digit37 == 0)
        {
            System.out.println("Zero");
        }
        else if(digit37 == 1)
        {
            System.out.println("One");
        }
        else if(digit37 == 2)
        {
            System.out.println("Two");
        }
        else if(digit37 == 3)
        {
            System.out.println("Three");
        }
        else if(digit37 == 4)
        {
            System.out.println("Four");
        }
        else if(digit37 == 5)
        {
            System.out.println("Five");
        }
        else if(digit37 == 6)
        {
            System.out.println("Six");
        }
        else if(digit37 == 7)
        {
            System.out.println("Seven");
        }
        else if(digit37 == 8)
        {
            System.out.println("Eight");
        }
        else if(digit37 == 9)
        {
            System.out.println("Nine");
        }
        else
        {
            System.out.println("Invalid Digit");
        }

        // Question 38
// Check Weekday or Weekend

        int day38 = 6;

        if(day38 == 6 || day38 == 7)
        {
            System.out.println("Weekend");
        }
        else if(day38 >= 1 && day38 <= 5)
        {
            System.out.println("Weekday");
        }
        else
        {
            System.out.println("Invalid Day");
        }

        // Question 39
// Electricity Bill

        int units39 = 120;
        double bill39;

        if(units39 <= 100)
        {
            bill39 = units39 * 5;
        }
        else
        {
            bill39 = (100 * 5) + ((units39 - 100) * 8);
        }

        System.out.println("Bill = " + bill39);

        // Question 40
// Password Validation

        String password40 = "Java1234";

        if(password40.length() >= 8)
        {
            System.out.println("Valid Password");
        }
        else
        {
            System.out.println("Invalid Password");
        }

    }
}