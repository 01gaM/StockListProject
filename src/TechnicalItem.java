public class TechnicalItem extends GenericItem {
    short warrantyTime; // гарантийный срок (суток)

    @Override
    public void printAll(){
        System.out.printf("ID: %d, Name: %-20s, price: %5.2f, category: %-10s, warranty time: %d\n", ID, name, price, category, warrantyTime);
    }

}
