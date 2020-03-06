import java.util.Date;

public class FoodItem extends GenericItem {
    Date dateOfIncome; // дата производства
    short expires; //срок годности

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires){
        this.category = Category.FOOD;
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.dateOfIncome = date;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, null, expires);
    }

    public FoodItem(String name) {
        this(name, 0, null, null, (short) 0);
    }

    @Override
    public void printAll(){
        System.out.printf("ID: %d, Name: %-20s, price: %5.2f, category: %-10s, date of income: %tD, expires: %d\n", ID, name, price, category, dateOfIncome, expires);
    }
}
