package sort.util;

import java.util.List;

public class Print {

    public static void out(List<Integer> list){
        System.out.println("打印----start-----");
        for(Integer i : list){
            System.out.println(i);
        }
        System.out.println("打印----end-----");
    }

    public static void main(String[] args) {
        System.out.println(java.util.UUID.randomUUID().toString());

    }
}
