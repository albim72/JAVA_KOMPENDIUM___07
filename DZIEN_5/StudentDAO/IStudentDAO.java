import java.util.List;

public interface IStudentDAO {
    public List<Student> getAllStudents();
    public Student getStudent(int nralb);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
