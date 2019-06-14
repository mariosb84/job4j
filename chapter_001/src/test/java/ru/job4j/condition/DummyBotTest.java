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
                bot.answer("������, ���."),
                is("������, �����.")
        );
    }
    /**
     * Test answerBye.
     */
    @Test
    public void whenByeBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("����."),
                is("�� ������ �������.")
        );
    }
    /**
     * Test answerUnknown.
     */
    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("������� ����� 2 + 2?"),
                is("��� ������ ���� � �����. ������� ������ ������.")
        );
    }
}
