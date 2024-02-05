import java.util.List;

public class StudentControler implements UserController<Student> {
    
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentLsit = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentLsit);
        return studentLsit;
    }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentLsit = studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentLsit);
        return studentLsit;
    }
    
        private Potok service;
    
        public StudentControler() {
            this.service = new Potok();
        }
    
        public void addGroup(StudentGroup group) {
            service.addGroup(group);
        }
    
        public void sortGroups() {
            service.sortGroups();
        }

        @Override
        public void create(String firstName, String lastName, String middlename) {
            studentGroupService.createStudent(firstName, lastName, middlename);
        }
    
}