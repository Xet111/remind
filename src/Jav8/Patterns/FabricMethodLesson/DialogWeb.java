package Jav8.Patterns.FabricMethodLesson;

public class DialogWeb extends FactoryMethod{
    static int num;

    int res;
    public DialogWeb() {
        num++;
        res = num;

    }

    @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public String toString() {
        return "Full amount is ->"+num
                +"\n " +
                "DialogWeb{ "+res+" }\n";
    }
}
