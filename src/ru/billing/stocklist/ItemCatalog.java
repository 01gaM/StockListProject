package ru.billing.stocklist;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog = new HashMap<>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<>();

    public void addItem(GenericItem item) { //добавляет товар в каталог
        catalog.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
    }

    public void printItems() { //распечатывает товары из каталога на экране
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id) { //производит поиск в каталоге по переданному id товара (в catalog)
        //Если нет такого ID, возвращаем пустое значение
        if (!catalog.containsKey(id)) {
            return null;
        }
        return catalog.get(id);
    }

    public GenericItem findItemByIDAL(int id) { //производит поиск в каталоге по переданному id товара (в ALCatalog)
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id) return i;
        }
        return null;
    }


}
