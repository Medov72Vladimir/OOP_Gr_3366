package Model;

import java.util.List;
import Controller.iGetModel;

/**
 * Класс-модель, представляющий список студентов
 */

public class Model implements iGetModel{ // с подключенным интерфейсом iGetModel
    private List<Student> students;// список студентов в БД

    /**
     * Конструктор создания студентов
     * @param students список студентов
     */

    public Model(List<Student> students){
        this.students = students;
    }

    // Метод для получения всех студентов из нашей Model

    public List<Student> getAllStudents(){
        return students;
    }

    /**
     * Метод для удаления студента по его идентификатору
     * @param studentID идентификатор студента
     * @return true, если студент успешно удален, иначе false
     * 
     */

    @Override
    public boolean deleteStudent(long studentID){
        for (int i = 0; i < students.size(); i ++){
            if (students.get(i).getStudentID() == studentID){
                students.remove(i);
                return true;
            }
        }    
        return false;
    }
}