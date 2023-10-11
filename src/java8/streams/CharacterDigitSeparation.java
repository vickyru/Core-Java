package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class CharacterDigitSeparation {
    public static void main(String[] args) {
        String input = "1a2b3c";
        StringBuilder sb = new StringBuilder();

        List<Integer> digits = new ArrayList<>();
        List<Character> characters = new ArrayList<>();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.add(Character.getNumericValue(ch));
            } else {
                characters.add(ch);
            }
        }

        System.out.println("Digits: " + digits);
        System.out.println("Characters: " + characters);
        
//        for (int n=0; n < digits.size(); n++ ){
//            sb = sb.append(""+characters[n].repeat(digits[n]));
//            break;
//        }

        for (int n: digits) {
            for (char ch : characters){
                sb.append(Character.toString(ch).repeat(n));
            }
            break;
        }
        System.out.println(sb);
        
    }
}
