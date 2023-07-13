export function needsLicense(kind) {
    return kind === 'car' || kind === 'truck';
}

export function chooseVehicle(option1, option2) {
    if (option1 > option2)
        return option2 + " is clearly the better choice.";
    return option1 + " is clearly the better choice.";
}

export function calculateResellPrice(originalPrice, age) {
    if (age < 3)
        return originalPrice * .8;
    if (age <= 10)
        return originalPrice * .7;
    return originalPrice * .5;

}