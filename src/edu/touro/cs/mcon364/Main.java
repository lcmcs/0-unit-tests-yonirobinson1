package edu.touro.cs.mcon364;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> phoneMap = new HashMap<String, String>();
        phoneMap.put("718.222.3456", "Bob");
        phoneMap.put("345.123.1234", "Quan");

        System.out.println(phoneMap.get("345.123.1234"));

        for (Map.Entry<String,String> keyValuePair : phoneMap.entrySet()) {
            System.out.println(keyValuePair.getKey() + " : "
                    + keyValuePair.getValue());l
        }
    }
}
