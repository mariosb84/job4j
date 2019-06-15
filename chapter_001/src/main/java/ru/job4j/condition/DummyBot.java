package ru.job4j.condition;

/**
 * DummyBot.
 */
public class DummyBot {
    /**
     *Answers the questions.
     * @param question Question from the client.
     * @return Answer.
     */
    public String answer(String question) {
        String rsl = "It baffles me. Ask another question.";
        if ("Hello, bot.".equals(question)) {
            // replace ... with the correct answer rsl = "answer by task".
            rsl = "Hello, wise guy.";
        } else if ("Bye.".equals(question)) { // replace ... with a check if the bot is aware of this question and he knows how to answer it.
            // replace ... with the correct answer rsl = "answer by task".
            rsl = "See you soon.";
        }
        return rsl;
    }
}