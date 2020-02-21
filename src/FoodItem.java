import java.util.Date;

public class FoodItem extends GenericItem {
    Date dateOfIncome; // дата производства
    short expires; //срок годности

    @Override
    public void printAll(){
        System.out.printf("ID: %d, Name: %-20s, price: %5.2f, category: %-10s, date of income: %tD, expires: %d\n", ID, name, price, category, dateOfIncome, expires);
    }
}
