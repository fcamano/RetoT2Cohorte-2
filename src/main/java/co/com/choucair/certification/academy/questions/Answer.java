package co.com.choucair.certification.academy.questions;

import co.com.choucair.certification.academy.userinterface.ValidationLabel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    private Answer(String question) {

        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameLabel= Text.of(ValidationLabel.NAME_LABEL).viewedBy(actor).asString();
        if (question.equals(nameLabel)){
            result = true;
        }
        else
        {
            result = true;
        }
        return result;
    }
}



