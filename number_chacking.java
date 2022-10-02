import java.io.*;io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class number_chacking{
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int x= sc.nextInt();
    int numCheck = x > 0 ? 1 : x == 0 ? 0: -1;
    switch(numCheck)
   {
       case 1:
			System.out.println("Positive");
			break;
			case -1:
			System.out.println("Negative");
			break;
			case 0: 
			System.out.println("Zero");
			break;
   }
    }
}