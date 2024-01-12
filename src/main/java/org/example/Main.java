package org.example;

import org.example.Tasks.*;

public class Main {
    public static void main(String[] args) {

        TaskContent firstTask = new FirstTask();
        TaskContent secondTask = new SecondTask();
        TaskContent thirdTask = new ThirdTask();
        TaskContent fourthTask = new FourthTask();

        CustomThread thread = new CustomThread(1, firstTask);
        thread.start();

        CustomThread thread2 = new CustomThread(2, secondTask);
        thread2.start();

        CustomThread thread3 = new CustomThread(3, thirdTask);
        thread3.start();

        CustomThread thread4 = new CustomThread(4,fourthTask);
        thread4.start();

    }
}