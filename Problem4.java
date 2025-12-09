package tandemloop;

import java.util.Scanner;

public class Problem4 {

    public static int getCount(int[] arr, int n)
    {
        int count=0;
        for (int value:arr) 
        {
            if (value%n==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void printMultiplesCount(int[] arr)
    {
        for (int i=1;i<=9;i++) 
        {
            int count=getCount(arr, i);
            System.out.print(i+ ":" +count+ "   ");
        }
    }
public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 11 array elements ");
		int a[]=new int[11];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();    // [1,2,8,9,12,46,76,82,15,20,30]
		}
	 
        printMultiplesCount(a);
	}
}