package com.jiaxy.enjoyjava8.section1;

import com.jiaxy.enjoyjava8.Student;
import com.jiaxy.enjoyjava8.Students;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Title: <br>
 * <p>
 * Description: <br>
 * </p>
 *
 * @author <a href=mailto:taobaorun@gmail.com>wutao</a>
 *
 * @since 2016/06/10 11:41
 */
public class BehaviorParameterization {


    public static void main(String[] args){
        List<Student> students = Students.getStudents();
        //男生
        students = students.stream().filter( s -> s.getGender() == 1).collect(Collectors.toList());
//        students.forEach(student ->System.out.println(student));
        students.forEach(System.out::println);
        System.out.println("---------------------------");
        //女生
        students = Students.getStudents();
        students = students.stream().filter( s -> s.getGender() == 0).collect(Collectors.toList());
        students.forEach(System.out::println);
        System.out.println("---------------------------");
        //大于8岁
        students = Students.getStudents();
        students = students.stream().filter( s -> s.getAge() > 8).collect(Collectors.toList());
        students.forEach(System.out::println);
        System.out.println("---------------------------");
        //大于8岁的女生
        students = Students.getStudents();
        students = students.stream().filter( s -> s.getAge() > 8 && s.getGender() == 0).collect(Collectors.toList());
        students.forEach(System.out::println);
        System.out.println("---------------------------");

    }
}
