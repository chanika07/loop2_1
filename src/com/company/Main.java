package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cor = sc.nextInt();

        for (int i=0; i<row ;i++){

            for (int j=0;j<cor;j++){
                if (i==0 || i==row-1)
                System.out.print("*");
                else {
                    if(j==0||j==cor-1)
                    System.out.print("*");
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
