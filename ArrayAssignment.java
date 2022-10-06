package Assignment;

public class ArrayAssignment {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,4,6,7,8,9};
        //System.out.println(numbers[0]);
        int sum = 0;
        for (int number : numbers
             ) {
            sum = sum + number;
        }

        // OR
        int sum2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum2 += numbers[i];
        }
        System.out.println(sum2);
        System.out.println(sum);

       // String[] colours = {"red", "blue", "green"};
       // colours[1] = "purple";
       // System.out.println(colours[1]);
       // for (String colour : colours
            // ) {
           // System.out.print(colour + " ");
        }


        //int[] nums = new int[5];
    }




 // }
