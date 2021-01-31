package com.ToDoList;

import java.util.*;

public class List {

    private List<String> myList = new ArrayList<>();

    public void addTask (String task) {

        myList.add(task);

    }

    public void addPositionTask (int position, String task) {

        if (position < myList.size()) {
            myList.add(position, task);
        }
        else System.out.println ("This position is very big, please change position!");
    }

    public void changeTask (int position, String task) {

        if (position < myList.size()) {
            myList.set(position, task);
        }
        else System.out.println ("This position is very big, please change position!");
    }
}
