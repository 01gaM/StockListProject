

public class GenericItem implements Cloneable{
    public int ID; // ID товара
    public String name; // Наименование товара
    public float price; //Цена товара
    public GenericItem analog; //Товар-аналог (Задание 1.1 пункт 4)
    public Category category = Category.GENERAL; //Категория товара (Задание 1.2)


    void printAll() {
        System.out.printf("ID: %d, Name: %-20s, price: %5.2f, category: %-10s\n", ID, name, price, category);
    }

    //Задание 2.2
    public boolean equals(Object o){
        return (this == o);
    }

    public Object clone()  throws CloneNotSupportedException{
        GenericItem genericItem = (GenericItem)super.clone();
        return genericItem;
    }

    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    //Задание 2.3
    public Object cloneAnalog()  throws CloneNotSupportedException{
        GenericItem genericItem = (GenericItem)analog.clone();
        return genericItem;
    }

}
