# Deque data structure implementation
class Deque:
    def __init__ (self):
        self.items = []

    def isEmpty (self):
        return self.items == []

    def size (self):
        return len(self.items)

    def addFront (self, item):
        self.items.append(item)

    def addRear (self, item):
        self.items.insert(0, item)

    def removeFront (self):
        return self.items.pop()

    def removeRear (self):
        return self.items.pop(0)

#checks if the given string is a palindrome
def palindromeCheck (palindrome):
    checkPal = Deque()
    palList = list(palindrome)
    # add everything to the deque
    for char in palList:
        checkPal.addRear(char)
    while not checkPal.isEmpty():
        first = checkPal.removeFront()
        last = checkPal.removeRear()
        if (first != last):
            return False
    return True

#test
print(palindromeCheck("hannah")) #returns True
print(palindromeCheck("rocket")) #returns False
print(palindromeCheck("toot")) #returns True
