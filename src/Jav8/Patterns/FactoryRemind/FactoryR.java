package Jav8.Patterns.FactoryRemind;

public class FactoryR {

    public SexBot create(String sex){
        switch (sex){
            case ("omega"):
                return new SexBotOmega();
            case ("ultra"):
                return new SexBotUltra();
        }
        return null;
    }
}
