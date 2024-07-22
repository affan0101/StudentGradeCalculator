import java.util.Scanner;

public class Student {
    double marksHindi;
    double marksEnglish;
    double marksMath;
    double marksBiology;
    double average;
    double totalMarks;
    public void getMarks(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks obtained in each subject out of 100 ");
        System.out.print("Hindi : ");
        marksHindi=sc.nextDouble();
        System.out.print("English : ");
        marksEnglish=sc.nextDouble();
        System.out.print("Maths: ");
        marksMath=sc.nextDouble();
        System.out.print("Biology : ");
        marksBiology=sc.nextDouble();

    }
    public void calculateTotalMarks(){
        totalMarks=marksEnglish+marksBiology+marksHindi+marksMath;
        System.out.println(totalMarks);
    }
    public void averagePercentage(){
         average=(marksEnglish+marksBiology+marksHindi+marksMath)/4;
        System.out.println(average + " %");
    }
    public void calculateGrade(){
        if(average>=90){
            System.out.println(" A++");
        } else if (average>=80 && average<90) {
            System.out.println(" A+");
        }
        else if (average>=60 && average<80) {
            System.out.println(" A");
        }
        else if (average>=50 && average<60) {
            System.out.println("");
        }
        else if (average>=35 && average<50) {
            System.out.println("B");
        }
        else {
            System.out.println("Failed");
        }


    }
    public void displayResult(){
        System.out.println("--------------------Scorecard------------------------- ");
        System.out.println(" Subject                             Marks Obtained");
        System.out.println(" Hindi                                    "+marksHindi);
        System.out.println(" English                                  "+marksEnglish);
        System.out.println(" Mathematics                              "+marksMath);
        System.out.println(" Biology                                  "+marksBiology);
        System.out.println();
        System.out.print("           Total marks         =  ");
        calculateTotalMarks();
        System.out.print("           Average Percentage  =  ");
        averagePercentage();
        System.out.print("           Grade               =  ");
        calculateGrade();
    }

}
class Main{
    public static void main(String[] args) {
        Student s=new Student();
        s.getMarks();
        s.displayResult();
    }
    }



