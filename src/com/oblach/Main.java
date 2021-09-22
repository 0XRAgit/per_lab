package com.oblach;

import sun.rmi.runtime.Log;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	    int[] mas = {1,2,3,4,5,6,7,8,9,10};

	    for(int i=0;i< mas.length;i++)
           if(mas[i]%2==0)
               mas[i]=0;
	    out(mas);

	    String sim, stroke;

	    do{
	        out("Введите символ: ");
            sim=in();
        }while(sim.length()!=1);

        do{
            out("Введите строку: ");
            stroke=in();
        }while(stroke.length()<2);

        if(stroke.indexOf(sim)>-1)
            out("Позиция символа в строке: "+stroke.indexOf(sim));
        else
            out("Символ в строке не найден!");

        int[][] matrix={{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        out(matrix);

        int opred = matrix[0][0]*matrix[1][1]*matrix[2][2]+
                    matrix[0][2]*matrix[0][1]*matrix[1][2]+
                    matrix[0][1]*matrix[1][1]*matrix[0][2]+
                    matrix[0][2]*matrix[1][1]*matrix[0][2]+
                    matrix[0][0]*matrix[2][1]*matrix[1][2]+
                    matrix[0][1]*matrix[0][1]*matrix[2][2];

        out("Определитель матрицы равен: "+opred);
    }

/*   Для удобства вывода,
     что бы не писать каждый раз System.out.println/print*/

    private static void out(String text){
        System.out.println(text);
    }

    private static void out(String[] text){
        for (String s : text) System.out.println(s);
    }

    private static void out(int text){
        System.out.println(text);
    }

    private static void out(int[] text){
        for (int j : text) System.out.println(j);
    }


/*  Так как понадобится только один раз для расчёта оприделителя матрицы,
    а он существует только для квадратных матриц, закладывать логику неквадратной матрицы - не буду*/
    private static void out(int[][] text){
        for (int i=0;i<text.length;i++){
            for (int j=0;j< text.length;j++)
                System.out.print(text[i][j]);
            System.out.print("\n");
        }

    }

    private static String in(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return  br.readLine();
        } catch (IOException e) {
            Log.getLog("Input Error",e.getMessage(),true);
            return null;
        }
    }

    private static Integer inInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return  Integer.getInteger(br.readLine());
        } catch (IOException e) {
            Log.getLog("Input Error",e.getMessage(),true);
            return null;
        }
    }

}
