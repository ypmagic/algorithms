def mergeSort (alist):
    if len(alist) > 1:
        mid = len(alist) // 2
        left = alist[:mid]
        right = alist[mid:]

        mergeSort(left)
        mergeSort(right)

        i = 0 # left index
        j = 0 # right index
        k = 0 # list index

        # comparing items in left and right to each other
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                alist[k] = left[i]
                i += 1
            elif right[j] < left[i]:
                alist[k] = right[j]
                j += 1
            k += 1

        # adding the last items in left and right to list
        while i < len(left):
            alist[k] = left[i]
            i += 1
            k += 1

        while j < len(right):
            alist[k] = right[j]
            j += 1
            k += 1

        return alist

somelist = [23, 1, 40, 14, 34, 56, 2, 33, 6, 10]
print(str(mergeSort(somelist)))
