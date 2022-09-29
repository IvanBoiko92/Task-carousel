package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
    public boolean isFinished = false;
    public boolean isExecute = false;
    public boolean isComplete = false;

    @Override
    public void execute() {
        if (isComplete) {
            this.isFinished = true;}
    }

    @Override
    public boolean isFinished() {
        if (isFinished) {
            return true;
        }
        return false;
    }

    public void complete() {
        this.isComplete = true;
    }
}
