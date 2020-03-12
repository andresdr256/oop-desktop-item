package oop.taxes;

public class Trust extends TaxPayer{

    public Trust(TaxPayer strategy) {
        super(strategy);
    }

    public boolean isNonProfit(){

        return true;
    }
}
