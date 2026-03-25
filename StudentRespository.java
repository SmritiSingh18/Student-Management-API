import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class StudentRespository {

     private List<Student> students=new ArrayList<>();
     
     //save students in list
     public Student saveStudents(Student S){
        students.add(S);
        return S;
     }

     //get all students
     public List<Student> allStudents(){
        return students;
     }
     
     //find student by id
     public Student findById(int id){
        for (Student s : students) {
            if(s.getId()==id){
                return s;
            }
            
        }

     }

     //delete by id
     public void deleteById(int id){
        for(Student s:students){
            if(s.getId()==id){
                students.remove(s);
                break;
            }
        }
     }

}
