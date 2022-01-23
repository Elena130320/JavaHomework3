import java.util.ArrayList;

public class Box<T> {
    private double weightFruit = 0.0;
    ArrayList<T> fruits = new ArrayList();

    public <T> Box(double weightFruit) {
        this.weightFruit = weightFruit;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> boxFruit) {
        return Math.abs(getBoxWeight() - boxFruit.getBoxWeight()) < 0.00001;
    }

    public void addFruits(Box<T> box) {
        System.out.println("Before merging. Quantity box 1: " + fruits.size());
        System.out.println("Before merging. Quantity box 2: " + box.fruits.size());
        fruits.addAll(box.fruits);
        box.fruits.clear();
        box.fruits.trimToSize();
        System.out.println("After merging. Quantity box 1: " + fruits.size());
        System.out.println("After merging. Quantity box 2: " + box.fruits.size());

    }
}
