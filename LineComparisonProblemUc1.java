package com.linecComparision.Oops;

import java.util.Scanner;

public class LineComparisonProblemUc1 {
    public void computeLengthOfLine(){

        Scanner sc = new Scanner(System.in);
        //Co-ordinates of line
        System.out.print("Enter x1 co-ordinate of first point: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 co-ordinate of first point: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 co-ordinate of second point: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 co-ordinate of second point: ");
        int y2 = sc.nextInt();

        //Computation
        double Length_of_line = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("length of line is:" + Length_of_line);
    }

    public static void main(String[] args) {
        LineComparisonProblemUc1 lineComparisonProblemUc1 = new LineComparisonProblemUc1();
        lineComparisonProblemUc1.computeLengthOfLine();
    }
}
