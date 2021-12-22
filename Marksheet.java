/*
* Author : Mohd Mehdi s/o Arshad Abbas Khan
* Date of Development : 22/12/2021 19:52
* */

import java.util.Scanner;

class SubjectName{
final String subj1,subj2,subj3,subj4,subj5;
int m_rks1, m_rks2, m_rks3, m_rks4, m_rks5, max_marks;
float percentage;

// constructor
SubjectName(int max_marks,String s1,int m1,String s2,int m2,String s3,int m3,String s4,int m4,String s5,int m5){
	subj1 = s1;
	subj2 = s2;
	subj3 = s3;
	subj4 = s4;
	subj5 = s5;

	this.max_marks = max_marks;
	m_rks1 = m1;
	m_rks2 = m2;
	m_rks3 = m3;
	m_rks4 = m4;
	m_rks5 = m5;
}
// constructor ends

public float percent(){
	percentage =(float) ((m_rks1+m_rks2+m_rks3+m_rks4+m_rks5)*100)/max_marks;
return percentage;
}

}//class ends

public class Marksheet{
public static void main(String[] args){

String subject1,subject2,subject3,subject4,subject5,StudentName,FathersName,rollno;
int marks1, marks2, marks3, marks4, marks5,max_marks;

Scanner sc = new Scanner(System.in);

	System.out.println("Enter Students Name : ");
	StudentName = sc. nextLine();

	System.out.println("Enter Father's Name : ");
	FathersName = sc.nextLine();

	System.out.println("Enter Roll Number : ");
	rollno = sc.nextLine();

// Subjects
System.out.println("Enter subject 1: ");
subject1 = sc.nextLine();

System.out.println("Enter subject 2: ");
subject2 = sc.nextLine();

System.out.println("Enter subject 3: ");
subject3 = sc.nextLine();

System.out.println("Enter subject 4: ");
subject4 = sc.nextLine();

System.out.println("Enter subject 5: ");
subject5 = sc.nextLine();

// subjects maximum marks
	System.out.println("Enter Maximum Marks");
max_marks = sc.nextInt();
// subjects marks

System.out.println("Enter "+ subject1 + " marks: ");
marks1 = sc. nextInt();

System.out.println("Enter "+ subject2 + " marks: ");
marks2 = sc. nextInt();

System.out.println("Enter "+ subject3 + " marks: ");
marks3 = sc. nextInt();

System.out.println("Enter "+ subject4 + " marks: ");
marks4 = sc. nextInt();

System.out.println("Enter "+ subject5 +" marks: ");
marks5 = sc. nextInt();

SubjectName subjectName = new SubjectName(max_marks,subject1,marks1,subject2,marks2,subject3,marks3,subject4,marks4,subject5,marks5);

System.out.println("\t\t************** Dr. Rizvi Learners' Academy ****************\n\n\t\t***** Name = "+StudentName+" *****\n\n\t\t***** Father's Name = "+FathersName+" ******\n\n\t\t****** Roll Number = "+rollno+ " ********");
	System.out.println("---> "+subject1+" = "+marks1);
	System.out.println("---> "+subject2+" = "+marks2);
	System.out.println("---> "+subject3+" = "+marks3);
	System.out.println("---> "+subject4+" = "+marks4);
	System.out.println("---> "+subject5+" = "+marks5);
	System.out.println(">>>> Percentage : "+subjectName.percent());

}
}