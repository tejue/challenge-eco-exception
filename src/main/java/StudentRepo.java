import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Student findById(String id) throws StudentNotFoundException {

        return getAllStudents().stream()
                .filter(students -> students.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("no such student found"))
                ;
    }

    public Optional<Student> findStudentById(String id) {
        return Optional.ofNullable(students.get(id));
    }
}
