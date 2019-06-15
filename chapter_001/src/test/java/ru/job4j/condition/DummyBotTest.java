package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergei Baranov (mariosb84@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class DummyBotTest {
    /**
     * Test answerGreet.
     */
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Hello, bot."),
                is("Hello, wise guy.")
        );
    }
    /**
     * Test answerBye.
     */
    @Test
    public void whenByeBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Bye."),
                is("See you soon.")
        );
    }
    /**
     * Test answerUnknown.
     */
    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("How much will be if you add 2 + 2?"),
                is("It baffles me. Ask another question.")
        );
    }
}
