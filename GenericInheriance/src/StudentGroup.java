import java.util.Iterator;
import java.util.List;

/*Создаем generic: вводим новые переменные типов.
 * вместо Student - обощенный тип Student<T,V,S>
 */

public class StudentGroup<T,V,S extends Comparable<S>> implements Iterable<Student<T,V,S>>{
    private List<Student<T,V,S>> students;

    public StudentGroup(List<Student<T,V,S>> students){
        this.students = students;
    }

    public List<Student<T,V,S>> getStudents(){
        return students;
    }

    public void setStudents(List<Student<T,V,S>> students){
        this.students = students;
    }

    @Override
    public Iterator<Student<T,V,S>> iterator(){
        return new Iterator<Student<T,V,S>>(){
            private int index = 0;
            @Override
            public boolean hasNext(){
               return index<students.size();
            }
            @Override
            public Student<T,V,S> next(){
                if(!hasNext()){
                    return null;
                }
                return students.get(index++);        
            }
        };
    }
    
}
