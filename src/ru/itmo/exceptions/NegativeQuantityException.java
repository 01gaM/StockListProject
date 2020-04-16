package ru.itmo.exceptions;

/**
 * Исключение, выбрасываемое методом remQuantity
 * класса Warehouse. Выбрасывается в случае
 * попытки списать со склада количество товара больше имеющегося.
 */

public class NegativeQuantityException extends Exception {
    public NegativeQuantityException() {
        super("Нельзя списать со склада количество товара больше имеющегося!");
    }
}
