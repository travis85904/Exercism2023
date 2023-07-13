export function totalBirdCount(birdsPerDay) {
    // let count = 0;
    // for (let dayCount of birdsPerDay) {
    //     count += dayCount;
    // }
    // return count;

    return birdsPerDay.reduce((total, current) => total + current);
}

export function birdsInWeek(birdsPerDay, week) {
    let count = 0;
    for (let i = (week * 7) - 7; i < week * 7; i++) {
        count += birdsPerDay[i];
    }
    return count;
}

export function fixBirdCountLog(birdsPerDay) {
    for (let i = 0; i < birdsPerDay.length; i += 2) {
        birdsPerDay[i] += 1;
    }
    return birdsPerDay;
}
