package tandemloop;

import java.util.Scanner;
class Odd {

    public String save(int a)
    {
        String result = "";
        for (int i=1;i<=a;i++)
        {
            result += (2*i-1)+ " ";
        }
        return result;
    }
}
public class Problem2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a");
		int a=sc.nextInt();
		
		Odd obj1=new Odd();
		String result = obj1.save(a);

	    System.out.println(result);
	}
}
