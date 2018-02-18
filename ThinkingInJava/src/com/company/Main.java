package com.company;

public class Main {


    static DefaultValuesPrimitives values = new DefaultValuesPrimitives();
    static HelloWorld sayHi =  new HelloWorld();
    ATypeName a = new ATypeName();
    static DataOnly data = new DataOnly();
    static Incrementable sf = new Incrementable();
    static StaticTest st1 = new StaticTest();
    static StaticTest st2 = new StaticTest();
    public static void main(String[] args) {

        /**
         * Exercise 11: (1) Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
         */
        AllTheColorsOfTheRainbow acr = new AllTheColorsOfTheRainbow();
        acr.anIntegerRepresentingColors=10;
        System.out.println("The color is: "+acr.anIntegerRepresentingColors);
        acr.changeTheHueOfTheColor(11);
        System.out.println("The color after change is: "+acr.anIntegerRepresentingColors);

        //Exercise 10: (2) Write a program that prints three arguments taken from the command
        //line. To do this, you’ll need to index into the command-line array of Strings. commented because it will
        //work only from cmd or changing th config

     /*   for (int i = 0; i < 3; i++){
            System.out.println(args[i]);
        }*/


        //Exercise 9: (2) Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.
        char c = 'x';
        Character ch = new Character(c);
        System.out.println("character ch: "+ch);

        //Exercise 8: (3) Write a program that demonstrates that, no matter how many objects
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        //ex 7
        int incremented = sf.increment();
        System.out.println("Incremented value is: "+sf.increment());
        //ex 6
        System.out.println("Storage() method: "+storage("this string"));
        //Exercise 5: (1) Modify the previous exercise so that the values of the data in DataOnly are assigned to and printed in main( ).
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println("data only values are: ");
        System.out.println("i = "+data.i);
        System.out.println("d = "+data.d);
        System.out.println("b = "+data.b);
        //ex 1
        values.printMyValues();
        //ex 2
        System.out.println(sayHi.sayHi);
    }

    class ATypeName {

    }

    /**
     * Exercise 4: (1) Turn the DataOnly code fragments into a program that compiles and runs.
     */

    static class DataOnly {
        int i;
        double d;
        boolean b;
    }

    /**
     * Exercise 6: (2) Write a program that includes and calls the storage( ) method defined as a code fragment in this chapter.
     */
    static int storage(String s) {
        return s.length() * 2;
    }

    /**
     * Exercise 7: (1) Turn the Incrementable code fragments into a working program.
     */
    static class StaticTest {
        static int i = 47;
    }

    static class Incrementable {
        static int increment() {
            int incremented = StaticTest.i++;
            return incremented;
        }
    }

    /**
     * Exercise 11: (1) Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
     */

   static class AllTheColorsOfTheRainbow {
        int anIntegerRepresentingColors;
        void changeTheHueOfTheColor(int newHue) {
            anIntegerRepresentingColors=newHue;
        }
    }

}
