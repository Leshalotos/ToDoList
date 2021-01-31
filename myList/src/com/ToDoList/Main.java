package com.ToDoList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    ListFactory listFactory = new ListFactory();
	int arg = 1;
        menyPrint();
	while (arg != 0) {
        System.out.println("Choose, please, action!");
        arg = setAction();
	    switch (arg) {
            case 1:
                menyPrint();
                break;
            case 2:
                listFactory.printList();
                break;
            case 3:
                listFactory.addTask();
                break;
            case 4:
                listFactory.changeTask();
                break;
            case 5:
                listFactory.removeTask();
                break;
            default: arg = 0;
        }
    }
    }

    public static void menyPrint() {
        System.out.println("ToDoList:\n" +
                "1. Help.\n" +
                "2. Print ToDoList.\n" +
                "3. Add task ToDoList.\n" +
                "4. Change task in ToDoList.\n" +
                "5. Remove task in ToDoList.\n");
    }

    private static int setAction() {
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        String valueString = scanner.nextLine();
        try {
            value = Integer.parseInt(valueString);
        } catch (ClassCastException e) {
            System.out.println("number expected!");
            setAction();
        }
        return value;
    }

}
