package class15;

public class Students {                                         /*Create a Class called Students
                                                   Create three  variables  Name , ID  and  numberOfStudents
                                                        Create three objects of the Students Class
                                                       Set the value for  studentName , studentID and increment
                                                   class15.methodinjava3 the numberOfStudents for each object
                                                        Print out  total number of students*/

    String Studentsname;
    int numberofstudent;
    String StudentID;

    public static void main(String[] args) {
        Students Studentsname = new Students();
        Studentsname.StudentID = "100";
        Studentsname.numberofstudent = 500;
        //System.out.println(Studentsname.numberofstudent);


        Students methodinjava3 = new Students();
        methodinjava3.StudentID = "300";
        methodinjava3.numberofstudent = 300;
        System.out.println(methodinjava3.numberofstudent);

    }
}