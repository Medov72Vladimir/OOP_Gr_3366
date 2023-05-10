import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.ModelHashMap;
import Model.Student;
import View.View;
import View.ViewEng;

// Главный класс приложения.

public class App{

   /**
    * Создание объекта сканера для считывания пользовательского ввода с консоли
    */

   public static Scanner sc = new Scanner(System.in, "Cp866");

   /**
    * Возвращает объект отображения в зависимости от выбранного языка.
    * @param lang выбранный язык
    * @return объект отображения
    * @throws IllegalArgumentException если выбран неподдерживаемый язык
    */

   public static iGetView view(String lang){
      iGetView view;
      if (lang.equals("RUS")){
         view = new View();
      } else if (lang.equals("ENG")){
         view = new ViewEng();
      }else{
         throw new IllegalArgumentException("Неподдерживаемый язык!");
      }
      return view;
   }

   /**
    * Метод main() - точка входа в приложение.
    * @param args аргументы командной строки
    * @throws Exception если возникла ошибка
    */

   public static void main(String[] args) throws Exception{
      System.out.printf("Выберите язык, RUS/ENG: ");
      String lang = sc.nextLine().toUpperCase();

      // Создаем базу данных студентов

      ModelHashMap studentsHash = new ModelHashMap();
      studentsHash.addStudent("Светлана", "Васильева ", 24, 102);
      studentsHash.addStudent("Эдуард", "Аббасов ", 22, 101);
      studentsHash.addStudent("Олег", "Сидор ", 22, 105);
      studentsHash.addStudent("Петр", "Петров ", 23, 102);
      studentsHash.addStudent("Андрей", "Андреев ", 22, 101);
      studentsHash.addStudent("Анна", "Траурих ", 20, 102);

      List<Student> studentsList = new ArrayList<Student>(Arrays.asList(
            new Student("Светлана", "Васильева ", 24, 102),
            new Student("Эдуард", "Аббасов ", 22, 101),
            new Student("Олег", "Сидор ", 22, 105),
            new Student("Петр", "Петров ", 23, 102),
            new Student("Андрей", "Андреев ", 22, 101),
            new Student("Анна", "Траурих ", 20, 102)));

      FileRepo fileRepo = new FileRepo("StudentDb.txt"); // подключаем FileRepo
      for (Student person : studentsList){
         fileRepo.addStudent(person);
      }
      fileRepo.saveAllStudentsToFile();

      iGetView view = view(lang);
      iGetModel modelHashMap = studentsHash;
      iGetModel modelList = new Model(studentsList);
      iGetModel modelFileRepo = fileRepo;
      
      Controller control = new Controller(view, modelHashMap, lang);
      control.run();
   }
}
