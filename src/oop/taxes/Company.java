package oop.taxes;

public class Company extends TaxPayer{

    public Company(TaxPayer strategy) {
        super(strategy);
    }

    public int getNumberOfEmployees(){

        return 0;
    }
}
