import java.util.List;

public class TeacherController implements UserController {

   
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    
    public void removeTeacherByFIO(String firstName, String lastName, String middleName) {
        teacherService.removeTeacherByFIO(firstName, lastName, middleName);
    }
    
    public List<Teacher> getTeacherList() {
        List<Teacher> teacherList = teacherService.getTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }
    @Override
    public void create(String firstName, String lastName, String middlename) {
    }
    }