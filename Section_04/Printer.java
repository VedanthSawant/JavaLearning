package Section_04;

public class Printer {
	
	private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100) {
            return -1;
        }

        if (tonerLevel < 0) { // invalid current level
            return -1;
        }

        int newLevel = this.tonerLevel + tonerAmount;
        if (newLevel > 100) {
            return -1;
        }

        this.tonerLevel = newLevel;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pages / 2) + (pages % 2);
        }

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}

