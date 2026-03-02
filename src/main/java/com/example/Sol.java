/*
* File: Sol.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft I/N
* Date: 2026-03-02
* Github: https://github.com/gunkhu/
* Licenc: MIT
*/
 
package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sol {
    public void task01(){
        Scanner sc = new Scanner(System.in);
        List<String> targetList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Cél: ");
            String target = sc.nextLine();
            targetList.add(target);
        }
        sc.close();
        printTargets(targetList);
    }


    public void printTargets(List<String> targetList){
        for (int i = 0; i < targetList.size(); i++) {
            System.out.println(targetList.get(i));
        }

    }
}
    