package com.coderbd.anno;

import java.lang.reflect.Method;
@What(description = "An annotation")
@MyAnno(str = "Meta2", val = 99)
public class Main {

    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Main ob = new Main();
        try {
            Class c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}
