def reverseList (list, new):
    if list == []:
        return new
    else:
        new = new + [list.pop()]
        reverseList(list, new)

print(reverseList([1, 2, 3, 4, 5], []))

# why isn't this working idk
