package ua.univer.lesson06.course;

public class ProgramUniver {
    public static void main(String[] args) {

       StudentList studentList = new StudentList(4);
       studentList.generate4Student();
       studentList.print();
       System.out.println(studentList.getMaxAgeStudent());
       System.out.println(studentList.getStudentOlderThenAge(23));
    }
}
