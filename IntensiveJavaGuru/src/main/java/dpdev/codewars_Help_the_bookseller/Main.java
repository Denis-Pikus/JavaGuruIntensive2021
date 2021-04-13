package dpdev.codewars_Help_the_bookseller;

public class Main {
    public static void main(String[] args) {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String letters[] = new String[]{"A", "C", "B", "D"};

        System.out.println(StockList.stockSummary(art, letters));
    }
}
