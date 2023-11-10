import java.util.PriorityQueue;

public class Lottery {
    PriorityQueue<LotteryToys> toyy = new PriorityQueue<LotteryToys>();

    public void add(Toys toys, Integer count) {
        for(int i = 0; i < count; i++) {
            this.toyy.add(new LotteryToys(toys, count));
        }
    }

    public LotteryToys get() {
        return this.toyy.poll();
    }
}
