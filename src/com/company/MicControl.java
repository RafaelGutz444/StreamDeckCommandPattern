package com.company;

public class MicControl implements Command{
    Mic mic;

    public MicControl(Mic mic) {
        this.mic = mic;
    }

    public void execute() {
        mic.Mute();

    }

}
