package org.bjdp.kata.sound;

public class Sound {
    public String text = "";
    public Integer value;

    public Sound apply(SoundMaker maker) {
        text += maker.make(value);
        return this;
    }

    public Sound(Integer v) {
        value = v;
    }
}
