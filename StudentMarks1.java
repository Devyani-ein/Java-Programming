
/*1.	Prepare a program for marksheet of the student .take input of marks
�	If marks are>75, heshould get distinction.
�	If marks are>65.he should get First Class.
�	If marks are>55.he should get Second Class.
�	If marks are>35.he should be failed.
*/


import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {
		
		System.out.println("**************************Marksheet of student************************");
		System.out.println("Enter Marks of Student:");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		
		if(marks>75)
		{
			System.out.println("Distinction");
		}
		else if(marks>65)
		{
			System.out.println("First Class");
		}
		else if(marks>55)
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Failed!!");
		}

	}

}
