package ru.billing.client;

import ru.U0901Main;
import ru.billing.stocklist.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        GenericItem.setCurrentID(1); //инициализация ID

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
        technicalItem1.setName("laptop");
        technicalItem1.setPrice(80000);
        technicalItem1.setCategory(Category.GENERAL);
        technicalItem1.setWarrantyTime((short) 730);

        TechnicalItem technicalItem2 = new TechnicalItem();
        technicalItem2.setName("camera");
        technicalItem2.setPrice(9000);
        technicalItem2.setCategory(Category.GENERAL);
        technicalItem2.setWarrantyTime((short) 365);

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
        foodItem11.setAnalog(foodItem12);
        System.out.println("Аналог:");
        foodItem11.getAnalog().printAll();
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


        ////////Лаб 4 ////////
        //Упражнение 4-1
        System.out.println("\n//////Лаб 4//////\n");
        ItemCatalog itemCatalog = new ItemCatalog();
        itemCatalog.addItem(genericItem1);
        itemCatalog.addItem(genericItem2);
        itemCatalog.addItem(genericItem3);
        itemCatalog.addItem(foodItem1);
        itemCatalog.addItem(foodItem2);
        itemCatalog.addItem(technicalItem1);
        itemCatalog.addItem(technicalItem2);
        itemCatalog.addItem(foodItem11);
        itemCatalog.addItem(foodItem12);
        itemCatalog.addItem(newFoodItem);

        itemCatalog.printItems();

        //Сравнение скорости поиска по двум типам коллекций
        System.out.println("\nSearch speed:");

        long begin = new Date().getTime();
        for (int i = 0; i < 100000; i++)
            itemCatalog.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));

        begin = new Date().getTime();
        for (int i = 0; i < 100000; i++)
            itemCatalog.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));

        //Упражнение 4-2
        CatalogLoader loader = new CatalogStubLoader();
        loader.load(itemCatalog);
        System.out.println("\nUpdated catalog: ");
        itemCatalog.printItems();
    }
}
