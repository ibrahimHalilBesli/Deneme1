package chapter_1;

import java.util.Arrays;
import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int i1 = 0; i1 < nums.length; i1++) {

                if (nums[i]==nums[i1]){
                    count++;
                }
            }
            if (count>=2){
                count=0;
            }
            if (count==1){
                System.out.println(nums[i]);
                break;
            }
        }





    }
    
}
