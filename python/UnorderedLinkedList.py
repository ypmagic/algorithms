class Node:
    def __init__ (self, item):
        self.data = item
        self.next = None

    def getData (self):
        return self.data

    def getNext (self):
        return self.next

    def setData (self, newData):
        self.data = newData

    def setNext (self, newNext):
        self.next = newNext

class UnorderedLinkedList:
    def __init__ (self):
        self.head = None

    def __str__ (self):
        curr = self.head
        str = "[" + self.head.getData()
        while curr.getNext() != None:
            str = str + ", " + curr.getData()
        str = str + curr.getData() + "]"
        return str

    def isEmpty (self):
        return self.head == None

    # in an unordered linked list, the new item is added as the head
    def add (self, item):
        newNode = Node(item)
        newNode.setNext(self.head)
        self.head = newNode

    def length (self):
        count = 0
        trigger = True
        pointer = self.head
        while trigger:
            if pointer == None:
                trigger = False
            else:
                count = count + 1
                pointer = pointer.getNext()
        return count

    def search (self, item):
        pointer = self.head
        found = False
        while pointer != None and not found:
            if pointer.getData() == item:
                found = True
            else:
                pointer = pointer.getNext()
        return found

    def remove (self, item):
        prev = None
        curr = self.head
        found = False
        while not found:
            if curr.getData() == item:
                found = True
            else:
                prev = curr
                curr =curr.getNext()
        if prev == None:
            self.head = self.head.getNext()
        else:
            prev.setNext(curr.getNext())

    def append (self, item):
        found = False
        curr = self.head
        while not found:
            if curr.getNext() == None:
                found = True
            else:
                curr = curr.getNext()
        curr.setNext(item)

    def index (self, item):
        index = 0
        found = False
        curr = self.head
        while not found:
            if curr.getData() == item:
                found = True
            else:
                curr = curr.getNext()
                index = index + 1
        return index

    def insert (self, pos, item):
        currIndex = 0
        prev = None
        curr = self.head
        while currIndex != pos:
            prev = curr
            curr = curr.getNext()
            currIndex = currIndex + 1
        if prev == None:
            temp = Node(item)
            temp.setNext(curr)
            self.head = temp
        else:
            temp = Node(item)
            prev.setNExt(temp)
            temp.setNext(curr)
