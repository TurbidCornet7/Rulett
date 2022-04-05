import javax.swing.*;

public class Peaklass {
    public static void main(String[] args) throws InterruptedException {
        boolean mängib = true;
        RuletiRatas ratas = new RuletiRatas();
        Saldo saldo = new Saldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Palun sisesta saldo")));
        System.out.println(saldo.getsaldoJääk());
        while (mängib) {
            if (saldo.getsaldoJääk() == 0) {
                JOptionPane.showMessageDialog(null, "Kaotasid kõik, pere lahkus Su juurest");
                break;
            }
            saldo.setPanus(Double.parseDouble(JOptionPane.showInputDialog(null, "Sisesta panus", "Max lubatud panus: " + saldo.getsaldoJääk())));

            int panustatav = Integer.parseInt(JOptionPane.showInputDialog(null, "Sisesta number mille peale panustasid", "0-36"));
            while (panustatav < 0 || panustatav > 36) {
                panustatav = Integer.parseInt(JOptionPane.showInputDialog(null, "Sisesta uuesti", "0-36"));
            }

            RuletiNumber võitja = ratas.veereta();

            if (võitja.getNumbriVäärtus() == panustatav) {
                saldo.voit();
            } else saldo.kaotus();

            mängib = JOptionPane.showInputDialog(null, "Kas soovid edasi mängida? ", "jah/ei").equals("jah");
        }
        JOptionPane.showMessageDialog(null, "Lahkusid kasiinost, taskus: " + saldo.getsaldoJääk() + "€");

    }
}
