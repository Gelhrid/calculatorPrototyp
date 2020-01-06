package com.company.calculator;

import com.company.mozliwosciObliczenPakiet.Dodawanie;
import com.company.mozliwosciObliczenPakiet.ICalculations;
import com.company.mozliwosciObliczenPakiet.Odejmowanie;
import com.company.parser.DefaultParser;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<String, ICalculations> mozliwosciObliczen = new HashMap<>();
    private Map<String, IParser> parsersMap = new HashMap<>();
    DefaultParser defaultParser = new DefaultParser();

    {
        mozliwosciObliczen.put("+", new Dodawanie());
        mozliwosciObliczen.put("-", new Odejmowanie());

        parsersMap.put("string", );
        parsersMap.put("xml", );
    }

    public int calculate(String input){//albo dodac parametr albo wrapper na input polaczony ze string nputem
        //i jak to zrobil bez mapy
        int result = 0;

        parsers.get().parse(input);
        char[] parsed = defaultParser.parseInput(input);

        result = calculateAllNumbers(parsed);
        return result;
    }

    private int calculateAllNumbers(char[] parsed) {
        int result = Character.getNumericValue(parsed[0]);
        for(int i =1; i<parsed.length; i+=2){
            result = mozliwosciObliczen.get(String.valueOf(parsed[i])).calculations(result, Character.getNumericValue(parsed[i+1]));
        }
        return result;
    }
}
