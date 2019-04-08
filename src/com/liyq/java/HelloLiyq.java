package com.liyq.java;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author liyq
 * @date 10:37
 */
public class HelloLiyq {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        String put = map.put("name", "liyq");
        map.put("age", "40");
        map.put("sex", "male");
        map.put("city", "bj");

        String age = map.get("age");
        System.out.println("age:" + age);

        map.remove("sex");
        System.out.println(map);





        System.out.println("hello liyq 2!");
        System.out.println("hello liyq 3!");
        System.out.println("hello liyq !");



        int num = 10;
        int num2 = 20;

        System.out.println("num2 = " + num2);

        String[] mystr = new String[]{"a", "b", "c"};

        for (int i = 0; i < mystr.length; i++) {

            System.out.println(mystr[i]);

        }

        for (String s : mystr) {
            System.out.println(s);
            System.out.println(mystr);

        }

        for (int i = 0; i < mystr.length; i++) {
            String s = mystr[i];
            System.out.println(s);

        }


        ArrayList mylist = new ArrayList();
        mylist.add(111);
        mylist.add(222);
        mylist.add(333);

        for (Object o : mylist) {
            

        }

        for (int i = 0; i < mylist.size(); i++) {
            
        }

        for (int i = mylist.size() - 1; i >= 0; i--) {
            
        }

        if (mylist == null) {

        }

        if (mystr != null) {

        }

        if (mylist == null) {

        }





    }
}
