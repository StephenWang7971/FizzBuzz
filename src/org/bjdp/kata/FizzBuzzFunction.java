package org.bjdp.kata;

import com.sun.xml.internal.bind.v2.model.core.NonElement;
import org.bjdp.kata.sound.Buzz;
import org.bjdp.kata.sound.Fizz;
import org.bjdp.kata.sound.None;
import org.bjdp.kata.sound.Sound;

import java.util.function.Function;

public class FizzBuzzFunction <Integer, String> implements Function {

    Fizz fizz = new Fizz();
    Buzz buzz = new Buzz();
    None none = new None();

    @Override
    public Object apply(Object element) {
        Sound sound = new Sound((java.lang.Integer) element);
        sound.apply(fizz).apply(buzz).apply(none);
        return sound.text;
    }
}
