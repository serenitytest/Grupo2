package actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDrownDropListValue implements Interaction {
    private final Target target;
    private final String value;

    public SelectDrownDropListValue(Target target, String value) {
        this.target = target;
        this.value = value;
    }

    //Actor selecciona value en el drownDropList
    @Step("{0} selecciona #value en #target")
    public <T extends Actor> void performAs(T theUser) {
        target.resolveFor(theUser).selectByValue(value);
    }

    //1- valueTarget -> Crea un objeto de la misma clase
    //2- performAs -> Forma automatica. => Selecciona el valor de la lista

    /**
     * Permite que sea mas bonita la construccion y seleccion del elemento de la lista
     * @param target
     * @param value
     * @return
     */
    public static Performable valueTarget(Target target, String value) {
        return instrumented(SelectDrownDropListValue.class, target, value);
    }
}