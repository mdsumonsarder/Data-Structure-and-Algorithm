package linearsearch;

import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args) {
     
        int[] nums = {4,12,13,14,33};
        Scanner sc = new Scanner(System.in);
        int searchItem = sc.nextInt();
        
        //Runtime Complexity: O(N);
        //Space Complexity: O(1);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == searchItem){
                System.out.println("searchItem: "+ nums[i]);
                return;
            }
        }
         System.out.println("searchItem is not found!");
    }
    
}
