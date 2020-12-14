package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import ui.FormularioPaginaPrincipal;

public class PaginaPrincipalQuestion {

    public static Question<String> nombreUsuario(){
        return actor -> TextContent.of(FormularioPaginaPrincipal.BTN_ACCOUNT).viewedBy(actor).asString();
    }
}
