package ru.orlovvv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void testEquals() {
        Card c1 = new Card(1,2,1,3);
        Card c2 = new Card(1,2,1,3);
        assertEquals(c1,c2);
    }

    @Test
    void getThird() {
        Card c1 = new Card(1,2,3,1);
        Card c2 = new Card(2, 3, 1, 2);
        assertEquals(Card.getThird(c1,c2), new Card(3, 1, 2, 3));
    }
}