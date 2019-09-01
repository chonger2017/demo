package com.example.second;

import javafx.beans.NamedArg;
import org.springframework.stereotype.Component;

import javax.inject.Named;

//@Component
@Named
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Sgt. Pepper's Lonely Hearts Club Band;");
    }
}
