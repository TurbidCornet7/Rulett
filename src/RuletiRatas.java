
import java.util.ArrayList;
import java.util.List;


public class RuletiRatas {
    private final List<RuletiNumber> numbrid = new ArrayList<>();
    private int indeks;

    public RuletiRatas() {
        // loob RuletiRatta isendi 36 erineva numbriga
        indeks = 0;
        for (int i = 0; i <= 35; i++) {
            if (i == 0) {
                numbrid.add(new RuletiNumber(i, 'r'));
                //0 on rohelist värvi
            } else {
                if (i % 2 == 0) {
                    //paarisarvud on punast värvi
                    numbrid.add(new RuletiNumber(i, 'p'));

                } else {
                    //paaritud arvud on musta värvi
                    numbrid.add(new RuletiNumber(i, 'm'));
                }
            }

        }

    }


    public RuletiNumber veereta() throws InterruptedException {
        int veeretusteArv = (int) (Math.random() * (100 - 50) + 50); //Juhuslik arv, mitmenda elemendini indeks liigub
        for (int i = indeks; i < veeretusteArv; i++) {
            int pärisIndeks = i % numbrid.size(); //käsitleme massiivi, kui jada mis lõppu jõudes algab otsast peale
            for (int j = pärisIndeks; j < pärisIndeks + 7; j++) {
                int temp = j % numbrid.size();
                System.out.print(numbrid.get(temp));
            }
            System.out.println();
            System.out.println(" |");

            Thread.sleep(200);

            indeks = pärisIndeks;
        }
        return numbrid.get(indeks);//tagastab võidunumbri

    }


}
