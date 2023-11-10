import java.util.Random;

public class LotteryToys implements Comparable<LotteryToys> {
    Toys toys;
    Integer weight;
    Integer priority;

    public LotteryToys(Toys toys, Integer weight) {
        this.toys = toys;
        this.weight = weight;
        Random random = new Random();
        this.priority = random.nextInt(weight);
    }
    public Integer getPriority() {
        return this.priority;
    }
    public int compareTo(LotteryToys toy) {
        if (this.getPriority() > toy.getPriority()) {
            return -1;
        
        } else {
            return 1;
        }

    }

    @Override
    public String toString() {
        return this.toys.toString() + " Вес: " + this.weight + "; Приоритет: " + this.priority + ";";
    }
    
}
