package com.kasperowski.aichatbot;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChatbotTests {
    private Chatbot chatbot;

    @BeforeEach
    void setup() {
        chatbot = new Chatbot();
    }

    @Test
    void junitWorks() {
        assertTrue(true);
    }

    @Test
    void greetsUs() {
        String response = chatbot.greeting();
        assertEquals("Hi there, I'm your chatbot!", response);
    }

    @Test
    void hi() {
        assertEquals("Well hello there!", chatbot.respond("Hi"));
        assertEquals("Well hello there!", chatbot.respond("hi"));
    }

    @Test
    void hello() {
        assertEquals("Hello, my friend!", chatbot.respond("Hello"));
        assertEquals("Hello, my friend!", chatbot.respond("hello"));
    }

    @Test
    void iWantSomething() {
        assertEquals("Hmmm, I think you'll have to take care of that yourself - I'm just a chatbot.", chatbot.respond("I want a cup of tea"));
        assertEquals("Hmmm, I think you'll have to take care of that yourself - I'm just a chatbot.", chatbot.respond("I want a cup of tea."));
        assertEquals("Hmmm, I think you'll have to take care of that yourself - I'm just a chatbot.", chatbot.respond("I want a lobster roll and some ice cream."));
    }

    @Test
    void garbageIn() {
        assertEquals("Sorry, I don't understand. Will you try again?", chatbot.respond("random junk asunthaoeusntoehu"));
    }
}
