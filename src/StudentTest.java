import entity.Gender;
import entity.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {

   public static List<Student>  students= List.of(
            new Student(1,"ali",25, Gender.MALE),
            new Student(2,"assad",26,Gender.MALE),
            new Student(3,"amal",24,Gender.FEMALE),
            new Student(4,"tareq",23,Gender.MALE),
            new Student(5,"tal",24,Gender.FEMALE),
            new Student(6,"ibrahim",25,Gender.MALE)
    );

    public static void main(String[] args) {

        System.out.println(students);
        List<String>stringList= students.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(stringList);
        List<Student>students1= students.stream().filter(s->s.getAge()==24).collect(Collectors.toList());
        System.out.println(students1);
        List<String> stringList1= students.stream().filter(s->s.getAge()==24).map(Student::getName).collect(Collectors.toList());
        System.out.println(stringList1);



    }



}
