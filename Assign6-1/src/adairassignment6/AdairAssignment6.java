package adairassignment6;
import java.util.Scanner;
public class AdairAssignment6 {
    public static void main(String[] args) {
        
        
        // Calling the Heading
        
        AdairHeading.Heading(5);
        
        // Starting the loop
        
        int numOfStudents = StudentClass.getNumOfStudents();
        String choice = "y";
        Scanner ac = new Scanner(System.in);
        while (numOfStudents != 0 && (choice.equalsIgnoreCase("y"))){
            
            //Get the input
            
            String fName = "", lName = "", studentID = "";
            
            // Get the objects
            
            StudentClass studentClass = new StudentClass(fName, lName, studentID);
            StudentClass studentClass1 = new StudentClass();
            studentClass.enterAllStudentInfo();
            studentClass1.assignAssignmentGrades();
            studentClass1.assignExamGrades();
            int assign1 = studentClass1.getAssign1(), assign2 = studentClass1.getAssign2();
            int assign3 = studentClass1.getAssign3(), assign4 = studentClass1.getAssign4();
            int assign5 = studentClass1.getAssign5(), exam1 = studentClass1.getExam1(), exam2 = studentClass1.getExam2();
            
            
            // Print the results
            
            System.out.println("\n\n\nFirst Name:           " + studentClass.getfName());
            System.out.println("Last Name:            " + studentClass.getlName());
            System.out.println("Student ID:           " + studentClass.getStudentID());
            System.out.println("\n\n\nGrade on Assignment 1:" + assign1 + "/100");
            System.out.println("Grade on Assignment 2:" + assign2 + "/100");
            System.out.println("Grade on Assignment 3:" + assign3 + "/100");
            System.out.println("Grade on Assignment 4:" + assign4 + "/100");
            System.out.println("Grade on Assignment 5:" + assign5 + "/100");
            System.out.println("\n\n\nGrade on Exam 1:      " + exam1 + "/150");
            System.out.println("Grade on Exam 2:      " + exam2 + "/150");
            double total = studentClass1.getTotalPoints(assign1, assign2, assign3, assign4, assign5, exam1, exam2);
            System.out.println("\n\n\nAssignment Average:   " + studentClass.getAssignmentAverage(total, exam1, exam2) + "/100");
            System.out.println("Exam Average:         " + studentClass.getExamAverage(exam1, exam2) + "/150");
            if (total >= 744)
                System.out.println("Final Grade:           A");
            else if (total >= 688 && (total < 744))
                System.out.println("Final Grade:           B");
            else if (total >= 632 && (total < 688))
                System.out.println("Final Grade:           C");
            else if (total >= 576 && (total < 632))
                System.out.println("Final Grade:           D");
            else if (total < 632)
                System.out.println("Final Grade:           F");
            double percent = studentClass1.finalPercent(total);
            System.out.println("Final Percent:        " + percent + "%");
            
            // See if they want to keep going
            
            choice = Validator.getString(ac, "Do you wish to keep going?(y/n):   ");
            numOfStudents--;
            if (numOfStudents == 0)
                System.out.print("\nProgram Ended.\n");
            else if (choice.equalsIgnoreCase("n"))
                System.out.print("\nProgram Ended.\n");
            else
                System.out.println("\nYou have " + numOfStudents + " students left\n");
        }
    }  
}
