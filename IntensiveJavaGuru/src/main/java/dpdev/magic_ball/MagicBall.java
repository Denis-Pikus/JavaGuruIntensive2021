package dpdev.magic_ball;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

public class MagicBall {
    private static final Logger log = LoggerFactory.getLogger(MagicBall.class);
    private String question;

    private final List<String> answersList = List.of(
            "It is certain (Бесспорно)",
            "It is decidedly so (Предрешено)",
            "Without a doubt (Никаких сомнений)",
            "Yes — definitely (Определённо да)",
            "You may rely on it (Можешь быть уверен в этом)",
            "As I see it, yes (Мне кажется — «да»)",
            "Most likely (Вероятнее всего)",
            "Outlook good (Хорошие перспективы)",
            "Signs point to yes (Знаки говорят — «да»)",
            "Yes (Да)",
            "Reply hazy, try again (Пока не ясно, попробуй снова)",
            "Ask again later (Спроси позже)",
            "Better not tell you now (Лучше не рассказывать)",
            "Cannot predict now (Сейчас нельзя предсказать)",
            "Concentrate and ask again (Сконцентрируйся и спроси опять)",
            "Don’t count on it (Даже не думай)",
            "My reply is no (Мой ответ — «нет»)",
            "My sources say no (По моим данным — «нет»)",
            "Outlook not so good (Перспективы не очень хорошие)",
            "Very doubtful (Весьма сомнительно)"
    );

    public MagicBall() {
        log.info(answersList.toString());
    }

    public String getAnswer(String question) {
        this.question = question;
        return answersList.get((int) (Math.random() * answersList.size()));
    }

    public List<String> getAnswersList() {
        return answersList;
    }
}
