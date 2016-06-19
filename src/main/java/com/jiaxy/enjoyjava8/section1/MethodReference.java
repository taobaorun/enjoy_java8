package com.jiaxy.enjoyjava8.section1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Title: <br>
 * <p>
 * Description: <br>
 * </p>
 * <br>
 *
 * @author <a href=mailto:taobaorun@gmail.com>taobaorun</a>
 *         <br>
 * @since 2016/06/17 15:09
 */
public class MethodReference {

    private String desc;

    public MethodReference(String desc) {
        this.desc = desc;
    }

    public MethodReference() {
    }

    public static void main(String[] args){

        List<String> list = Arrays.asList("a","b","A","B");
//        list.sort((s1,s2) -> s1.compareToIgnoreCase(s2));
        //对已经存在的实例进行方法引用
        list.forEach(System.out::println);
        System.out.println("-------------1---------------------");
        //对任意类型的方法实例的引用
        list.sort(String::compareToIgnoreCase);
        //static 方法引用
        list.forEach(MethodReference::staticPrintln);
        System.out.println("-------------2--------------------");
        list.forEach(System.out::println);
        //构造方法引用,等同
        Supplier<MethodReference> supplier = MethodReference::new;
        MethodReference methodReference = supplier.get();
        System.out.println(methodReference);
        supplier = () -> new MethodReference();
        methodReference = supplier.get();
        System.out.println(methodReference);

    }

    public static void staticPrintln(String s){
        System.out.println("static method "+s);
    }
}
