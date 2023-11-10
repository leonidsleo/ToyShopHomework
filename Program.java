import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Игрушки разыграны. Результат в файле результат.txt");
        Lottery lottery = new Lottery();
        lottery.add(new Toys(1, "Конструктор"), 2);
        lottery.add(new Toys(2, "Робот"), 2);
        lottery.add(new Toys(3, "Кукла"), 6);

        saveResult(lottery);
    }

    public static void saveResult (Lottery lottery) throws IOException {
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter("результат.txt"));
        LotteryToys result = lottery.get();
        while (result != null) {
            writer.write(result.toString());
            writer.newLine();
            result = lottery.get();
        }
        writer.flush();
        writer.close();
    }
    
}