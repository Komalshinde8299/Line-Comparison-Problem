package com.first.line_comparision_problem;

public class line_Comparison_Problem {
    public static void main(String[] args) {
        System.out.println("* Welcome to line comparison problem *");
        double x1 = 8;
        double y1 = 9;
        double x2 = 4;
        double y2 = 4;
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of the line 1 : " + length1);

        double x3 = 9;
        double y3 = 2;
        double x4 = 5;
        double y4 = 6;
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("Length of the line 2 : " + length2);

        if(length1 == length2){
            System.out.println("Length of two line equal");
        } else {
            System.out.println("Length of two line is not equal");
        }


    }
}

