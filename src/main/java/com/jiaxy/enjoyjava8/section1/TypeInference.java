package com.jiaxy.enjoyjava8.section1;

import com.jiaxy.enjoyjava8.Student;

import java.util.Comparator;

/**
 * Title: <br>
 * <p>
 * Description: <br>
 * </p>
 * <br>
 *
 * @author <a href=mailto:taobaorun@gmail.com>taobaorun</a>
 *         <br>
 * @since 2016/06/16 10:53
 */
public class TypeInference {

    public static void main(String[] args){

        //no type inference
        Comparator<Student> comparator = ( Student s1,Student s2) -> Integer.valueOf(s1.getAge()).compareTo(Integer.valueOf(s2.getAge()));
        //type inference
        Comparator<Student> comparator2 = (  s1, s2) -> Integer.valueOf(s1.getAge()).compareTo(Integer.valueOf(s2.getAge()));


    }
}
