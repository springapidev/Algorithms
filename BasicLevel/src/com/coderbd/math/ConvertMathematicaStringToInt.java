package com.coderbd.math;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Rajaul Islam
 */
public class ConvertMathematicaStringToInt {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        engine.put("a", 1);
        engine.put("b", 2);
        engine.put("c", 5);
        try {
            String expression = "(a + b * c) > 10";
            System.out.println("expression: "+expression);
            Object result = engine.eval(expression);
            System.out.println(expression + " ==?== " + result);
        } catch (ScriptException se) {
            se.printStackTrace();
        }
    }
}


