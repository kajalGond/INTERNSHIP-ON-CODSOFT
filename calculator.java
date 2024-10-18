package StudentGradeCalculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter number of Subjects: ");
        int nos= sc.nextInt();
        int total = 100;
        for(int i=1;i<nos;i++){
            System.out.println("Enter marks obtained in "+i+": ");
            int marks= sc.nextInt();
            total+=marks;
        }
        double Percentage =(double)total/nos;
         char Grade;
         if(Percentage>=90){
             System.out.println("Grade : A");
         }
        else if(Percentage>=80){
             System.out.println("Grade : B");
        }
         else if(Percentage>=70){
             System.out.println("Grade : C");
         }
         else if(Percentage>=60){
             System.out.println("Grade : D");
         }
         else if(Percentage>=50){
             System.out.println("Grade : E");
         }
         else if(Percentage>=40){
             System.out.println("Grade : F");
         }
         else{
             System.out.println("Fail");
         }
        System.out.println("Total Marks Scored is "+total);
        System.out.println("Average Percentage  Scored is "+Percentage+"%");

    }
}
