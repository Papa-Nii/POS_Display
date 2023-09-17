import java.util.Scanner;

public class POSdisplay {
    public static void  main(String[]args){
        Scanner myitems = new Scanner(System.in);

        // defining an array called items which must have 10 elements
        String[] items = new String[10];
        float[] price  = new float[10];

        //ask user to enter the numbe of items to be checked
        System.out.println("How many items is the customer buying?");
        int no_of_item = myitems.nextInt();

        //when the value of the variable "a" is less than the variable "no_of_item", ask the user to input an item and assign it to the index of the array
        for(int a =0;a<no_of_item;a++){
            System.out.println("Enter item");
            items[a]=myitems.next();

            // this generates random float values for the array called price for each of the entries of the user
            price[a]=(float)(Math.random()*51);

        }
        //creat some spaces and the short dashes to show the results
        System.out.println("\n");
        System.out.println("               Receipt of Sale");
        System.out.println("___________________________________________________________");
        System.out.println("\n");
        System.out.println("Item                                             Amount");


        // display the entries of the user and the random prices generated as well
        for(int a = 0;a<no_of_item;a++) {

            System.out.println(items[a] + "                                             " + price[a]);
        }
        System.out.println("___________________________________________________________");
        float sum = 0;
        // this line does the summation of the random numbers to get the total 
        for (int s =0;s<no_of_item;s++) {
            sum = sum + price[s];

        }
        float VAT = sum*0.15f;

        System.out.println("Total Cost: "+sum);
        System.out.println("Total Cost + VAT(15%): "+(sum+VAT));

    }
}
