package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }

    public static void main(String[] args) {
        List<Card> deck = Stream.of(Suit.values())
                .flatMap(s -> Stream.of(Value.values()).map(x -> new Card(s, x)))
                .collect(Collectors.toList());
        deck.forEach(System.out::println);
    }
}

enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
    V_6, V_7, V_8, V_9, V_10, V_V, V_Q, V_K, V_T
}

