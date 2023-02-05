package academy.learnprogramming;

public class Printer {
    private int tonerLevel, pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount <= 0 || tonerAmount > 100 || (tonerLevel + tonerAmount) > 100){
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            System.out.println("Printing in duplex mode");
            pagesToPrint = pagesToPrint % 2 + pagesToPrint/2;
            pagesPrinted += pagesToPrint;
        }else{
            pagesPrinted += pagesToPrint;
        }
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
