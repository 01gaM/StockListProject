package ru.itmo.exceptions;

/**
 * Исключение, выбрасываемое методом load интерфейса
 * CatalogLoader. Выбрасывается при любых ошибках загрузки каталога.
 **/

public class CatalogLoadException extends Exception {
    public CatalogLoadException (Exception e) {
        super(e);
    }

    public CatalogLoadException() {
        super("Ошибка загрузки каталога!");
    }
}
