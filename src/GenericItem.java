import java.util.Objects;

public class GenericItem implements Cloneable {
    public int ID; // ID товара
    public String name; // Наименование товара
    public float price; //Цена товара
    public GenericItem analog; //Товар-аналог (Задание 1.1 пункт 4)
    public Category category = Category.GENERAL; //Категория товара (Задание 1.2)


    void printAll() {
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
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
