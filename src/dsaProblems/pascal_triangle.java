package dsaProblems;

import java.util.Scanner;

public class pascal_triangle {
    public static void createpascal(int rows){
        //create 2d array to store triangle
        int triangle[][] = new int[rows][];

        //fill each row
        for (int i=0; i < rows;i++){
            //nums in each row = current row+1
            triangle[i] = new int[i+1];

            //1st and last ele = 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            //middle ele = sum of two above ele
            for (int j=1;j<i;j++) triangle[i][j] = triangle[i-1][j-1]+triangle[i-1][j];
        }
        printTriangle(triangle,rows);
    }

    public static void printTriangle(int triangle[][],int rows){
        for (int i =0;i < rows;i++){
            //print spaces
            for (int space=0;space<rows-i;space++){
                System.out.print(" ");
            }
            //print num in each col
            for (int j=0;j<=i;j++){
                System.out.print(triangle[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of rows you want to print: ");
        int rows = sc.nextInt();
        createpascal(rows);
        sc.close();
    }
}
