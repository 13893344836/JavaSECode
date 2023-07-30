package com.yunshanggansu.utils;

import java.io.*;

/**
 * ClassName:StudentTest
 * Package"com.yunshanggansu.utils
 * Description:
 *
 * @Author:zhaolei
 * @Create 2023/7/19 21:22
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建学生类数组
        Student[] students = new Student[20];
        //初始化数组
        for(int i = 0 ; i <students.length ; i++){
            students[i] = new Student();
            students[i].name = "zs"+ i ;
            students[i].grd = (int) (Math.random()* 6 +1);
            students[i].score = (int) (Math.random()* 101);
            System.out.println(students[i].show());
        }
        //需求1：打印出3年纪的学生信息
       for(int i = 0 ; i<students.length ; i++){
            if(3 == students[i].grd ){
               Student stu= students[i];
                System.out.println("-----" + stu.show());
            }
        }
        for ( int i = 0 ;i<students.length-1; i++){
            for (int j =0 ;j<students.length -i -1 ; j++){
                if (students[j].score > students[j+1].score){
                    Student tmp = students[j];
                    students[j]=students[j+1];
                    students[j+1]=tmp;

                }
            }

        }
        for(int i = 0 ; i <students.length ; i++) {
            System.out.println(students[i].show());

        }
        File file = new File("d://ccc");

    }

}
