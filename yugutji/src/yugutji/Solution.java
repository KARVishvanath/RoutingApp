package yugutji;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//
//
//class Result {
//
//   
//    public void lastLetters(String word) {
//    // Write your code here
//    	int length = word.length();
//    	System.out.println(length);
//    	String c = word.substring(length-1);
//    	System.out.println(c);
//    	
//    
//    	
// 
//    	
//
//	 
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException 
//    {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String word = bufferedReader.readLine();
//
//        String result = Result.lastLetters();
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

//------------------------------------------------------------------------------------

//import java.util.Scanner;
//
//public class Solution {
//	
//    public static void main(String[] args) {
//        int i = 4;
//        double d = 4.0;
//        String s = "HackerRank ";
//		
//        Scanner scan = new Scanner(System.in);
//
//        /* Declare second integer, double, and String variables. */
//        int i2; double d2; 
//        String s2 = new String();
//        /* Read and save an integer, double, and String to your variables.*/
//        System.out.println("Enter the integer value");
//        i2 = scan.nextInt();
//        
//        System.out.println("Enter the float value");
//        d2 = scan.nextDouble();
//        
//        s2 = scan.nextLine();//"is the best place to learn and practice coding!";
//        s2 = scan.nextLine();
//        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
//
//        /* Print the sum of both integer variables on a new line. */
//
//        System.out.println (i+i2);
//
//        /* Print the sum of the double variables on a new line. */
//
//        System.out.println (d+d2);
//		
//        /* Concatenate and print the String variables on a new line; 
//        	the 's' variable above should be printed first. */
//        
//        System.out.println (s + "" + s2);
//
//        scan.close();
//    }
//}

//--------------------------------------------------------------


