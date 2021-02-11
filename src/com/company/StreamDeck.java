package com.company;

public class StreamDeck {
    Command button;
    public StreamDeck() {}

    public void setButton(Command command) {
        button = command;
    }

    public void buttonWasPressed() {
        button.execute();
    }


}
