package com.coderbd.math;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Rajaul Islam
 */
public class MathExpressionsFromString {

    public static void main(String[] args) {
        int rs = calculateFromString("2+4*3");
        System.out.println("Result: " + rs);
    }

    public static int calculateFromString(String str) {
        //Create a Script Engine Manager
        ScriptEngineManager seManager = new ScriptEngineManager();
        //create a engine name JavaScript
        ScriptEngine engine = seManager.getEngineByName("JavaScript");
        // evaluate JavaScript code from String
        Object obj = null;
        try {
            obj = engine.eval(str);
        } catch (ScriptException ex) {
            Logger.getLogger(MathExpressionsFromString.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (int) obj;
    }
}
