package Jav8.Remind1Week.PatternsR.FactoryR;

public enum DrinkType {
    COCA_COLA ("Cola"),
    SEVEN_UP ("7UP");

    private String title;
    DrinkType(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DrinkType{" +
                "title='" + title + '\'' +
                '}';
    }
}
