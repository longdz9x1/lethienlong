package Session2;
import java.util.Scanner;
class Student{

public class Student {
    public String Student_code;
    public float Medium_score;
    public int Age;
    public String class;

    public void inputInfo() {
        Scanner add = new Scanner(System.in);
        System.out.println("Student_code: ");
        Student_code = add.nextLine();

        System.out.println("Medium_score: ");
        Medium_score = add.nextFloat();

        System.out.println("Age: ");
        Age = add.nextInt();
        Class = add.nextLine();
        System.out.println("Class: ");
        Class = add.nextLine();
    }
    public void showInfo () {
        System.out.println("info_Student");
        System.out.println("Student_code: " + Student_code);
        System.out.println("Medium_score:" + Medium_score);
        System.out.println("Age:" + Age);
        System.out.println("Class:" + Class);
    }
    public void Check () {
        if(Medium_score > 8.0) {
            System..out.println("Oke_Done");
        } else {
            System.out.println("Oke_Fail");
        }
    }
    public static void main(String[]agrs){
    Student student = new Student();
    student.inputInfo();
    student.showInfo();
    student.Check();
    }
}