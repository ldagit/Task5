package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String Bin = in.next();
        int Bin_int = Integer.parseInt(Bin, 2);
        System.out.println(Bin_int);
    }
}
