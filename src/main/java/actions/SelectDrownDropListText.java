package actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDrownDropListText implements Interaction {
    private final Target target;
    private final String visibleText;

    public SelectDrownDropListText(Target target, String visibleText) {
        this.target = target;
        this.visibleText = visibleText;
    }

    @Step("{0} selecciona #visibleText en #target")
    public <T extends Actor> void performAs(T theUser) {
        target.resolveFor(theUser).selectByVisibleText(visibleText);
    }



    public static Performable textTarget(Target target, String visibleText) {
        return instrumented(SelectDrownDropListText.class, target, visibleText);
    }
}