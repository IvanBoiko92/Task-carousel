package com.epam.rd.autotasks;

public class Main extends TaskCarousel{
    public Main(int capacity) {
        super(capacity);
    }

    public static void main(String[] args){
        TaskCarousel carousel = new TaskCarousel(4);
    }
}
