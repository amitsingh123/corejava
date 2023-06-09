package test.ds.stack;

import javax.sound.midi.Soundbank;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
    String s = "bccabcdecaa";

    public String removeDuplicate(String str){
        char[] charArray = str.toCharArray();
        Set<Character> cSet = new TreeSet<Character>();
        for(int i=0;i<charArray.length;i++){
            cSet.add(charArray[i]);
        }
        StringBuffer sb = new StringBuffer();
        for(Character ch : cSet){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicate rm = new RemoveDuplicate();
        String str = rm.removeDuplicate(rm.s);
        System.out.println("Original String..."+rm.s);
        System.out.println("final string..."+str);
    }
}
