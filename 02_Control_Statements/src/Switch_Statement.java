public class Switch_Statement {
    public static void main(String[] args){
        //  1. Write a program that takes a day number (1–7) and prints the day name using a traditional switch with break.
        int day = 5;
        switch (day){
            case 1 :
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 2. Rewrite #1 using Java's enhanced switch expression (switch -> {} with yield) and compare the syntax.
        String dayName = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(dayName);

        // Using yield: yield is used to return from the case and acts as break and return combined
        char color = 's'; // choose from "rgb"
        String colorName = switch (color){
            case 'r' :
                System.out.println("Processing r...");
                yield "red";
            case 'g':
                System.out.println("Processing g...");
                yield "green";
            case 'b':
                System.out.println("Processing b...");
                yield "blue";
            default:
                System.out.println("Processing ...");
                yield "Color not found";
        };
        System.out.println(colorName);

        // 3. Demonstrate fall-through behavior intentionally: group multiple case labels (e.g., days that are "weekend") without break to show how it falls through, then show the bug that happens when you forget a break unintentionally.
        switch(day){
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week day");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 4. Write a switch statement on a String value (e.g., month name → number of days), and note in a comment that switch-on-String only works from Java 7+
        String month = "june";
        switch (month){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("31 days");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("30 days");
                break;
            case "february":
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
