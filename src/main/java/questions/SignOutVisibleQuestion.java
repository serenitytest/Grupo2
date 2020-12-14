package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import ui.FormularioPaginaPrincipal;

public class SignOutVisibleQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(FormularioPaginaPrincipal.BTN_SIGN_OUT).viewedBy(actor).resolve();
    }
}
