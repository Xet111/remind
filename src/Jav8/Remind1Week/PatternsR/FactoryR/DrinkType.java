package Jav8.Remind1Week.PatternsR.FactoryR;

public enum DrinkType {
    COCA_COLA("coca_cola", 1),
    PEPSI_COLA("pepsi_cola", 2),
    COFFEE("coffee", 3),
    MILK("milk", 4),
    SEVEN_UP("seven up",5);

    String title;
    int code;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    DrinkType(String title, int code) {
        this.title = title;
        this.code = code;
    }
}
