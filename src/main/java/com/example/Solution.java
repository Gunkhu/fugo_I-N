/*
* File: Solution.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft I/N
* Date: 2026-03-02
* Github: https://github.com/gunkhu/
* Licenc: MIT
*/
package com.example;

import java.util.Scanner;

public class Solution {
    public void task01(){
        //Kérjünk be vizsgaremekek céljait
        
        Scanner sc = new Scanner(System.in);
        String[] targetArray = new String[5];

        for(int i = 0; i<5;i++){
        System.out.print("Cél: ");
        String target = sc.nextLine();
        targetArray[i] = target;
        }
    // printTargets(targetArray);
    printTargets2(targetArray);
    sc.close();
    }

    public void printTargets(String[] targetArray){
        for (int i = 0; i < targetArray.length; i++) {
            System.out.println(targetArray[i]);
        }
    }

    public void printTargets2(String[] targetArray){
        for (String target : targetArray) {
            System.out.println(target);
        }
    }
    public void printTargets3(String[] targetArray){
    }
}
