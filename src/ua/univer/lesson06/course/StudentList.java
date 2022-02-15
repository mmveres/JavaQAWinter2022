package ua.univer.lesson06.course;

public class StudentList {
   private Student[] students;
   public StudentList(int n){
      students = new Student[n];
   }
   public void generate4Student(){
      students[0] = new Student("Tom",20,"P11");
      students[1] = new Student("Bob",22,"P12");
      students[2] = new Student("Ann",21,"P12");
      students[3] = new Student("Den",24,"P11");
   }
   public void print(){
      for (Student st: students) {
         System.out.println(st);
      }
   }
   public Student getMaxAgeStudent(){
      Student maxAgeStudent = students[0];
      for (int i = 0; i < students.length; i++) {
         if(maxAgeStudent.getAge()< students[i].getAge()){
            maxAgeStudent = students[i];
         }
      }
      return maxAgeStudent;
   }
   public Student getStudentOlderThenAge(int findOlderThenAge){
      for (Student st: students) {
         if (st.getAge()> findOlderThenAge)
            return st;
      }
      return null;
   }
}
