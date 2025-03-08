package com.example.pageviewtracker;

import org.springframework.stereotype.Component;

@Component
public class PageCounter {
    private int pageCounter = 0;

    public void increment() {
        pageCounter++;
    }

    public int getPageCount() {
        return pageCounter;
    }
}
