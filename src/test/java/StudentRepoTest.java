import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepoTest {

    @Test
    void findById_WhenInvalidIsGiven_ThenThrowStudentNotFoundException() {
        //GIVEN
        StudentRepo studentRepo = new StudentRepo();

        //WHEN
        //THEN
        try {
            studentRepo.findById("1");
            fail();
        } catch (StudentNotFoundException e) {
            assertTrue(true);
        }

    }
}