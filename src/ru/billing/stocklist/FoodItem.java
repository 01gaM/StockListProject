package ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome; // дата производства
    private short expires; //срок годности

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        this.setCategory(Category.FOOD);
        this.setName(name);
        this.setPrice(price);
        this.setAnalog(analog);
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
    public void printAll() {
        System.out.printf("ID: %d, Name: %-20s, price: %5.2f, category: %-10s, date of income: %tD, expires: %d\n", this.getID(), this.getName(), this.getPrice(), this.getCategory(), dateOfIncome, expires);
    }

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public short getExpires() {
        return expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }
}
