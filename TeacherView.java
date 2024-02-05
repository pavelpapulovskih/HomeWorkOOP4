// import java.util.List;

// public class TeacherView <T extends Teacher> {

//     @Override
//     public void sendOnConsole(List<Teacher> list) {
//         for (Teacher teacher : list) {
//             System.out.println(teacher.getTeacherId());
//         }
//     }
//     }
import java.util.List;

public class TeacherView implements TeacherInterface {

@Override
public void sendOnConsole(List<Teacher> list) {
    for (Teacher teacher : list) {
        System.out.println(teacher.getTeacherId());
    }
}
}