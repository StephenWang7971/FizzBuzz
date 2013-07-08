package org.bjdp.kata.sound;

/**
 * Created with IntelliJ IDEA.
 * User: stephenwang
 * Date: 13-7-8
 * Time: 下午11:50
 * To change this template use File | Settings | File Templates.
 */
public class None implements SoundMaker{

    @Override
    public String make(Integer value) {
        if (value % 3 == 0 || value % 5 == 0)
            return "";
        return String.valueOf(value);
    }
}
