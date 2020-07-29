package Jav8.Patterns.FabricMethodLesson;

public class WebButton implements Button{
    @Override
    public void render() {
        System.out.println("Html");
    }
}
