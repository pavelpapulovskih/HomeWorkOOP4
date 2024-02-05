public class Student extends User implements Comparable<Student> {
    
    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }


    private Long studentId;
   
    public Long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    
    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }

    
}
