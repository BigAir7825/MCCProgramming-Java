package adairassignment6;
import java.util.Scanner;
public class StudentClass {
    
    //Declaring Variables
    
    private String fName;
    private String lName;
    private String studentID;
    private int assign1;
    private int assign2;
    private int assign3;
    private int assign4;
    private int assign5;
    private int exam1;
    private int exam2;
    final public int NUM_ASSIGNMENTS=5;
    final public int NUM_EXAMS=2;
    final public int ASSIGNMENT_POINTS=100;
    final public int EXAM_POINTS=150;
    final public int A=744;
    final public int B=688;
    final public int C=632;
    final public int D=576;
    private static int numOfStudents = 0;
    
    // Default Constructor
    
    public StudentClass(){
        assign1 = 0;
        assign2 = 0;
        assign3 = 0;
        assign4 = 0;
        assign5 = 0;
        exam1 = 0;
        exam2 = 0;
    }
    
    // Other Constructor
    
    public StudentClass(String fN, String lN, String id){
        this.fName = fN;
        this.lName = lN;
        this.studentID = id;
    }
    
    // Set First Name
    
    public void setfName(String fName){
        this.fName = fName;
    }
    
    // Get First Name
    
    public String getfName(){
        return fName;
    }
    
    // Set Last Name
    
    public void setlName(String lName){
        this.lName = lName;
    }
    
    // Get Last Name
    
    public String getlName(){
        return lName;
    }
    
    // Set Student ID
    
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    
    // Get Student ID
    
    public String getStudentID(){
        return studentID;
    }
    
    // Set Assign1
    
    public void setAssign1(int assign1){
        this.assign1 = assign1;
    }
    
    // Get Assign1
    
    public int getAssign1(){
        return assign1;
    }

    // Set Assign2
    
    public void setAssign2(int assign2){
        this.assign2 = assign2;
    }
    
    // Get Assign2
    
    public int getAssign2(){
        return assign2;
    }
    
    // Set Assign3
    
    public void setAssign3(int assign3){
        this.assign3 = assign3;
    }
    
    // Get Assign3
    
    public int getAssign3(){
        return assign3;
    }
    
    // Set Assign4
    
    public void setAssign4(int assign4){
        this.assign4 = assign4;
    }
    
    // Get Assign4
    
    public int getAssign4(){
        return assign4;
    }
    
    // Set Assign5
    
    public void setAssign5(int assign5){
        this.assign5 = assign5;
    }
    
    // Get Assign5
    
    public int getAssign5(){
        return assign5;
    }
    
    // Set Exam1
    
    public void setExam1(int exam1){
        this.exam1 = exam1;
    }
    
    // Get Exam1
    
    public int getExam1(){
        return exam1;
    }
        
    // Set Exam2
    
    public void setExam2(int exam2){
        this.exam2 = exam2;
    }
    
    // Get Exam2
    
    public int getExam2(){
        return exam2;
    }
        
    // Get TotalPoints
    
    public double getTotalPoints( int a1, int a2, int a3, int a4, int a5, int e1, int e2){
        double total = a1+a2+a3+a4+a5+e1+e2;
        return total;
    }
    
    // Get AssignmentAverage
    
    public double getAssignmentAverage(double total, int e1, int e2){
        double assignmentAverage = ((total - (e1+e2))/5);
        return assignmentAverage;
    }
    
    // Get ExamAverage
    
    public double getExamAverage(int e1, int e2){
        double examtotal = e1+e2;
        double examAverage = (examtotal/2);
        return examAverage;
    }
    
    // Enter AllStudentInfo
    
    public void enterAllStudentInfo(){
        Scanner studentInfo = new Scanner(System.in);
        this.fName = Validator.getString(studentInfo, "Enter the first name of the student:   ");
        this.lName = Validator.getString(studentInfo, "Enter the last name of the student:   ");
        this.studentID = Validator.getString(studentInfo, "Enter the student ID of the student:   ");
    }
    
    // Assign AssignmentGrades
    
    public void assignAssignmentGrades(){
        Scanner assignmentGrades = new Scanner(System.in);
        this.assign1 = Validator.getIntWithinRange(assignmentGrades, "Enter the student's grade for Assignment 1:   ", -1, 101);
        this.assign2 = Validator.getIntWithinRange(assignmentGrades, "Enter the student's grade for Assignment 2:   ", -1, 101);
        this.assign3 = Validator.getIntWithinRange(assignmentGrades, "Enter the student's grade for Assignment 3:   ", -1, 101);
        this.assign4 = Validator.getIntWithinRange(assignmentGrades, "Enter the student's grade for Assignment 4:   ", -1, 101);
        this.assign5 = Validator.getIntWithinRange(assignmentGrades, "Enter the student's grade for Assignment 5:   ", -1, 101);
    }
    
    // Assign ExamGrades
    
    public void assignExamGrades(){
        Scanner examGrades = new Scanner(System.in);
        this.exam1 = Validator.getIntWithinRange(examGrades, "Enter the student's grade for Exam 1:   ", -1, 151);
        this.exam2 = Validator.getIntWithinRange(examGrades, "Enter the student's grade for Exam 2:   ", -1, 151);
    }

    // FinalGrade
    
    public char finalGrade(double total){
    char grade;
    if (total >= A)
        grade = 1;
    else if (total <= A && (total >= B))
        grade = 2;
    else if (total <= B && (total >= C))
        grade = 3;
    else if (total <= C && (total >= D))
        grade = 4;
    else
        grade = 5;
    return grade;
    }
    
    // FinalPercent
    
    public char finalPercent(double total){
    double percentage = (total/800)*100;
    char percent = (char) (percentage);
    return percent;
    }
    
    // Get NumOfStudents
    
    public static int getNumOfStudents(){
        Scanner Info = new Scanner(System.in);
        int Answer = Validator.getIntWithinRange(Info, "Enter the number of students:   ", 0, 21);
        numOfStudents = Answer; 
        return numOfStudents;
    }
}
