
public class Main {
    public static void main(String[] args) {
        StudentDAO stud = new StudentDAO();
        for(Student st:stud.getAllStudents()){
            System.out.printf("Student: [nr albumu: %d, imię: %s]\n",st.getNralb(),st.getName());
        }
        Student student = stud.getAllStudents().get(0);
        student.setName("Michał");
        stud.updateStudent(student);
        System.out.println("___________________________________________");
        for(Student st:stud.getAllStudents()){
            System.out.printf("Student: [nr albumu: %d, imię: %s]\n",st.getNralb(),st.getName());
        }

        Student stdu = stud.getAllStudents().get(3);
        stud.deleteStudent(stdu);
        System.out.println("___________________________________________");
        for(Student st:stud.getAllStudents()){
            System.out.printf("Student: [nr albumu: %d, imię: %s]\n",st.getNralb(),st.getName());
        }
    }
}
