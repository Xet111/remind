package Jav8.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPractise {
    public void stringExercise(String stringOne, String stringTwo) throws Exception{
        if(stringOne.length() % 2 == 0 && stringTwo.length() % 2 == 0){
            System.out.println(stringOne.subSequence(0,stringOne.length()/2).toString()+
                     stringTwo.subSequence(stringTwo.length()/2, stringTwo.length()));
        }
        else
            throw new Exception("String expected to be even");
    }

    public void frequencyDictionary(String str){
        HashMap<Character, Integer> dict = new HashMap<>();
        str = str.toLowerCase();
        int value = 0;
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length(); j++){
                if(dict.containsKey(str.charAt(i))){
                    break;
                }
                if(str.charAt(i) == str.charAt(j)){
                    value++;
                }
            }
            dict.putIfAbsent(str.charAt(i), value);
            value = 0;
        }
        dict.entrySet().stream().forEach(s -> System.out.println(s));
    }

    public void unicodePoint(String str, int index){
        System.out.println("Character -> " + str.codePointAt(index));
    }

    public void unicodePointBefore(String str, int index){
        System.out.println("Character -> "+ str.codePointBefore(index));
    }

    public void unicodePointRange(String str, int left, int right){
        System.out.println("Character -> " + str.codePointCount(left, right));
    }

    public void stringCompare(String leftCompare, String rightCompare){
        if (leftCompare.compareTo(rightCompare) != 0)
        System.out.println(leftCompare.compareTo(rightCompare) ==1  ?
                "right string is lesser" : "left string is lesser");
        else System.out.println("strings are equal");
    }

    public void stringCompareIgnoreCase(String leftCompare, String rightCompare){
        leftCompare = leftCompare.toLowerCase();
        rightCompare = rightCompare.toLowerCase();
        if (leftCompare.compareTo(rightCompare) != 0)
            System.out.println(leftCompare.compareTo(rightCompare) ==1  ?
                    "right string is lesser" : "left string is lesser");
        else System.out.println("strings are equal");
    }
    public void stringConcat(String mainString, String concatString){
        System.out.println(mainString.concat(concatString));
    }
    public void checkCharSequence(String str, String sequence){
        System.out.println(str.contains(sequence));
    }

    public void stringPractiseMethod(String input, String end, String start, String subString){
        System.out.println("The last character of the string is -> " + input.charAt(input.length() -1));
        System.out.println("The string " + (input.endsWith(end) ? "ends with " + end :
                "doesn't end with " + end));
        System.out.println("The string " + (input.startsWith(start) ? "starts with " + start :
                "doesn't start with " + start));
        System.out.println("The string " + (input.contains(subString) ? "contains " + subString :
                "doesn't contain " + start));
        System.out.println("Position of " + "'" + subString + "' " + "is -> " + input.indexOf(subString));
        System.out.println("Changing all a -> o \n " + input.replace("a", "o"));
        System.out.println("Upper case string is -> " + input.toUpperCase());
        System.out.println("Lower case string is -> " + input.toLowerCase());
        System.out.println("Deleting substring " + "'" + subString + "'" +
                " from " + "'" + input + "'" + " -> " + input.replace(input.substring(
                        input.indexOf(subString) , input.length() + 1 - subString.length()),
                ""));
    }

    public void stringBuilderMethod(int leftOperand, int rightOperand, String operator){
        StringBuilder builder = new StringBuilder();
        builder
                .append(leftOperand)
                .append(operator)
                .append(rightOperand)
                .append(" = ")
                .append( operator == " + " ? (leftOperand + rightOperand) :
                        (operator == " - " ? (leftOperand - rightOperand) :
                                (operator == " * " ? (leftOperand * rightOperand) :
                                        (leftOperand / rightOperand))) );

//        builder
//                .insert(builder.indexOf(" = "), " equals")
//                .deleteCharAt(builder.indexOf("="));
        System.out.println(builder);
    }

    public String replaceEachSecondSubString(String str, String substring, String newString){
        StringBuilder builder = new StringBuilder(str);
        int i = 0, leftBorder = 0;
        while((builder.indexOf(substring, leftBorder) != -1 &&
                (builder.indexOf(substring, leftBorder) +
                        substring.length()) != -1)){
            if(i == 0){
                i = 1;
                leftBorder = builder.indexOf(substring, leftBorder) + substring.length();
            }
            if(i == 1){
                builder.replace(builder.indexOf(substring, leftBorder),
                        builder.indexOf(substring, leftBorder) + substring.length(), newString);
                leftBorder = builder.indexOf(newString, leftBorder) + substring.length();
                i = 0;
            }
        }
        str = builder.toString();
        return str;
    }

    public String centralChars(String str){
        if(str.length() % 2 == 0){
            return  "" + str.charAt((str.length() / 2) - 1) + str.charAt(str.length() / 2);
        }
        else
            return "wrong input";
    }

    public void regexTesting(String testString){
        Pattern pattern = Pattern.compile("Java [0-9]+");
        Matcher matcher = pattern.matcher(testString);
        System.out.println(matcher.matches());
    }
}