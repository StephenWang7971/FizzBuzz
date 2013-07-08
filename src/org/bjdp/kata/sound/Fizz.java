package org.bjdp.kata.sound;

public class Fizz implements SoundMaker {
    @Override
    public String make(Integer value) {
        if (value % 3 == 0)
            return  "Fizz";
        return "";
    }
}
