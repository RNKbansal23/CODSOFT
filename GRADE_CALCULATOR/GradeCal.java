import java.util.*;


public class GradeCal {


  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name of Student: ");
      String name = sc.nextLine();
      System.out.print("Enter the number of subjects: ");
      int numSubjects = sc.nextInt();
      int totalMarks = 0;
      for (int i = 1; i <= numSubjects; i++) {
          System.out.print("Enter the marks obtained in subject " + i + ": ");
          int subjectMarks = sc.nextInt();
          if(subjectMarks>100){
            System.out.println("Invalid Entery: Your marks  should be out of 100");
        
            System.exit(0);
          }else{
          totalMarks += subjectMarks;
          }
  }
      double averageScore = (double) totalMarks /numSubjects;
      System.out.println("The average score of "+ name + " is: " +averageScore);
      if (averageScore >= 90) {
          System.out.println("Grade: A");
      } else if (averageScore >= 80) {
          System.out.println("Grade: B");
      } else if (averageScore >= 70) {
          System.out.println("Grade: C");
      } else if (averageScore >= 60) {
          System.out.println("Grade: D");
      } else {
          System.out.println("Grade: F");
      }
    }
}
