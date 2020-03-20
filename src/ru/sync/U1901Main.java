package ru.sync;

public class U1901Main {
    public static void test(){
        U1901Bank bankMain = new U1901Bank();
        U1901Thread threadOne = new U1901Thread(bankMain, 100, 200);
        threadOne.setName("test_thread_1");
        threadOne.setPriority(Thread.MAX_PRIORITY);
        threadOne.start();

        U1901Thread threadTwo = new U1901Thread(bankMain, 50, 300);
        threadTwo.setName("test_thread_2");
        threadTwo.setPriority(Thread.MAX_PRIORITY);
        threadTwo.start();

        System.out.println("Текущий поток: " + Thread.currentThread().getName());


    }
}
