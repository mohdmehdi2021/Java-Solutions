package com.mohdmehdi.ccjava;

class Stopwatch{
    public void startwatch() throws Exception{


        while (true) {
            for (int hh = 0;; hh++) {
                for (int mm = 0; mm <= 59; mm++) {
                    for (int ss = 0; ss <= 59; ss++) {
                        System.out.print("\r");
                        System.out.print(hh+" : "+mm+" : "+ss);
                        Thread.sleep(1000);
                    }
                }
            }
        }

    }
}
public class Main {
    public static void main(String[] args) throws Exception {
       Stopwatch stopwatch = new Stopwatch();
       stopwatch.startwatch();
        // 02 : 22 : 23
    }
}
