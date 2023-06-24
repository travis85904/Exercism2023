export function dayRate(ratePerHour) {
    return 8 * ratePerHour;
}

export function daysInBudget(budget, ratePerHour) {
    return Math.floor(budget / dayRate(ratePerHour));
}

export function priceWithMonthlyDiscount(ratePerHour, numDays, discount) {
    let months = Math.floor(numDays / 22);
    let pricePerMonth = dayRate(ratePerHour) * 22;
    pricePerMonth -= pricePerMonth * discount;

    return Math.ceil((pricePerMonth * months) + (numDays % 22 * dayRate(ratePerHour)));
}
