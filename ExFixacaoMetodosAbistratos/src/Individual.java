public class  Individual extends TaxPayer {
    private Double healthExpendiures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpendiures) {
        super(name, anualIncome);
        this.healthExpendiures = healthExpendiures;
    }

    public Double getHealthExpendiures() {
        return healthExpendiures;
    }

    public void setHealthExpendiures(Double healthExpendiures) {
        this.healthExpendiures = healthExpendiures;
    }

    @Override
    public double tax() {
        double basicTax;
         if(getAnualIncome() < 20000.00) {
            basicTax = getAnualIncome() * 0.15;
         } else {
             basicTax = getAnualIncome() * 0.25;
         }
         basicTax -= getHealthExpendiures() * 0.5;
         if (basicTax < 0.0) {
             basicTax = 0.0;
         }
        return basicTax;
    }
}
