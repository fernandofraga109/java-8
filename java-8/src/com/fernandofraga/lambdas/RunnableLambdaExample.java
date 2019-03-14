package com.fernandofraga.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         *  prior java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();


        /**
         * java 8 lambda syntaxe
         */
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable lambda");
        };
        new Thread(runnableLambda).start();

        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable lambda 2");
        new Thread(runnableLambda1).start();

        new Thread(() -> System.out.println("Inside Runnable lambda 3")).start();
    }

}
