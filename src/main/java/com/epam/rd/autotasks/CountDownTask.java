package com.epam.rd.autotasks;

public class CountDownTask implements Task{
    public int value = 0;
    //public boolean isFinished = false;

    public CountDownTask(int value) {
        if (value > 0) this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void execute() {
        value--;
        if(value < 0) {
            //isFinished = true;
            value = 0;
        }
    }

    @Override
    public boolean isFinished() {
        if (value <= 0) {return true;}
        return false;
    }
}
