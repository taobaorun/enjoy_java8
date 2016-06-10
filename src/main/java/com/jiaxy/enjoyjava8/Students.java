package com.jiaxy.enjoyjava8;

import java.util.Arrays;
import java.util.List;

/**
 * Title: <br>
 * <p>
 * Description: <br>
 * </p>
 *
 * @author <a href=mailto:taobaorun@gmail.com>wutao</a>
 *
 * @since 2016/06/10 11:44
 */
public class Students {


    public static List<Student> getStudents(){
        Student student1 = new Student("S1",8,1);
        Student student2 = new Student("S2",8,1);
        Student student3 = new Student("S3",9,1);
        Student student4 = new Student("S4",9,1);
        Student student5 = new Student("S5",7,0);
        Student student6 = new Student("S6",7,0);
        Student student7 = new Student("S7",10,1);
        Student student8 = new Student("S8",9,0);
        return Arrays.asList(student1,
                student2,
                student3,
                student4,
                student5,
                student6,
                student7,
                student8
                );
    }
}
