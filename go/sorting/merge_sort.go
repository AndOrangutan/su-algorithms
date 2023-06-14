package sorting

func merge(arr []int, l int, m int, r int) {
    sizeLeft := m - l + 1;
    sizeRight := r - m;

    left := [14]int{};
    right := [14]int{};

    for i := 0; i < sizeLeft; i++ {
        left[i] = arr[l+i];
    }
    for j := 0; j < sizeRight; j++ {
        right[j] = arr[m+j+1];
    }

    i, j := 0, 0;
    k := l;

    for i < sizeLeft && j < sizeRight {
        if left[i] <= right[j] {
            arr[k] = left[i];
            i++;
        } else {
            arr[k] = right[j];
            j++;
        }
        k++
    }

    for i < sizeLeft {
        arr[k] = left[i];
        i++;
    }
    for i < sizeLeft {
        arr[k] = right[j];
        j++;
    }
}

func sort(arr []int, l int, r int) {
    if l < r {
        middle := l + (r - l) / 2;
        sort(arr, l, middle);
        sort(arr, middle + 1, r);

        merge(arr, l, middle, r);
    }
}

func MergeSort(arr []int, size int)  {
    sort(arr, 0, size-1);
}
