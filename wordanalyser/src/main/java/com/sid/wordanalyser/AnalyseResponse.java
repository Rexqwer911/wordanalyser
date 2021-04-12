package com.sid.wordanalyser;

import java.util.ArrayList;

public class AnalyseResponse {

    private String letter;

    private String count;

    public AnalyseResponse(String word) {

        String st = word.toLowerCase().replaceAll("\\s", "").replaceAll("[0-9]", "");

        char[] masChars = st.toCharArray();

        ArrayList charArr = new ArrayList<String>();

        String currentSymbol;

        for(int i = 0; i < masChars.length; i++) {
            currentSymbol = Character.toString(masChars[i]);
            if(!charArr.contains(currentSymbol)){
                charArr.add(currentSymbol);
            }
        }

        int[] masCount = new int[charArr.size()];

        for(int i = 0; i < charArr.size(); i++) {
            currentSymbol = (String)charArr.get(i);
            for(int j = 0; j < masChars.length; j++) {
                if(Character.toString(masChars[j]).equals(currentSymbol)){
                    masCount[i] += 1;
                }
            }
        }

        String letter = "";
        int count = 0;
        for(int i = 0; i < charArr.size(); i++) {
            if (masCount[i] >= count) {
                letter = (String) charArr.get(i);
                count = masCount[i];
            }
        }

        this.count = String.valueOf(count);
        this.letter = letter;
    }
}
