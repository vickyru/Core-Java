package com.core.learning.bracket;

/**
 * Find open brakest which are having close braket
 * {{}}}{{{}}{}}
 */
public class FindOpenAndCloseBracket {

    public void method1(){

        // Count open brakets for them we have closed brackets
        String countBrakets="{}}}{{{{}{}";
        System.out.println( "Open Brackets => " + countBrakets.chars().filter(ch -> ch == (int)'{').count());
        System.out.println( "Closed Brackets=> " + countBrakets.chars().filter(ch -> ch == (int)'}').count());
        // Find the count of open brakets for which we have closed brakets as well
        char[] charArray = countBrakets.toCharArray();
        int count=0;
        for (int i=0;i<charArray.length-1;i++){
            if(charArray[i] == (int)'{'&& charArray[i+1] == (int)'}' ){
                count++;
            }
        }
        System.out.println( count + " Numbers of open { brackets which are having closing } brackets as well are: ");
    }

    public void method2(){
        String countBrakets="{{{}}}{{{{}{}{}{{}}";
        String [] array = countBrakets.split("\\{\\}");
        System.out.println("Bracket Counts :" + (array.length+1));
    }
    public static void main(String[] args) {
        FindOpenAndCloseBracket obj = new FindOpenAndCloseBracket();
        obj.method1();
        obj.method2();
    }
}
