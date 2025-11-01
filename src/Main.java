public class Main {
    public static void main(String[] args) {
        // Создаем коробки для фруктов
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        //Добавляем произвольное количество фруктов в коробки
        for (int i = 0; i < 7; i++) {
            appleBox1.addFruit(new Apple());
        }
        for (int i = 0; i < 5; i++) {
            orangeBox1.addFruit(new Orange());
        }

        //Посчитаем вес коробок
        System.out.println("Яблоки: " + appleBox1.getWeight());
        System.out.println("Апельсины: " + orangeBox1.getWeight());

        //Сравниваем вес коробок
        System.out.println("Совпадает ли вес коробок? " + appleBox1.compare(orangeBox1));

        //Перемещение фруктов из одной коробки в другую
        appleBox1.sendFruits(appleBox2);

        //Проверим, как получилось перемещение фруктов (по весу коробок)
        System.out.println("Яблоки в коробке 1: " + appleBox1.getWeight());
        System.out.println("Яблоки в коробке 2: " + appleBox2.getWeight());
    }
}
