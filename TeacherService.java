import java.util.Iterator;
import java.util.List;

public class TeacherService {


    private TeacherGroup teacherGroup;
    
    public void removeTeacherByFIO(String firstName, String lastName, String middleName) {
        Iterator<Teacher> iterator = teacherGroup.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName) && teacher.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }
    
    public List<Teacher> getTeacherList() {
        return teacherGroup.getTeacherList();
    }
    
    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherGroup.createTeacher(firstName, lastName, middleName);
    }
    }
