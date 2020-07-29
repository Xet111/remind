package Jav8.Patterns.FabricMethodLesson;

public abstract class FactoryMethod {
    public void render(){
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
