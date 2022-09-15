/**

package tdd.chapter4;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
        a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
        these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
        sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the number of items that can be sold



        double weeklyPay = 0.00;

        double grossSales = 0.00;

        double value;
        int  sales1 = 0;
        int  sales2 = 0;

        int salesItem = 0;




        System.out.println("Enter value or -1 to quit");
         value = input.nextInt();

       while (value != -1){

           System.out.println("Enter value or -1 to quit");
           value = input.nextInt();


           if(value == 239.99) {
               salesItem = sales1 +1;


               else if(value == 129.75){
                   salesItem = sales2 + 1;

               }


               grossSales = grossSales + salesItem;
           }

       }

         weeklyPay =  200 + grossSales * 0.09;
         System.out.printf("weekly pay is %.2f", weeklyPay);



    }
}
*/