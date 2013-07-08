package org.bjdp.kata.sound;

/**
 * Created with IntelliJ IDEA.
 * User: stephenwang
 * Date: 13-7-8
 * Time: 下午11:46
 * To change this template use File | Settings | File Templates.
 */
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
