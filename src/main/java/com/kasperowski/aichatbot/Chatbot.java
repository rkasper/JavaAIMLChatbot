package com.kasperowski.aichatbot;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.configuration.BotConfiguration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chatbot {
    private static Chat chat;

    public Chatbot() {
        Bot bot = new Bot(BotConfiguration.builder()
                .name("alice")
                .path("src/main/resources")
                .build());
        chat = new Chat(bot);
    }

    public static void main(String[] args) throws IOException {
        Chatbot chatbot = new Chatbot();
        System.out.println(chatbot.greeting());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.print("So now what? ");
            String input = reader.readLine();
            System.out.println(chatbot.respond(input));
        }
    }

    String greeting() {
        return "Hi there, I'm your chatbot!";
    }

    String respond(String input) {
        return chat.multisentenceRespond(input);
    }
}
