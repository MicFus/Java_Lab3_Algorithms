package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Task1.Matrix;
import Task2.SolutionClass;
import Task3.SubstringClass;
import Task5.SortMain;

public class Main {

    public static void main(String[] args) {
        float[] floatTab = new float[]{
          1,2,3,4,5,6,7,8,9,10,11,12,13,14
        };
        List<Integer> myList = CreateRandomList(100);

        try{
            //1
              // Matrix matrix = new Matrix(3,5);
              // Matrix matrix2= new Matrix(3,5);
              // matrix.RandomFill(0,15);
              // matrix2.RandomFill(0,4);
              // Matrix matrix3 = matrix.Add(matrix2);
              // for (Integer item:matrix
              //      ) {
              //   System.out.print(item+ ", ");
              // }
              // matrix.Display();
              // matrix2.Display();
              // matrix3.Display();

            //2
              // System.out.print(SolutionClass.Solution(myList));

            //3
              // System.out.print(SubstringClass.Substring("abcdab","ababcdababc"));

            //4
              // int[] inttab = Task4.SolutionClass.Solution(floatTab,22);
              // System.out.print(inttab[0] + "," + inttab[1]);

            //5
              // SortMain.main(null);

        }catch(Exception e){
            System.out.println(e.getMessage());
        };
    }

    static List<Integer> CreateRandomList(int size){
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<size; i++)
            list.add(-50+random.nextInt(100));
        return list;
    }
}