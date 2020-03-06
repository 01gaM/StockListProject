import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        GenericItem.currentID = 1; //инициализация ID

        //Задание 1.1
        GenericItem genericItem1 = new GenericItem("chair", 800, Category.GENERAL);
        genericItem1.printAll();

        GenericItem genericItem2 = new GenericItem("table", 1900, Category.GENERAL);
        genericItem2.printAll();

        GenericItem genericItem3 = new GenericItem("sofa", 4700, Category.GENERAL);
        genericItem3.printAll();

        //Задание 2.1
        FoodItem foodItem1 = new FoodItem("juice", 25, null, new Date(2020, 1, 20), (short) 60);

        FoodItem foodItem2 = new FoodItem("cheese", 100, null, new Date(2020, 1, 19), (short) 15);

        TechnicalItem technicalItem1 = new TechnicalItem();
        technicalItem1.ID = GenericItem.currentID++;
        technicalItem1.name = "laptop";
        technicalItem1.price = 80000;
        technicalItem1.category = Category.GENERAL;
        technicalItem1.warrantyTime = 730;

        TechnicalItem technicalItem2 = new TechnicalItem();
        technicalItem2.ID = GenericItem.currentID++;

        technicalItem2.name = "camera";
        technicalItem2.price = 9000;
        technicalItem2.category = Category.GENERAL;
        technicalItem2.warrantyTime = 365;

        GenericItem[] items = {foodItem1, foodItem2, technicalItem1, technicalItem2};

        for (GenericItem curr_item :
                items) {
            curr_item.printAll();
        }

        //Задание 2.2
        FoodItem foodItem11 = new FoodItem("peach juice", 25, null, new Date(2020, 1, 20), (short) 60);

        FoodItem foodItem12 = new FoodItem("strawberry juice", 30, null, new Date(2020, 1, 21), (short) 60);

        System.out.println("\nРезультат сравнения foodItem11 и foodItem12: " + foodItem11.equals(foodItem12));

        FoodItem copy = (FoodItem) foodItem11.clone();
        System.out.println("Оригинал:");
        foodItem11.printAll();
        System.out.println("Копия:");
        copy.printAll();
        System.out.println("\nРезультат сравнения foodItem11 и копии: " + foodItem11.equals(copy));
        System.out.print("\nРезультат работы методы toString() для foodItem11: " + foodItem11.toString());

        //Задание 2.3
        System.out.println("\nОригинал:");
        foodItem11.printAll();
        foodItem11.analog = foodItem12;
        System.out.println("Аналог:");
        foodItem11.analog.printAll();
        FoodItem copy2 = (FoodItem) foodItem11.clone();
        System.out.println("Копия аналога:");
        copy2.printAll();


        ////////Лаб 3 ////////
        //Задание 2-1
        System.out.println("\n//////Лаб 3//////\n");
        U0901Main.main();

        //Задание 3-1
        String line = "Конфеты 'Маска';45;120"; //<name>;<price>;<expires>
        String[] item_fld = line.split(";");

        FoodItem newFoodItem = new FoodItem(item_fld[0], Float.valueOf(item_fld[1]), Short.valueOf(item_fld[2]));

        System.out.println("\n\nСтрока со значениями полей объекта: " + line);
        System.out.println("Новый объект по данным строки:");
        newFoodItem.printAll();
    }
}
