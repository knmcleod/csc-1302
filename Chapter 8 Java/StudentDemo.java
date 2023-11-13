/**
Programmer: Kerra McLeod
Program #: 8.7
Date: 10/7/2020
Description: Demo program that creates student object and adds quiz scores
*/
import java.util.*;
public class StudentDemo
{
 public static void main(String[] args)
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Programmer: Kerra McLeod. \nThis program will display a students name, total quiz score, and quiz average.");
   System.out.println("What is the student's name? ");
   String name = in.nextLine();
   Student student1 = new Student(name);
   System.out.println("Add a quiz score for " + student1.getName());
   int score1 = in.nextInt();
   student1.addQuiz(score1);
   System.out.println("Add a second quiz score for " + student1.getName());
   int score2 = in.nextInt();
   student1.addQuiz(score2);
   System.out.println(student1.getName()+ "'s total score is " + student1.getTotalScore() + " and average is " + student1.getAverageScore());
   
 }
}