package Jav8.Patterns.FabricMethodLesson;

public class DialogWin extends FactoryMethod{
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
