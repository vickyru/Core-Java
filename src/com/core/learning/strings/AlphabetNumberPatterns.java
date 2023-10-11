package com.core.learning.strings;

/**
 * a1b2c3d4 =>abbcccdddd
 * a1b5c1
 */
public class AlphabetNumberPatterns {
    public void method1(){
        String str = "a1b5c1a5";
        char [] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int lenght = charArray.length;
        for (int i = 0; i < lenght; i++) {
            if((i != 0) && ((i+1) % 2)==0){
                int innserLength = ((int)str.charAt(i)-48);
                for (int j = 0; j < innserLength; j++) {
                    sb = sb.append(""+charArray[i-1]);
                }
            }
        }
        System.out.println(sb);

    }
    public void method2(){
        String str = "a1b2c3d4e5f";
        StringBuffer outPut = new StringBuffer();
        char [] charArray = str.toCharArray();
        StringBuilder alphabetString = new StringBuilder();
        StringBuilder numberString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>= (int)'a' && str.charAt(i)<= (int)'z'){
                alphabetString.append(str.charAt(i));
            } else {
                numberString.append(str.charAt(i));
            }
        }
        System.out.println("Alphabet String " + alphabetString);
        System.out.println("Number String " + numberString);
        for (int i = 0; i < numberString.length(); i++) {
            for (int j = 0; j < alphabetString.length(); j++) {
                if (i==j){
                    String item = String.valueOf(alphabetString.charAt(i));
                    int times = (numberString.charAt(j) - '0');
                    outPut.append(item.repeat((times)));
                }
            }
        }
        System.out.println(outPut);
    }

    public static void main(String[] args) {
        AlphabetNumberPatterns obj = new AlphabetNumberPatterns();
//        obj.method1();
        obj.method2();
    }

}
