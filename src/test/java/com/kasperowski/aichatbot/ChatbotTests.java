package com.kasperowski.aichatbot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChatbotTests {
    @Test
    void junitWorks() {
        assertTrue(true);
    }

    @Test
    void greetsUs() {
        String response = Chatbot.greeting();
        assertEquals("Hi there, I'm your chatbot!", response);
    }

    @Test
    void hi() {
        assertEquals("Well hello there!", Chatbot.respond("Hi"));
        assertEquals("Well hello there!", Chatbot.respond("hi"));
    }

    @Test
    void hello() {
        assertEquals("Hello, my friend!", Chatbot.respond("Hello"));
        assertEquals("Hello, my friend!", Chatbot.respond("hello"));
    }

    @Test
    void iWantTea() {
        assertEquals("Hmmm, I think you'll have to take care of that yourself - I'm just a chatbot.", Chatbot.respond("I want a cup of tea"));
    }

    @Test
    void garbageIn() {
        assertEquals("Sorry, I don't understand. Will you try again?", Chatbot.respond("random junk asunthaoeusntoehu"));
    }
}
