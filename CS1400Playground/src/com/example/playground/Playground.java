package com.example.playground;

// Name: Faisal Syed
// Assignment: HW 5 + Final (Game Simulation)
// Date: 12/1/21
public class Playground {

    public static void main(String[] args) {
        int i = 0, m = 0;
        while (i < 10)
        {
            m++;
            if ((i % 3) == 0)
            {
                i++;
            }
            else if ((i % 5) == 4)
            {
                i = 10 - i;
            }
            else
            {
                i *= 2;
            }
        }

        // Print out the value
        System.out.println("Value of m: " + m);
    }
}
