package ru;

import java.util.Random;

public class U0901Main {
    public static void main() {
        Integer intArr[] = {10, 20, 15};
        Float floatArr[] = new Float[3];

        //заполнение floatArr случайными значениями от 1 до 100
        for (int i = 0; i < floatArr.length; i++) {
            Random r = new Random();
            floatArr[i] = 1 + r.nextFloat() * (100 - 1);
        }

        U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<>(intArr);
        System.out.println("Результат sum() для intArr: " + insWorkArrayInt.sum());

        U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<>(floatArr);
        System.out.println("Результат sum() для floatArr: " + insWorkArrayFloat.sum());

    }

}
