export function merge(arr: number[], l: number, m: number, r: number): void{
    let sizeLeft = m - l + 1;
    let sizeRight = r - m;

    let left: number[] = new Array(sizeLeft);
    let right: number[] = new Array(sizeRight);

    for (let i = 0; i < sizeLeft; i++) {
        left[i] = arr[l + i]
        
    }
    for (let j = 0; j < sizeRight; j++) {
        right[j] = arr[m + j + 1];
    }

    let i = 0, j = 0;
    let k = l;

    while (i < sizeLeft && j < sizeRight) {
        if (left[i] < right[j]) {
            arr[k] = left[i];
            i++;
        } else {
            arr[k] = right[j];
            j++;
        }
        k++;
    }

    while (i < sizeLeft) {
        arr[k] = left[i];
        i++;
        k++
    }
    while (j < sizeRight) {
        arr[k] = right[j];
        j++;
        k++;
    }
}

export function sort(arr: number[], l: number, r: number): void{
    if (l < r) {
        let middle = l + Math.floor((r-l)/2);

        sort(arr, l, middle);
        sort(arr, middle + 1, r);

        merge(arr, l, middle, r);
    }
}

export function mergeSort(arr: number[]): void{
    sort(arr,0,arr.length-1);
}
