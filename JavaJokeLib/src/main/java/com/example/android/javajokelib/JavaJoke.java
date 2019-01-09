package com.example.android.javajokelib;


public class JavaJoke {

    public JavaJoke(){}

    public static final String[] jokes = {"An Android app walks into a bar. Bartender asks: \n" +
            " - Can I get you a drink?\n" +
            "The app looks disappointed and says,: \n"+
            " - That wasn’t my intent.", "Q: What is the difference between Android 2.1 and 2.2?\n" +
            "A: 6 months", "Google’s definition of an upgrade:\n" +
            "Take old bugs out, put new ones in."};

    public static String getJoke(){
        return jokes[0];
    }
}
