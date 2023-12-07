package codeSoftAssignments;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number of subjects");
	int noOfSubjects = sc.nextInt();
	int totalMarks = 0;
	for(int i=1;i<=noOfSubjects;i++) {
		System.out.println("Enter marks obatained in subject "+i);
		totalMarks = totalMarks+sc.nextInt();
	}
		
	
		System.out.println("Toatal marks obtained : "+totalMarks);
		
		double avgPercent = totalMarks/noOfSubjects;
		System.out.println("Average percentage obtained : "+avgPercent);
		
		String grade = null ;
		
		
		if(avgPercent >=90)grade = "A+";
		else if(avgPercent >=80)grade = "A";
		else if(avgPercent >=60)grade = "B";
		else if(avgPercent >=40)grade = "C";
		else if(avgPercent <40)grade = "fail";
		
	System.out.println("grade obtained : "+grade);
	
	sc.close();
		
	}

}
