import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        //Задание 1.1
        GenericItem genericItem1 = new GenericItem();
        genericItem1.ID = 1;
        genericItem1.name = "chair";
        genericItem1.price = 800;
        genericItem1.printAll();

        GenericItem genericItem2 = new GenericItem();
        genericItem2.ID = 2;
        genericItem2.name = "table";
        genericItem2.price = 1900;
        genericItem2.printAll();

        GenericItem genericItem3 = new GenericItem();
        genericItem3.ID = 3;
        genericItem3.name = "sofa";
        genericItem3.price = 4700;
        genericItem3.printAll();

        //Задание 2.1
        FoodItem foodItem1 = new FoodItem();
        foodItem1.ID = 4;
        foodItem1.name = "juice";
        foodItem1.price = 25;
        foodItem1.category = Category.FOOD;
        foodItem1.dateOfIncome = new Date(2020, 1, 20);
        foodItem1.expires = 60;


        FoodItem foodItem2 = new FoodItem();
        foodItem2.ID = 5;
        foodItem2.name = "cheese";
        foodItem2.price = 100;
        foodItem2.category = Category.FOOD;
        foodItem2.dateOfIncome = new Date(2020, 1, 19);
        foodItem2.expires = 15;

        TechnicalItem technicalItem1 = new TechnicalItem();
        technicalItem1.ID = 6;
        technicalItem1.name = "laptop";
        technicalItem1.price = 80000;
        technicalItem1.category = Category.GENERAL;
        technicalItem1.warrantyTime = 730;

        TechnicalItem technicalItem2 = new TechnicalItem();
        technicalItem2.ID = 7;
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
        FoodItem foodItem11 = new FoodItem();
        foodItem11.ID = 8;
        foodItem11.name = "peach juice";
        foodItem11.price = 25;
        foodItem11.category = Category.FOOD;
        foodItem11.dateOfIncome = new Date(2020, 1, 20);
        foodItem11.expires = 60;

        FoodItem foodItem12 = new FoodItem();
        foodItem12.ID = 9;
        foodItem12.name = "strawberry juice";
        foodItem12.price = 30;
        foodItem12.category = Category.FOOD;
        foodItem12.dateOfIncome = new Date(2020, 1, 21);
        foodItem12.expires = 60;

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
        FoodItem copy2 = (FoodItem)foodItem11.cloneAnalog();
        System.out.println("Копия аналога:");
        copy2.printAll();

    }
}
