package com.developerIndian.collection;

public class Main {

    public static void main(String[] args) {
	// write your code here


for (int i = 0; i < 6; i++)
    {
        for (int j = 0; j <= 11; j++)
        {
            System.out.print("*");
            if (j == i * 2) {
                System.out.print(" - ");
            }
        }
                System.out.println();
    }

}
}
