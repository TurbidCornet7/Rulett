import javax.swing.*;

public class Saldo {
    private double saldoJääk;
    private double panus;

    public Saldo(double saldoJääk) {
        this.saldoJääk = saldoJääk;
    }

    public double getsaldoJääk() {
        return saldoJääk;
    }

    public void setsaldoJääk(double saldoJääk) {
        this.saldoJääk = saldoJääk;
    }

    public void setPanus(double panus) {
        if (panus > saldoJääk) {
            //kui panus ületab saldojääki, siis mängid 0 euroga
            this.panus = 0.0;
            JOptionPane.showMessageDialog(null, "Panus ületab su võimeid, mängid 0 euroga");
        } else {
            this.panus = panus;
            saldoJääk -= panus;
        }



    }

    public void kaotus() {
        JOptionPane.showMessageDialog(null, "Kaotasid panuse");
        setPanus(0.0);
        //kaotuse puhul kaotad panuse

    }

    public void voit() {
        JOptionPane.showMessageDialog(null, "Võitsid: " + panus * 35 + " eurot");
        saldoJääk += panus * 35;
        //võidu puhul saad 35 kordselt panustatud raha tagasi
        setPanus(0.0);
    }


}
