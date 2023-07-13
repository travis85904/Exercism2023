public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped <= 5 ? 1d : .85d;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold <= 20 ? 10 : 13;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double bonus = bonusForProductSold(productsSold);
        double base = multiplierPerDaysSkipped(daysSkipped) * 1000;
        double salary = base + bonus;
        return salary <= 2000 ? salary : 2000;
    }
}
