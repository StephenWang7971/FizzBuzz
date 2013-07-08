package org.bjdp.kata.sound;

public class Buzz implements SoundMaker {
    @Override
    public String make(Integer value) {
        if (value % 5 == 0)
            return "Buzz";
        return "";
    }
}
