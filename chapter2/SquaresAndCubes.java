package tdd.chapter2;

public class SquaresAndCubes {
    public static void main(String[] args) {

        System.out.printf("%10S%10S%6S%n", "number", "square", "cube");
        int square;
        int cube;
        for(int number = 0; number <= 10; ++number )

        {
             square = (number * number);
             cube = (number * number * number);
            System.out.printf("%10d%10d%6d%n", number, square, cube);
        }
    }
}
