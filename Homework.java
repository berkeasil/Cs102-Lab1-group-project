import java.util.*;
class Homework{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Find the minimum of the array");
            System.out.println("2. Find the maximum of the array");
            System.out.println("3. Find the average of the array, display the difference between numbers and the average");
            System.out.println("4. Find the sum of numbers at odd and even index");
            System.out.println("5. Exit");
            System.out.println("Select one option: 1,2,3,4 or 5");
            choice  = in.nextInt();

            if(choice == 1)
            {
                System.out.println("The minimum of the array: ");
                findMin();
            }
            if(choice == 2)
            {
                System.out.println("The maximum of the array: ");
                findMax();
            }
            if(choice == 3)
            {
                System.out.println("The average and the differences between numbers and average: ");
                findAverage();
            }
            if(choice == 4)
            {
                System.out.println("Sum of even indexed numbers and sum of odd indexed numbers: ");
                oddEven();
            }
            if(choice == 5)
            {
                System.out.println("BYE BYE!");
            }
        }while(choice != 5);

        
    }
  
}
