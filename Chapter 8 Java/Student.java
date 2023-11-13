/**
Programmer: Kerra McLeod
Program #: 8.7
Date: 10/7/2020
Description: creates student class
*/
public class Student
{
   private String name;
   private int totalQuizScore;
   private int numberOfQuizzes;
   public Student(String name)
   {
      this.name = name;
      totalQuizScore = 0;
      numberOfQuizzes = 0;
   }
   /**
   Description: returns name when called
   return: name, String
   */
   public String getName()
   {
      return name;
   }
   /**
   Description: adds up quiz grades given
   @param: score, int added
   */
   public void addQuiz(int score)
   {
      totalQuizScore += score;
      numberOfQuizzes++;
   }
   /**
   Description: returns total score when called
   @return: total score added up
   */
   public int getTotalScore()
   {
      return totalQuizScore;
   }
   /**
   Description: returns average score after calculating it
   @return: average quiz score or zero based on input
   */
   public double getAverageScore()
   {
      if(numberOfQuizzes == 0)
      {
         return 0;
      }
      else
      {
         return totalQuizScore/numberOfQuizzes * 1.0;
      }
   }
}