package ru.sync;

public class U1901Bank {
    private int intTo;
    private int intFrom = 220;

    synchronized public void calc(int intTransaction, long lngTimeout) {
        System.out.println("before| " + "Текущий поток: " + Thread.currentThread().getName() + "| intTo: " + intTo + ", intFrom: " + intFrom);

        intFrom -= intTransaction;

        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        intTo += intTransaction;
        System.out.println("after| " + "Текущий поток: " + Thread.currentThread().getName() + "| intTo: " + intTo + ", intFrom: " + intFrom);

    }
}
