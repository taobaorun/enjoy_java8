package com.jiaxy.enjoyjava8.section1;

import com.jiaxy.enjoyjava8.Student;
import com.jiaxy.enjoyjava8.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Title: <br>
 * <p>
 * Description: <br>
 * </p>
 *
 * @author <a href=mailto:taobaorun@gmail.com>wutao</a>
 *
 * @since 2016/06/10 16:10
 */
public class CommonFunctionInterfaces {

    public static void main(String[] args){
        List<Student> students = Students.getStudents();
        List<Student> boys = filter(students,student -> student.getGender() == 1);
        System.out.println(boys);
        System.out.println("---------------------------------");
        List<Student> evenAgeStudents = evenAgeFilter(students,age -> age % 2 == 0);
        System.out.println(evenAgeStudents);
        System.out.println("---------------------------------");
        visit(students, student -> System.out.println(student.getName()));
        System.out.println("---------------------------------");
        List<String> names = new ArrayList<>();
        map(students, student -> {
            names.add(student.getName());
            return names;
        });
        System.out.println(names);
        System.out.println("---------------------------------");
    }


    public static List<Student> filter(List<Student> students,Predicate<Student> predicate){
        List<Student> list = new ArrayList<>();
        //just demo.idea提示可以采用streams api
        for (Student student:students){
            if (predicate.test(student)){
                list.add(student);
            }
        }
        return list;
    }

    //性能会有提升，减少了box的开销
    public static List<Student> evenAgeFilter(List<Student> students,IntPredicate predicate){
        List<Student> list = new ArrayList<>();
        for (Student student:students){
            if (predicate.test(student.getAge())){
                list.add(student);
            }
        }
        return list;
    }

    /**
     * 和visitor模式 有点类似
     *
     * @param students
     * @param consumer
     */
    public static void visit(List<Student> students,Consumer<Student> consumer){
        for (Student student:students){
            consumer.accept(student);
        }
    }

    public static <R>R map(List<Student> students,Function<Student,List<String>> function){
        R rs = null;
        for (Student student:students){
            rs = (R) function.apply(student);
        }
        return rs;
    }

}
