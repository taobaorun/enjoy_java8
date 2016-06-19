package com.jiaxy.enjoyjava8.section1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/**
 * Title: <br>
 * <p>
 * Description: <br>
 * </p>
 * <br>
 *
 * @author <a href=mailto:taobaorun@gmail.com>taobaorun</a>
 *         <br>
 * @since 2016/06/16 16:41
 */
public class Closure {

    private static final int BASE = 100;

    private static int nolocal = 100;

    public static void main(String[] args){
        //隐式final
        int num = 200;
        AtomicInteger atomicInteger = new AtomicInteger();
        int rs = add( i -> i + num);
        System.out.println(rs);
        rs = add( i -> {
             //modify
             atomicInteger.incrementAndGet();
            //可以修改非局部变量
            nolocal = 200;
            //不能修改num
             return i + num;
         });
        System.out.println(rs);
        System.out.println("nolocal:"+nolocal);
        for ( int j = 0 ;j < 10 ;j++){
            final int t = j;
            System.out.println(add(i -> i + t));
        }

    }

    public static int add(Function<Integer,Integer> function){
        return function.apply(BASE);
    }

}
