//Camp Day 5 (Writing a Class)
public class SchoolTester
{
    public static void main(String[] args)
    {
        School reedy = new School("Kanak", 10, 20, 4.0, "Kaufman", 553);
        reedy.updateStudent("Jason");
        //You can print out the return methods by having the variable returned into a variable in the main method
        int totalStudents = reedy.countStudents();
        System.out.println(totalStudents);
        String returnedLetter = reedy.gpaLetter(3.8);
        System.out.println(returnedLetter);
        int returnedPeople = reedy.totalPeople();
    }
}
class School
{
    private String sName;
    private int grade; 
    private int cNums;
    private double gpa;
    private String tName;
    private int numStudentsPerGrade;

    public School(String sName, int grade, int cNums, double gpa, String tName, int numStudentsPerGrade)
    {
        this.sName = sName;
        this.grade = grade;
        this.cNums = cNums;
        this.gpa = gpa;
        this.tName = tName;
        this.numStudentsPerGrade = numStudentsPerGrade;
    }
    
    public void updateStudent(String newStudent)
    {
        sName = newStudent;
        System.out.println(sName);
    }
    
    public int countStudents()
    {
        int totalStudents = numStudentsPerGrade*4;
        return totalStudents;
    }
    public int totalPeople()
    {
        return 50 + countStudents();
    }
    public String gpaLetter(double studentGPA)
    {
        String letterGrade = " ";
        if(studentGPA > 3.5 && studentGPA <= 4.0)
        {
            letterGrade = "A";
        }
        else if(studentGPA > 3.0 && studentGPA <= 3.5)
        {
            letterGrade = "B";
        }
        else
        {
            letterGrade = "C";
        }
        return letterGrade;
    }
}
