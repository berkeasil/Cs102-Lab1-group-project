import java.util.*;
class Homework{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int arraySize;
        int choice;

        // First get array size from the user.
        System.out.println("Enter the size of the array");

        arraySize = in.nextInt();

        // Create random array
        int [] mainArray = createRandomArray(arraySize);
        System.out.println("Your array is " + Arrays.toString(mainArray));
        
        // Ask user which action he/she wants to do 
        do{
            System.out.println("1. Find the minimum of the array");
            System.out.println("2. Find the maximum of the array");
            System.out.println("3. Find the average of the array, display the difference between numbers and the average");
            System.out.println("4. Find the sum of numbers at odd and even index");
            System.out.println("5. Exit");
            System.out.println("Select one option: 1,2,3,4 or 5");
            choice  = in.nextInt();

            // Display the answer according to user choice
            if(choice == 1)
            {
                System.out.println("The minimum of the array: ");
                findMin(mainArray);
            }
            if(choice == 2)
            {
                System.out.println("The maximum of the array: ");
                findMax(mainArray);
            }
            if(choice == 3)
            {
                System.out.println("The average and the differences between numbers and average: ");
                findAverage(mainArray);
            }
            if(choice == 4)
            {
                System.out.println("Sum of even indexed numbers and sum of odd indexed numbers: ");
                oddEven(mainArray);
            }
            if(choice == 5)
            {
                System.out.println("BYE BYE!");
            }
        }while(choice != 5);

        
    }
    

    /**
    * Create random array in given size
    * @param int. Given array size form the user
    * @return int[]. Return the created random array
    */
    public static int[] createRandomArray(int arraySize) {

        Random r = new Random();
        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arr[i] = r.nextInt(101);
        }
        return arr;
    }

    /**
    * Find the minimum number in the array
    * @param int[]. The array that we want to find minimimum number in.
    * @return Nothing.
    */
    public static void findMin(int [] numbers){

        int minNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < minNum){
                minNum = numbers[i];
            }
        }
        System.out.println(minNum);
    }

    /**
    * Find the maximum number in the array
    * @param int[]. The array that we want to find maximum number in.
    * @return Nothing.
    */
    public static void findMax(int [] numbers){

        int maxNum = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }
        System.out.println(maxNum);
    }

    /**
    * Find the average of the array
    * @param int[]. The array that we want to find the average.
    * @return Nothing.
    */
    public static void findAverage(int [] numbers){
        int sum = 0;

        for(int value : numbers){
            sum += value;
        }
        
        int average = sum / numbers.length;

        int [] copiedNums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copiedNums[i] = numbers[i] - average;
        }
        System.out.println("The average is " + average);
        System.out.println(Arrays.toString(copiedNums));
    }

    /**
    * Find the sum of even and odd numbers
    * @param int[]. The array contains the numbers.
    * @return Nothing.
    */
    public static void oddEven(int[] arr) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even += arr[i];
            }
            else {
                odd += arr[i];
            }
        }

        System.out.println(even +", " + odd);
     }
}
