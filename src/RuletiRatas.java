import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RuletiRatas {
    private final List<RuletiNumber> numbrid = new ArrayList<>();
    private int indeks;

    public RuletiRatas() {
        indeks = 0;
        for (int i = 0; i <= 35; i++) {
            if (i == 0) {
                numbrid.add(new RuletiNumber(i, 'r'));
            } else {
                if (i % 2 == 0) {
                    numbrid.add(new RuletiNumber(i, 'p'));

                } else {
                    numbrid.add(new RuletiNumber(i, 'm'));
                }
            }

        }

    }


    public RuletiNumber veereta() throws InterruptedException {
        int veeretusteArv = (int) (Math.random() * (100 - 50) + 50);
        for (int i = indeks; i < veeretusteArv; i++) {
            int pärisIndeks = i % numbrid.size();
            for (int j = pärisIndeks; j < pärisIndeks + 7; j++) {
                int temp = j % numbrid.size();
                System.out.print(numbrid.get(temp));
            }
            System.out.println();
            System.out.println(" |");

            Thread.sleep(200);

            indeks = pärisIndeks;
        }
        return numbrid.get(indeks);

    }


}
