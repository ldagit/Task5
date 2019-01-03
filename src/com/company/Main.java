package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        int Bin = in.nextInt(2);
        System.out.println(Bin);
    }
}
