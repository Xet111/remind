package Jav8.Remind1Week.JavaDocExercise.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;



class Test{
    private sex sex;

    enum sex {MALE, FEMALE};

    public Test(sex sex) {
        this.sex = sex;
    }

    public sex getSex() {
        return sex;
    }

    public void setSex(sex sex) {
        this.sex = sex;
    }
}
public class LambdaExpression {
    private ArrayList<Test> roster = new ArrayList<>();

    public void lambdaMethod(){
        roster.add(new Test(Test.sex.FEMALE));
        roster.add(new Test(Test.sex.MALE));
        roster.add(new Test(Test.sex.MALE));

        ConcurrentMap<Test.sex, List<Test>> mapTest = roster
                .parallelStream()
                .collect(Collectors.groupingByConcurrent(Test::getSex));

        System.out.println(mapTest);
    }



}
