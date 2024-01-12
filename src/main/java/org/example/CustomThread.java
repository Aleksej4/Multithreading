package org.example;

import org.example.Tasks.TaskContent;

import java.time.LocalTime;

public class CustomThread extends Thread{
    private int threadNumber;
    private TaskContent task;

    public CustomThread(int threadNumber, TaskContent task){
        this.threadNumber = threadNumber;
        this.task = task;
    }

    @Override
    public void run(){
        System.out.println("Thread " + threadNumber + " start time: " + LocalTime.now());
        task.startTask();
    }
}
