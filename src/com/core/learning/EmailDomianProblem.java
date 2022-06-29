package com.core.learning;

import java.util.*;

public class EmailDomianProblem {
    /**
     * String [] user = {
     *                      p.h.kumar.tiwari@gmail.com, <>Valid</>
     *                      p.h.kumar.tiwari+1@gmail.com, <>Valid</>
     *                      phkumartiwari@gmail.one.com,    <>Valid</>
     *                      p.h.kumar@accent.com,   <>Invalid</>
     * }
     * Find out the valid email id counts
     */
    public static void main(String[] args) {
        String validUserName = "phkumartiwari";
        String validDomain1 = "gmail";
        String validDomain2 = "gmailone";
        String [] users = { "p.h.kumar.tiwari@gmail.com",
                            "p.h.kumar.tiwari+1@gmail.com",
                            "phkumartiwari@gmail.one.com",
                            "p.h.kumar@accent.com",
                            "p.h.kumar@gmail.two.com"
                          };
        List<String> userList = new ArrayList<String>(Arrays.asList(users));
        List<String> userSet = new ArrayList<>();
        for (String user: userList) {
            String [] innerUser = user.split("@");
            String userName = innerUser[0];
            String userDomain = innerUser[1];
            userName = userName.replaceAll("\\.","");
            userDomain = userDomain.replaceAll("[\\.]","");
            if(userName.contains(validUserName)
                    && (userDomain.contains(validDomain1)
                    || userDomain.contains(validDomain2))){
                String accurateId = userName + "@" + userDomain;
                userSet.add(accurateId);
            }
        }
        System.out.println("Valid Accounts are : " + userSet.size());
        for (String user:userSet
             ) {
            System.out.println(user);

        }
    }
}
