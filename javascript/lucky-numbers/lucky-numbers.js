// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
    let sb1 = '';
    let sb2 = '';
    for (const array1Key of array1) {
        sb1 += array1Key;
    }
    for (const array2Key of array2) {
        sb2 += array2Key;
    }
    return Number.parseInt(sb1) + Number.parseInt(sb2);
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean} whether the number is a palindrome or not
 */
export function luckyNumber(value) {
    let sb = '';

    for (let i = value.toString().length - 1; i > -1; i--) {
        sb += value.toString().charAt(i);
    }

    return sb === value.toString();
}

/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {
    if (input === undefined || input === null || input === '')
        return 'Required field';
    return input === "0" || isNaN(input) ? 'Must be a number besides 0' : '';
}
