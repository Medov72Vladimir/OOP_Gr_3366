import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Вместо переменных T,V,S прописываем полноценные типы 
 * с большой буквы - String,Integer,Long.
 */

public class App{
    public static void main(String[] args) throws Exception{

        // Создаем экземпляр студента

        Student<String,Integer,Long> s1 = new Student<String,Integer,Long>("Сергей", "Уванов",23,(long)101);
        Student<String,Integer,Long> s2 = new Student<String,Integer,Long>("Андрей", "Петров",24,(long)104);
        Student<String,Integer,Long> s3 = new Student<String,Integer,Long>("Сергей", "Семенов",22,(long)102);

        // Создаем список студентов 

        List<Student<String,Integer,Long>> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);

        StudentGroup<String,Integer,Long> group = new StudentGroup<String,Integer,Long>(listStud);

        // Выводим на печать список студентов

        for(Student<String,Integer,Long> stud: group){
            System.out.println(stud);
        }

        // Отсортируем список студентов

        Collections.sort(group.getStudents());
    }
}
