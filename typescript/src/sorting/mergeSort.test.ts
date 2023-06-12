import { mergeSort } from "./mergeSort"

describe("testing mergeSort", () => {

    let input = [12, 222, 15, 76, 43, 500, 23, 8, 65, 32, 69, 420, 344, 6754]
    let expected = [8, 12, 15, 23, 32, 43, 65, 69, 76, 222, 344, 420, 500, 6754]
    test("returned array should be sorted", () => {
        mergeSort(input);
        expect(input).toStrictEqual(expected);
    })
})
