package com.ToDoList;

import java.util.*;

public class ListFactory {

    private List<String> myList = new ArrayList<>();

    public void addTask () {

        System.out.println("Add your task!");

        String task = setString();

        myList.add(task);

    }

    public void changeTask () {
        System.out.println("Enter tasknumber:");
        int position = setInt() - 1;
        System.out.println("Enter new task.");
        String task = setString();
        if (position < myList.size()) {
            myList.set(position, task);
        }
        else System.out.println ("This position is very big, please change position!");
    }

    public void printList () {
        if (myList.size() == 0) {
            System.out.println("Your ToDoList is empty!");
        }
        else {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(i + 1 + ". " + myList.get(i));
        }
        }
    }
    public void removeTask () {
        System.out.println("Enter tasknumber");
        int position = setInt() - 1;
        myList.remove(position);
    }

    private int setInt() {
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        String valueString = scanner.nextLine();
        try {
            value = Integer.parseInt(valueString);
        } catch (ClassCastException e) {
            System.out.println("number expected!");
            setInt();
        }
        return value;
    }

    private String setString() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }
}

