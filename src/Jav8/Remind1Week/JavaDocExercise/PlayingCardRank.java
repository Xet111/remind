package Jav8.Remind1Week.JavaDocExercise;

public enum PlayingCardRank {
    ACE ("ace"),
    NOT_ACE("Not ace");
    public String rank;
    PlayingCardRank(String rank){
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "PlayingCardRank{" +
                "rank='" + rank + '\'' +
                '}';
    }
}
