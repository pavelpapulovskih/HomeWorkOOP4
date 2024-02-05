import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Potok implements Iterable<StudentGroup> {
    private List<StudentGroup> groups;

    public Potok() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    public void sortGroups() {
        StreamComparator comparator = new StreamComparator();
        groups.sort(comparator);
    }

    @Override
    public java.util.Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
}

class StreamComparator implements Comparator<StudentGroup> {
    @Override
    public int compare(StudentGroup group1, StudentGroup group2) {
        return 0;
        // Сравнение количества студентов в группах или другие критерии сравнения
        // Возвращаем -1, если group1 меньше group2
        // Возвращаем 0, если group1 равно group2
        // Возвращаем 1, если group1 больше group2
    }
}


