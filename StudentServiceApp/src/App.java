/** 
 * Дата создания 29.04.2023г (семинар №3)
 * Дата 1 дополнения 04.05.2023г (семинар №4)
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
import StudentService.AverageAge;

/*
 * Основной класс программы
 */

public class App{

    /*
     * Метод main - точка входа в программу
     */

    public static void main(String[] args){

        /*
         * Создание экземпляров класса Student
         */

        Student s11 = new Student("Светлана", "Васильева ", 22, 102);
        Student s12 = new Student("Эдуард", "Аббасов ", 22, 101);
        Student s13 = new Student("Олег", "Сидор ", 22, 105);

        Student s21 = new Student("Петр", "Петров ", 22, 202);
        Student s22 = new Student("Андрей", "Андреев ", 22, 201);
        Student s23 = new Student("Артур", "Кукин ", 22, 205);

        Student s31 = new Student("Анна", "Траурих ", 22, 302);
        Student s32 = new Student("Вера", "Кныш ", 22, 301);
        Student s33 = new Student("Геннадий", "Воробьев ", 22, 305);
        
        /*
         * Создание и заполнение коллекции экземплярами класса Student
         */

        List<Student> listStud1 = new ArrayList<>();
        listStud1.add(s11);
        listStud1.add(s12);
        listStud1.add(s13);

        List<Student> listStud2 = new ArrayList<>();
        listStud2.add(s21);
        listStud2.add(s22);
        listStud2.add(s23);

        List<Student> listStud3 = new ArrayList<>();
        listStud3.add(s31);
        listStud3.add(s32);
        listStud3.add(s33);

        /*
         * Создание экземпляров класса StudentGroup
         */

        StudentGroup group1 = new StudentGroup(1, listStud1);
        StudentGroup group2 = new StudentGroup(2, listStud2);
        StudentGroup group3 = new StudentGroup(3, listStud3);

        /*
         * Создание и заполнение коллекции экземплярами класса StudentGroup
         */

        List<StudentGroup> listSteam = new ArrayList<>();
        listSteam.add(group1);
        listSteam.add(group2);
        listSteam.add(group3);

        /*
         * Создание экземпляра класса StudentSteam
         */

        StudentSteam steam1 = new StudentSteam(1, listSteam);

        /*
         * Цикл построчного вывода группы со списком студентов
         */

        for(StudentGroup group: steam1){
            System.out.printf("Группа %d%n", group.getNumOfGroup());
            for(Student stud : group){
                System.out.println(stud);
            }
        }

        /*
         * Сортировка
         */

        Collections.sort(steam1.getGroups());
        Collections.sort(group1.getStudents());
        Collections.sort(group2.getStudents());
        Collections.sort(group3.getStudents());

        /*
         * Цикл построчного вывода группы со списком студентов, отсортированые по колличеству студентов в группе
         */

        for(StudentGroup group: steam1){
            System.out.println(group);
        }

        /*
         * Вывод на экран экземпляра класса StudentSteam с помощью переопределенного метода ToString
         */

        System.out.println(steam1);
        System.out.println();

        // Создание объекта сотрудника
        Emploee peron1 = new Emploee("Иван", "Усов", 55, 110);

        // Выплата зарплаты сотруднику
        EmploeeController.paySalary(peron1);

        // Вычисление среднего количества часов и средней ЗП
        Integer[] studHour = { 124, 234, 231, 1, 45 };
        System.out.printf("Среднее количество часов: %.2f%n", EmploeeController.mean(studHour));
        Double[] emplSalary = { 50006.23, 43006.5, 25008.0 };
        System.out.printf("Средняя ЗП: %.2f%n", EmploeeController.mean(emplSalary));

        // Вычисление среднего возраста студентов

        AverageAge<Student> averageAgeStudents = new AverageAge<>();
        averageAgeStudents.add(new Student("Семен", "Серый ", 23, 103));
        averageAgeStudents.add(new Student("Александр", "Волк ", 22, 102));
        averageAgeStudents.add(new Student("Иван", "Петухин ", 25, 101));
        System.out.println(averageAgeStudents);

        // Вычисление среднего возраста преподавателей

        AverageAge<Teacher> averageAgeTeachers = new AverageAge<>();
        averageAgeTeachers.add(new Teacher("Аркадий", "Цветков ", 41, 1014, "Доктор наук"));
        averageAgeTeachers.add(new Teacher("Максим", "Прохоров ", 40, 1303, "Кандидат наук"));
        averageAgeTeachers.add(new Teacher("Юрий", "Гагарин ", 42, 1004, "Кандидат наук"));
        System.out.println(averageAgeTeachers);

        // Вычисление среднего возраста сотрудников

        AverageAge<Emploee> averageAgeEmploees = new AverageAge<>();
        averageAgeEmploees.add(new Emploee("Олеся", "Кыш ", 35, 42));
        averageAgeEmploees.add(new Emploee("Елена", "Пук ", 33, 51));
        averageAgeEmploees.add(new Emploee("Елена", "Тык ", 33, 35));
        System.out.println(averageAgeEmploees);

    }    
}
