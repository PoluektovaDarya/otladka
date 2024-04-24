import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = createFruitListt();

        // Вывод списка фруктов
        printFruits(fruits);

        // Создание корзины для фруктов
        FruitBasket basket = new FruitBasket(fruits);

        basket.dispalyBasketInfo();
    }

    public static List<String> createFruitListt() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        return fruits;
    }

    // Метод для вывода списка фруктов
    public static void printFruits(List<String> fruits) {
        System.out.println("Список фруктов:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

class FruitBasket {
    private List<String> fruits;

    public FruitBasket(List<String> fruits)
        this.fruits = fruits;
}

    public void dispalyBasketInfo() {
        System.out.println("Информация о корзине:");
        System.out.println("Количество фруктов: " + fruits.size());
        System.out.println("Содержимое корзины:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
