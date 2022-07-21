package com.core.learning.bracket;

/**
 * ====== Balanced Brakets =====
 * ()
 * [()]
 * {[()]}
 * ([{{[(())]}}])
 *
 * ========Unbalanced Brakets ====
 * abc[](){}
 * {{[]()}}}}
 * {[(])}
 */

public class BalancedBrakets {
    public static void main(String[] args) {
        String str = "()";
        while (str.contains("()") || str.contains("{}") || str.contains("[]")){
            str = str.replaceAll("\\(\\)","")
                    .replaceAll("\\{\\}","")
                    .replaceAll("\\[\\]","");
        }
        if(str.length()==0){
            System.out.println("Balanced brackets");
        } else {
            System.out.println("Un balances brackets");
        }
    }

}
