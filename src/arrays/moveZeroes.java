package src.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class moveZeroes
{

    public static void main(String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter array values: ");
       for(int i = 0; i < 10; i++)
       {
           myList.add(sc.nextInt());
       }
       moveZeroes mz = new moveZeroes();
       mz.moveZeroes(myList);
       for(int i : myList)
       {
           System.out.print(i + "\t");
       }
    }

   public void moveZeroes(ArrayList<Integer> num)
    {
        int lastNonZeroFoundAt = 0;
        // if the current element is not 0, then we need to
        // append it just in front of the last non 0 element found
        for(int i = 0; i < num.size(); i++)
        {
            if(num.get(i) !=0)
            {
                num.set(lastNonZeroFoundAt++, num.get(i));
            }
        }
        // After we have finished processing new elements,

        // all the non-zero elements are already at beginning of array.

        // We just need to fill remaining array with 0's.
        for(int i = lastNonZeroFoundAt; i<num.size(); i++)
            num.set(i, 0);
    }
}
