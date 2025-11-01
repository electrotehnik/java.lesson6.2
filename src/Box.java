import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<Fruit> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.size() == 0) {
            return 0;
        }
        return fruits.getFirst().getWeight() * fruits.size();
    }

    public boolean compare(Box<?> comparableBox) {
        return this.getWeight() == comparableBox.getWeight();
    }

    public void sendFruits(Box<T> dstBox) {
        dstBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
