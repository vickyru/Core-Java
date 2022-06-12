package com.core.learning;

import java.util.*;

public class EmailDomianProblem {
    /**
     * String [] user = {
     *                      p.h.kumar.tiwari@accenture.com, <>Valid</>
     *                      p.h.kumar.tiwari+1@accenture.com, <>Valid</>
     *                      phkumartiwari@accenture.one.com,    <>Valid</>
     *                      p.h.kumar@accent.com,   <>Invalid</>
     * }
     * Find out the valid email id counts
     */
    public static void main(String[] args) {
        String validUserName = "phkumartiwari";
        String validDomain1 = "accentureonecom";
        String validDomain2 = "accenturecom";
        String [] users = { "p.h.kumar.tiwari@accenture.com",
                            "p.h.kumar.tiwari+1@accenture.com",
                            "phkumartiwari@accenture.one.com",
                            "p.h.kumar@accent.com",
                            "p.h.kumar@accenture.two.com"
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
