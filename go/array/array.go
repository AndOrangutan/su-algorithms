package array

import "fmt"

func IsSorted(arr []int, size int) bool {
    for i := 1; i < size; i++ {
        if arr[i-1] > arr[1]{
            return false;
        }
    }
    return true;
}

func ToString(arr []int, size int) string {
    str := "";

    str += fmt.Sprintf("[%d",arr[0]);

    for i := 1; i < size; i++ {
        str += fmt.Sprintf(", %d", arr[i])
    }
    
    str += "]";
    return str;
}
