package com.core.learning.char_count_in_string;

/**
 * Not working perfectly fine
 */
public class CharCountsInString {
        public void getCount1(){
        String str11 = "PrashantKumarTiwari1234";
        int length=0;
        int count=0;

    do {
        char [] charArray = str11.toCharArray();
        length = charArray.length;
        count =0;
        for (int i=0;i<length;i++){
            if((charArray[0]==charArray[i]) && (charArray[0]>=65&&charArray[0]<=91 || charArray[0]>=97&&charArray[0]<=123)){
                count++;
            }
        }
        if (count!=0){
            System.out.println(charArray[0] + " found " + count + " times");
            str11 = str11.replace(""+charArray[0],"");

        }
        } while (length!=1);
    }
    public static void main(String[] args) {
        CharCountsInString opt = new CharCountsInString();
        opt.getCount1();
    }

}
