package com.yunshanggansu.utils;

/**
 * ClassName:NineNineTable
 * Package"com.yunshanggansu.utils
 * Description:
 *
 * @Author:zhaolei
 * @Create 2023/7/10 16:25
 * @Version 1.0
 */
public class NineNineTable {
    public static void main(String[] args) {
        for(int i =1;i<=9;i++){
            for (int j =1 ;j<=i;j++){
                System.out.print( i +"*"+ j +"="+ i*j+"\t");
            }
            System.out.println();
        }
         int i = 8;
        if( i<=10){

        }else if( i<=7){

        }else{
            System.out.print("zuihou");
        }
    }

}
