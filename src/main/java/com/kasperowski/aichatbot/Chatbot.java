package com.kasperowski.aichatbot;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chatbot {
    public static void main(String[] args) throws IOException {
        System.out.println(greeting());
        String input;
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.print("So now what? ");
            input = reader.readLine();
            System.out.println(respond(input));
        }
    }

    static String greeting() {
        return "Hi there, I'm your chatbot!";
    }

    static String respond(String input) {
        if ("Hi".equals(input) || "hi".equals(input)) {
            return "Well hello there!";
        } else if ("Hello".equals(input) || "hello".equals(input)) {
            return "Hello, my friend!";
        } else if ("I want a cup of tea".equals(input)) {
            return "Hmmm, I think you'll have to take care of that yourself - I'm just a chatbot.";
        }
        // else
        return "Sorry, I don't understand. Will you try again?";
    }
}
