public class Patterns {
    public static void main(String[] args){
        int n = 5;

        square(n);
        rightTriangleStars(n);
        invertedTriangleStars(n);
        rightTriangleNumbers(n);
        rightTriangleNumbers2(n);
        mirroredRightTriangleStars(n);
        pyramid(n);
        invertedPyramid(n);
    }

    public static void square(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangleStars(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedTriangleStars(int n){
        for(int i = n; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangleNumbers(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void rightTriangleNumbers2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void mirroredRightTriangleStars(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedPyramid(int n){
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
