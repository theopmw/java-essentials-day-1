package dayone;

import java.util.Scanner;

public class ZellersCongruence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        do {
            // Prompt user to enter a year, month and day and store in variables
            System.out.print("Enter year (in YYYY format): ");
            int year = input.nextInt();

            System.out.print("Enter month: 1-12: ");
            int month = input.nextInt();

            System.out.print("Enter the day of the month: 1-31: ");
            int day = input.nextInt();

            // Check if month is January or February
            // If month is January or February, add 1 to month value (as in convert Jan to 13 and Feb to 14)
            // Year has to be reduced by 1 (So go to previous year).
            if (month == 1 || month == 2) {
                month += 12;
                year--;
            }

            // List variables/Compute answer
            int d = day;
            int m = month;
            int k = year % 100; // The year of the century
            int j = year / 100; // the century
            int h = d + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
            h = h % 7;
//        int h = 13*(m + 1) / 5;
//        int i = h + d;



//        int h = (d + (int)((26 * (m + 1)) / 10.0) + k + (int)(k / 4.0)
//                + (int)(j / 4.0) + (5 * j)) % 7;


//       #################################
//       ##### Results using if/else #####
//       #################################

//      String result = "Day of the week is ";

//      Display the name of the day of the week
//        if (h == 0)
//            System.out.print(result + "Saturday");
//        else if (h == 1)
//            System.out.print(result + "Sunday");
//        else if (h == 2)
//            System.out.print(result + "Monday");
//        else if (h == 3)
//            System.out.print(result + "Tuesday");
//        else if (h == 4)
//            System.out.print(result + "Wednesday");
//        else if (h == 5)
//            System.out.print(result + "Thursday");
//        else
//            System.out.print(result + "Friday");

//      #########################################
//      ##### Results using enhanced switch #####
//      #########################################

            String result = "The day of the week is ";

            switch (h)
            {
                case 0 -> System.out.println(result + "Saturday");
                case 1 -> System.out.println(result + "Sunday");
                case 2 -> System.out.println(result + "Monday");
                case 3 -> System.out.println(result + "Tuesday");
                case 4 -> System.out.println(result + "Wednesday");
                case 5 -> System.out.println(result + "Thursday");
                case 6 -> System.out.println(result + "Friday");
            }

            System.out.println("Enter 1 to run the program again or 0 to exit.");
            choice = input.nextInt();

        }while (choice == 1);
        input.close();
    }
}
