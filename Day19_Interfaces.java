import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}



class Calculator implements AdvancedArithmetic 
{

    public int divisorSum(int n) 
    {

         int i,sum=0;
        for (i = 1; i <= n; i++)
        {
            if(n%i==0)
            {   
                sum=i+sum;
            }
        }
        return sum; 
    }



}


class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

/**
 * 
 * 
 * Input (stdin)

Download
6
Your Output (stdout)
I implemented: AdvancedArithmetic
12
Expected Output

Download
I implemented: AdvancedArithmetic
12
 * */