import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> sales = new ArrayList<>();

        while (true) {
            System.out.println("Выбирите операцию:\n0. Завершить программу\n1. Добавить\n2. Показать\n3. Удалить");
            String operation = scanner.next();
            if ("0".equals(operation)) {
                break;
            }

            switch (operation) {

                case "1": {
                    System.out.println("Какую покупку хотите добавить ? ");
                    sales.add(scanner.next());
                    break;
                }
                case "2": {
                    list(sales);
                    break;
                }
                case "3": {
                    list(sales);
                    System.out.println("Какой товар хотите удалить? Введите номер или название ");
                    String NumberOrName = scanner.next();
                    try {
                        int index = Integer.parseInt(NumberOrName) - 1;
                        sales.remove(index);
                    } catch (Exception e) {
                        sales.remove(NumberOrName);
                    }
                    list(sales);
                }
            }
        }
        System.out.println("Пока");
    }
    private static void list(List<String> sales) {

        System.out.println("Список товаров:");
        for (int i = 0; i < sales.size(); i++) {
            int count = i + 1;
            System.out.println(count + ". " + sales.get(i));
        }
    }
}


