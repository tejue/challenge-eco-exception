public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);


        StudentRepo studentRepo = new StudentRepo();

        try {
            studentRepo.findById(newStudent.id());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