//public class Person {
//    private int age;	
//  
//	public Person(int initialAge) {
//  		// Add some more code to run some checks on initialAge
//        if (initialAge>0)
//          {
//            this.age = initialAge;
//          }
//        else
//          {
//            System.out.println("Age is not valid, setting age to 0");
//            this.age = 0 ; 
//          }
//     }
//
//	public void amIOld() {
//  		// Write code determining if this person's age is old and print the correct statement:
//        if (this.age <13)
//        {
//            System.out.println("You are young.");
//        }
//        else if (this.age>=13 && this.age<18)
//        {
//            System.out.println("You are a teenager.");
//        }
//        else
//        {
//            System.out.println("You are old.");
//        }        
//	}
//
//	public void yearPasses() {
//  		// Increment this person's age.
//         this.age +=1 ;  
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		for (int i = 0; i < T; i++) {
//			int age = sc.nextInt();
//			Person p = new Person(age);
//			p.amIOld();
//			for (int j = 0; j < 3; j++) {
//				p.yearPasses();
//			}
//			p.amIOld();
//			System.out.println();
//        }
//		sc.close();
//    }
//}

//---------------------------------------------------------------

//public class Solution { 
//
//	public static void main(String[] args) 
//    {
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        while (N>0)
//        {
//        String S = scan.next();
//                char ch[] = S.toCharArray();
//            for (int i=0; i< S.length();i++)
//                {
//                    if (i==0 || i%2==0)
//                    {
//                        System.out.print(ch[i]);
//                    }
//                }
//                System.out.print(" ");
//                
//            // for (int j=1; j< N;j++)
//            // {
//            //     System.out.print(" ");
//            // }
//            for (int k=0; k< S.length();k++)
//            {
//                if (k==1 || k%2!=0)
//                {
//                    System.out.print(ch[k]);
//                }
//            }
//            System.out.println();
//            N--;
//            
//           
//            System.out.println(ch);
//        }
//    }
//}
//

//------------------------------------------------------------

//
//public class Solution {
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
//        scanner.close();
//        System.out.println(n);
//        for( int j=n-1; j>=0;j--)
//        {
//            System.out.print(arr[j]+" ");
//        }
//    }
//}


//---------------------------------------------------------------



//Complete this code or write your own from scratch


//class Solution{
//  public static void main(String []argh){
//      Scanner in = new Scanner(System.in);
//      int n = in.nextInt();
//      Map<String, Integer> phoneDiary = new HashMap<String, Integer>();
//      for(int i = 0; i < n; i++){
//          String name = in.next();
//          int phone = in.nextInt();
//          // Write code here
//          phoneDiary.put(name, phone);
//
//      }
//      
//      while(in.hasNext()){
//          String s = in.next();
//          // Write code here
//          if(phoneDiary.containsKey(s))
//          {
//          System.out.println(s+ "=" + phoneDiary.get(s));
//      }
//      else
//          {
//          System.out.println("Not found");
//      }
//          
//      }
//      in.close();
//  }
//}

//--------------------------------------------------------------------


//public class Solution {
//    int consicutiveOnes=0;
//    int maxOnes;
//    int[] binaryNum = new int[32];
//
//    public void binary (int n)
//    {
//         int i=0;
//         while (n > 0) { 
//            // storing remainder in binary array 
//            binaryNum[i] = n % 2; 
//            n = n / 2; 
//            i++; 
//        }
//
//        for (int j=i-1; j>=0 ; j--)
//        {
//            if (binaryNum[j]==1)
//            {
//                consicutiveOnes++;
//            }
//            else 
//            {
//                maxOnes = consicutiveOnes;
//                if (maxOnes>consicutiveOnes)
//                {
//                    consicutiveOnes = 0; 
//                }
//            }
//
//        } 
//    }
//
//    public void display()
//    {
//        System.out.println(this.maxOnes);
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        Solution obj = new Solution();
//
//        obj.binary(n);
//        obj.display();
//
//        scanner.close();
//    }
//}

//----------------------------------------------------



//public class Solution {
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int[][] arr = new int[6][6];
//
//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
//
//        int sum=0;
//        int maxSum = Integer.MIN_VALUE;
//        
//        for (int i=0; i<arr.length-2; i++){
//            for (int j=0; j<arr[0].length - 2; j++){
//                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] 
//                    + arr[i+1][j+1]
//                    + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
//                if (sum > maxSum) {
//                    maxSum = sum;
//                }
//            }
//        }
//
//        scanner.close();
//        System.out.println(maxSum);
//    }
//}


//--------------------------------------------------------


//class Person {
//	protected String firstName;
//	protected String lastName;
//	protected int idNumber;
//	
//	// Constructor
//	Person(String firstName, String lastName, int identification){
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.idNumber = identification;
//	}
//	
//	// Print person data
//	public void printPerson(){
//		 System.out.println(
//				"Name: " + lastName + ", " + firstName 
//			+ 	"\nID: " + idNumber); 
//	}
//	 
//}
//
//class Student extends Person{
//	
//
//	private int[] testScores;
//
//    /*	
//    *   Class Constructor
//    *   
//    *   @param firstName - A string denoting the Person's first name.
//    *   @param lastName - A string denoting the Person's last name.
//    *   @param id - An integer denoting the Person's ID number.
//    *   @param scores - An array of integers denoting the Person's test scores.
//    */
//    // Write your constructor here
//	
//	Student(String firstName, String lastName, int identification, int[] scores) 
//	{
//		super(firstName, lastName, identification);
//		// TODO Auto-generated constructor stub
//		this.testScores=scores;
//		
//	}
//
//    /*	
//    *   Method Name: calculate
//    *   @return A character denoting the grade.
//    */
//    // Write your method here
//	
//	public char calculate()
//	{
//		int sum = 0;
//		
//		for(int j=0; j<this.testScores.length;j++)
//		{
//			sum = sum + this.testScores[j]; 
//		}
//		
//		double avg = sum/this.testScores.length;
//		
//		if (avg<=100 && avg>=90)
//		{
//			return 'O';
//		}
//		else if (avg<90 && avg>=80)
//		{
//			return 'E';
//		}
//		else if (avg<80 && avg>=70)
//		{
//			return 'A';
//		}
//		else if (avg<70 && avg>=55)
//		{
//			return 'P';
//		}
//		else if (avg<55 && avg>=40)
//		{
//			return 'D';
//		}
//		else 
//		{
//			return 'T';
//		}
//		
//	}
//}
//
//class Solution {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String firstName = scan.next();
//		String lastName = scan.next();
//		int id = scan.nextInt();
//		int numScores = scan.nextInt();
//		int[] testScores = new int[numScores];
//		for(int i = 0; i < numScores; i++){
//			testScores[i] = scan.nextInt();
//		}
//		scan.close();
//		
//		Student s = new Student(firstName, lastName, id, testScores);
//		s.printPerson();
//		System.out.println("Grade: " + s.calculate());
//	}
//}


//--------------------------------------------------------


//abstract class Book {
//    String title;
//    String author;
//    
//    Book(String title, String author) {
//        this.title = title;
//        this.author = author;
//    }
//    
//    abstract void display();
//}
//
//class MyBook extends Book
//{
//
//	float price;
//	MyBook(String title, String author, double price_value) {
//		super(title, author);
//		// TODO Auto-generated constructor stub
//		this.price = price_value;
//	}
//	
//	public void display()
//	{
//		System.out.println("Title: "+super.title);
//		System.out.println("Author: "+super.author);
//		System.out.println("Price: "+this.price);
//	}
//	
//}
//
//    
//    /**   
//    *   Class Constructor
//    *   
//    *   @param title The book's title.
//    *   @param author The book's author.
//    *   @param price The book's price.
//    **/
//    // Write your constructor here
//    
//    /**   
//    *   Method Name: display
//    *   
//    *   Print the title, author, and price in the specified format.
//    **/
//    // Write your method here
//    
//// End class
//
//public class Solution {
//   
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String title = scanner.nextLine();
//        String author = scanner.nextLine();
//        int price = scanner.nextInt();
//        scanner.close();
//
//        Book book = new MyBook(title, author, price);
//        book.display();
//    }
//}


//------------------------------------------------------------------


class Difference {
  	private int[] elements;
  	public int maximumDifference=0;
   
	// Add your code here
    Difference(int[] arr)
    {
        this.elements = arr; 
    }
    public void computeDifference()
    {
    	int n = this.elements.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(maximumDifference < Math.abs(elements[i]-elements[j+1]))
                {
                    maximumDifference = Math.abs(elements[i]-elements[j+1]);
                }
            }
        }
   
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}