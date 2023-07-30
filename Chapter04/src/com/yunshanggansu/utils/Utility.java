package com.yunshanggansu.utils;


import java.io.FileInputStream;
import java.util.Scanner;

/**
 * ClassName:Utility
 * Package"com.yunshanggansu.utils
 * Description:
 *
 * @Author:zhaolei
 * @Create 2023/7/8 17:29
 * @Version 1.0
 */
public class Utility {
    public static void main(String[] args) {
//         int today = 4;
//         int lastWeek = today +10 ;
//         lastWeek %= 7 ;
//         System.out.println("今天是星期" + today +",10天以后是" + ((lastWeek == 0)?"日" : lastWeek));
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println(sc);
//
//        for(int i=0;i<=100;i++){
//          if(i%2==0){
//              System.out.println(i);
//          }
//        }
        for (int i = 100 ;i <=999; i++){
            int  gewei = i%10 ;
            System.out.println(gewei);
            int shiwei = i/10%10;
            int baiwei = i%100;
            if (i == gewei *gewei *gewei + shiwei * shiwei *shiwei + baiwei*baiwei*baiwei){
                System.out.println("100-999以内的水仙花数是"+i);
            }
        }

    }
}
