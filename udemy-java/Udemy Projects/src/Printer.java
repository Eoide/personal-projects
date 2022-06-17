public class Printer {
    private int toner = 100 ;
    private int totalPages = 0;
    private boolean isDuplex;

    public Printer( boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    public void fillToner(int fillUp) {
        System.out.println("Toner being filled up...");
        if(fillUp>100) {
            this.toner = 100;
        }
        else {
            if(this.toner + fillUp>100) this.toner=100;
            else this.toner += fillUp;
        }
        System.out.println("Toner filled up to " + this.toner + "%");
    }

    public void printPage(int amount) {
        if(isDuplex) amount *= 2;
        if (!(toner - amount < 0)) { //if pagesToPrint doesn't empty the toner
            this.totalPages += amount;
            this.toner -= amount;
            System.out.println(totalPages + " printed in total");
            System.out.println(toner + "% of toner remaining");
        }
    }

    public int getToner() {
        return toner;
    }

    public int getNumberPagesPrinted() {
        return totalPages;
    }
}
