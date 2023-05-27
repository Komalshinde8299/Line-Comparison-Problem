package com.first.line_comparision_problem;

public class line_Comparison_Problem {
    public static void main(String[] args) {
        System.out.println("* Welcome to line comparison problem *");
        double x1 = 1;
        double y1 = 2;
        double x2 = 5;
        double y2 = 7;
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of the line: " + length);
    }
}

