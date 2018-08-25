def linearSearch (alist, item):
    pos = 0
    found = False
    while pos < len(alist) and not found:
        if alist[pos] == item:
            found = True
        else:
            pos += 1
    return found

def binarySearch (alist, item):
    if len(alist) == 0:
        return False
    else:
        mid = len(alist) // 2
        if alist[mid] == item:
            return True
        elif alist[mid] > item:
            return binarySearch(alist[:mid], item)
        elif alist[mid] < item:
            return binarySearch(alist[mid+1:], item)
