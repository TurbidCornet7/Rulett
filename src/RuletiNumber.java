public class RuletiNumber {
    private final int numbriVäärtus;
    private final char värv;

    public RuletiNumber(int numbriVäärtus, char värv) {
        this.numbriVäärtus = numbriVäärtus;
        this.värv = värv;
    }

    @Override

    public String toString() {
        // Väljastab numbri vastava värviga
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String tekstiVärvus = switch (värv) {
            case 'r' -> ANSI_GREEN;
            case 'p' -> ANSI_RED;
            case 'm' -> ANSI_BLACK;
            default -> "";
        };
        return tekstiVärvus + "[" + numbriVäärtus + "]" + ANSI_RESET;
    }

    public int getNumbriVäärtus() {
        return numbriVäärtus;
    }

    public char getVärv() {
        return värv;
    }
}
