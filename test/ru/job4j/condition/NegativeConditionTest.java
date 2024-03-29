package ru.job4j.condition;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NegativeConditionTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        NegativeCondition.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "true" + ln
                        + "false" + ln
        ));
    }
}
