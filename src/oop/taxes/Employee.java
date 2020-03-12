package oop.taxes;

public class Employee extends TaxPayer{

    public Employee(TaxPayer strategy) {
        super(strategy);
    }

    public boolean isMarried(){

        return true;
    }

    public Gender getGender(){

        return null;
    }


}
