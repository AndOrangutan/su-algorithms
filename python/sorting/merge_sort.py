
def merge_sort(arr: list[int]):
    if len(arr) > 1:
        mid = len(arr)//2

        left = arr[:mid]
        right = arr[mid:]

        merge_sort(left)
        merge_sort(right)

        i = j = k = 0

        while i < len(left) and j < len(right):
            if left[i] <= right[j]:
                arr[k] = left[i]
                i += 1
            else:
                arr[k] = right[j]
                j += 1

            k += 1
        

        while i < len(left):
            arr[k] = left[i];
            i += 1
            k += 1

        while j < len(right):
            arr[k] = right[j]
            j += 1
            k += 1


def test_merge_sort():
    input = [12, 222, 15, 76, 43, 500, 23, 8, 65, 32, 69, 420, 344, 6754]
    expected = [8, 12, 15, 23, 32, 43, 65, 69, 76, 222, 344, 420, 500, 6754]

    merge_sort(input)

    assert input == expected, "List unsorted"

