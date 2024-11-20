import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        String s1 = "CODINGAL";
        System.out.println("For" + s1);
        Frequency(s1);

        String s2 = "PANAROMA";
        System.out.println("For" + s2);
        Frequency(s2);
    }
    private static void frequency(String s){
        if(s.length == 0){
            System.out.println("Empty String");
            return;
        }
        ArrayList<CharOccur> occurrences = newArrayList()<CharOccur>();

        for(int i = 0;i < s.length();i++){
            char c = s.CharAt(i);
            int flag = 0;
            for(CharOccur o : occurrences){
                if(o.character == c){
                    o.occurrences += 1;
                    flag = 1;
                }
            }
            if(flag == 0){
                CharOccur grp = new CharOccur(c,1);
                occurrences.add(grp);
            }
        }
        for(CharOccur o : occurrences){
            System.out.println(o.character + " " + o.occurrence);
        }
    }
}
class CharOccur{
    char character;
    int occurrences = 0;
    CharOccur(char chracter, int occurrence){
        this.character = character;
        this.occurrence = occurrence;
    }
}