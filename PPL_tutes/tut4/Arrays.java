package tut4;

import java.util.Scanner;
/**
 * Write a description of class Arrays here.
 * 
 */
public class Arrays
{
    public static void main(String[] args) {
        int choose;
        do {      
        System.out.println("1.countNegative.");
        System.out.println("2.min.");
        System.out.println("3.isAscSorted.");
        System.out.println("4.length.");
        System.out.println("Please choose the problem you want to solve:");
        System.out.println("If you want to exit, please enter \"0\" from keyboard");
        Scanner input = new Scanner(System.in);
                choose = input.nextInt();
        switch(choose)
        {
            case 1: countNegative();
                            break;
            case 2: min();
                            break;
            case 3: isAscSorted();
                            break;
            case 4: length();
                            break;
                            
        }
       } while (choose != 0);
     
    }

    
    /** Count the number of elements of an array of integers that are negative.
     *  @requires an array of integers
     *  @effect 
     *      for each element ele in array
     *          if ele < 0 
     *              count++
     *      return count
     */
    public static void countNegative(){
        int negative = 0;
        int [] a;    
        int n;
        System.out.println("Please input array size:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();        
        a = new int[n];       
        for (int i=0; i<n; i++)
        {
            System.out.println("Please input the integer a["+i+"]:");
            a[i]=scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++){
            if(a[i] < 0){
                negative++;
            }
        }
            System.out.println("the number of negative is: " +negative);
            System.out.print("\n");
    } 

    
    /** Find the minimum element in an array of integers
     * @requires a != null
     * @effects 
     *   for each elements ele in array
     *      if ele >= x
     *          min = x
     *   return x
     */
    public static void min(){
        int [] a;    
        int n;
        System.out.println("Please input the number of elements in the array:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();        
        a=new int[n];       
        for (int i=0; i<n; i++)
        {
            System.out.println("Please input the integer a["+i+"]:");
            a[i]=scanner.nextInt();
        }
               
        int min = a[0];  
        for(int i=1;i<a.length;i++){  
            if(a[i] < min){  
                min = a[i];  
            }  
        }  
        System.out.println("The minimum integer in the array is: " + min);
        System.out.print("\n");
    }  

    
    /** Determine whether an array of integers is in ascending order
     *  @effect 
     *      
     */
    public static void isAscSorted()
    {
        int [] a;    
        int n;
        System.out.println("Please input the number of elements in the array:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();        
        a=new int[n];       
        for (int i=0; i<n; i++)
        {
            System.out.println("Please input the integer a["+i+"]:");
            a[i]=scanner.nextInt();
        }
        for (int i=a.length-1; i>0; i--)
        {
            int max=a[i];
            int pos=i;
            for(int j=i-1; j>=0; j--)
            {
                if (max<a[j])
                {
                    max=a[j];
                    pos=j;        
                }
            }
            a[pos]=a[i];
            a[i]=max;
        }
        
        System.out.print("Ascending order: \n"); 
        for(int i = 0; i < a.length; i++){
            System.out.print(" " +a[i]);
            System.out.print("\n");
        }
    }

    
    /**
     * Find the length of an array of CHARs on the understanding 
     * that if it contains the character NULL
     */
    public static void length(){
        char [] a;
        
        System.out.println("Please input the array:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.next().toCharArray();
        int count = 0;      
        for (int i=0; i< a.length; i++)
        {
           if (a[i] != '\u0000') {
                count++;
            } else {
            break;
           }
        }
        System.out.print("the length of the array is:" +count);
        System.out.print("\n");
    }
   

}
