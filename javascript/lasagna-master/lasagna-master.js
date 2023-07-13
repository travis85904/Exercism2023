export function cookingStatus(remainingTime) {
    if (isNaN(remainingTime))
        return 'You forgot to set the timer.'
    return remainingTime === 0 ? 'Lasagna is done.' : 'Not done, please wait.'
}

export function preparationTime(layers, timePerLayer) {
    return !isNaN(timePerLayer) ? layers.length * timePerLayer : layers.length * 2
}

export function quantities(layers) {
    let noodles = 0
    let sauce = 0
    for (const layer of layers) {
        if (layer === 'sauce')
            sauce += 0.2
        else if (layer === 'noodles')
            noodles += 50
    }
    return {noodles: noodles, sauce: sauce}
}

export function addSecretIngredient(friendsList, myList) {
    myList[myList.length] = friendsList[friendsList.length - 1]
}

export function scaleRecipe(recipe, portions) {
    portions /= 2
    let newRecipe = structuredClone(recipe)

    Object.keys(newRecipe).forEach(function (key) {
        newRecipe[key] *= portions
    })

    return newRecipe
}