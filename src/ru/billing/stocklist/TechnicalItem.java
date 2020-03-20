package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {
    private short warrantyTime; // гарантийный срок (суток)

    @Override
    public void printAll() {
        System.out.printf("ID: %d, Name: %-20s, price: %5.2f, category: %-10s, warranty time: %d\n", this.getID(), this.getName(), this.getPrice(), this.getCategory(), warrantyTime);
    }

    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }
}
