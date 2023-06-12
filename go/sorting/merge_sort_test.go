package sorting

import (
	"go/array"
	"testing"
)

func TestMergeSort(t *testing.T) {
    input := []int{ 12, 222, 15, 76, 43, 500, 23, 8, 65, 32, 69, 420, 344, 6754 };
    expected := []int{ 8, 12, 15, 23, 32, 43, 65, 69, 76, 222, 344, 420, 500, 6754 };

    MergeSort(input, 14);

    if array.IsSorted(input, 14) {
        t.Errorf("MergeSort() FAILED. Expected %s, got %s\n", array.ToString(expected, 14), array.ToString(input,14))
    } else {
        t.Errorf("MergeSort() PASSED. Expected %s, got %s\n", array.ToString(expected, 14), array.ToString(input,14))
    }
}
