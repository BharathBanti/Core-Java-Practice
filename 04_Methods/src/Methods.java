public class Methods {

    // Types of Methods
    // 1. No input, no output
    // 2. No input, output
    // 3. Input and output
    // 4. Input, no output

    public static void main(String []args){
        greetings();

        int population = population();
        System.out.println(population);

        System.out.println(greet("Banti"));

        day("Monday");
    }

    // 1. No input and no output
    public static void greetings(){
        System.out.println("Hello, Good morning");
    }

    // 2. No input but output
    public static int population(){
        return 4398749;
    }

    // 3. Input and output
    public static String greet(String name){
        return "Hello " + name + ", Good morning!";
    }

    // 4, Input but no output
    public static void day(String day){
        System.out.println("Today is " + day);
    }
}
