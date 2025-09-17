package myfirstprogram;
//Demo for static keyword
public class Student {
     int rollno;
     String sname;
     String sbranch;
 static String Collegename = "KPRIT" ;
 void display() {
	 System.out.println("The details of the student are" +rollno+" "+sname+" "+sbranch+" "+Collegename);
 }
}
