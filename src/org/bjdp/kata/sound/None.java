package org.bjdp.kata.sound;

public class None implements SoundMaker{

    @Override
    public String make(Integer value) {
        if (value % 3 == 0 || value % 5 == 0)
            return "";
        return String.valueOf(value);
    }
}
