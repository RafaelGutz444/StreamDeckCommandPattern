package com.company;

import java.util.stream.Stream;

public class StreamDeckTest {

    public static void main(String[] args) {
	// write your code here
        StreamDeck board = new StreamDeck();
        Mic mic = new Mic();
        MicControl MicMuted = new MicControl(mic);

        board.setButton(MicMuted);
        board.buttonWasPressed();

    }
}
