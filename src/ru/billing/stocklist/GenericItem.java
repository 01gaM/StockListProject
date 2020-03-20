package ru.billing.stocklist;

import java.util.Objects;

public class GenericItem implements Cloneable {
    private int ID; // ID товара
    private String name; // Наименование товара
    private float price; //Цена товара
    private GenericItem analog; //Товар-аналог (Задание 1.1 пункт 4)
    private Category category = Category.GENERAL; //Категория товара (Задание 1.2)

    private static int currentID; //максимальный назначенный ID товара в текущей сессии (Лаб 3. 1-1)


    public GenericItem(String name, float price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    }

    public void printAll() {
        System.out.printf("ID: %d, Name: %-20s, price: %5.2f, category: %-10s\n", ID, name, price, category);
    }

    //Задание 2.2
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericItem)) return false;
        GenericItem that = (GenericItem) o;
        return this.ID == that.ID &&
                (that.price == price) &&
                name.equals(that.name) &&
                Objects.equals(analog, that.analog) &&
                category == that.category;
    }


    @Override
    public int hashCode() {
        //реализация Objects.hash(ID, name, price, analog, category);
        Object[] a = {ID, name, price, analog, category};

        int result = 1;

        for (Object element : a)
            result = 31 * result + (element == null ? 0 : element.hashCode());

        return result;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (this.analog == null) return super.clone();
        return analog.clone(); //Задание 2.3
    }

    @Override
    public String toString() {
        return "ID: " + this.ID + "; name: " + this.name + "; price: " + this.price + "; category: " + this.category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }
}
