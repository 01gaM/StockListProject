package ru.itmo.exceptions;

/**
 * Исключение, выбрасываемое методом addItem класса
 * ItemCatalog. Выбрасывается в том случае, когда добавляемая позиция уже присутствует в
 * каталоге.
 **/

public class ItemAlreadyExistsException extends Exception {

    public ItemAlreadyExistsException() {
        super("Позиция уже присутствует в каталоге!");
    }
}
