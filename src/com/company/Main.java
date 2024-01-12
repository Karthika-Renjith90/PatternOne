package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=5;int c=1;
        //Pattern 1
//        for(int i=n;i>=0;i--) // rows will be print 5
//        {
//            for(int j=0;j<=i;j++) // Columns print 5 times
//            {
//                System.out.print(c+" ");
//
//            }
//            System.out.println();
//            c++;

        //Pattern 2
//        for(int i=0;i<n;i++) // rows will be print 5
//        {
//            for(int j=0;j<=i;j++) // Columns print 5 times
//            {
//                System.out.print(c+" ");
//
//            }
//            System.out.println();
//            c++;
        for(int i=0;i<n;i++) // print till 5
        {
            // space
            for(int j=0;j<n-i-1;j++) // 5-0-1= 4 spaces
            {
                System.out.print(" ");
            }
            // star

            for(int j=0;j<2*i+1;j++) // 2*1+1 = 1, 3 , 5 etc
            {
                System.out.print("* ");
            }
            // space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();


        }

    }
}
