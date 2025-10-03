import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        int totalCost = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Список товаров:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + " - " + products[i] + " (" + prices[i] + " руб.)");
        }

        while (true) {
            System.out.println("Выберите товар и количество или введите end");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Неверный формат! Пример: 1 3");
                continue;
            }

            int productNumber = Integer.parseInt(parts[0]);
            int productCount = Integer.parseInt(parts[1]);


            if (productNumber < 0 || productNumber >= products.length) {
                System.out.println("Такого товара нет. Выберите номер от 0 до " + (products.length - 1));
                continue;
            }

            int cost = prices[productNumber] * productCount;
            totalCost += cost;
        }

        System.out.println("Итоговая сумма: " + totalCost + " руб.");
        scanner.close();
    }
}