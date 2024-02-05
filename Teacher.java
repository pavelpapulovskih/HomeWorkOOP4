public class Teacher extends User implements Comparable {

    private Long teacherId;
    
    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }
    
    public Long getTeacherId() {
        return this.teacherId;
    }
    
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
    
    
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    }