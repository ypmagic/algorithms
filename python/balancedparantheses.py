# implements a stack based on python's list

class Stack:
    def __init__ (self):
        self.items = []

    def isEmpty (self):
        return self.items == []

    def push (self, item):
        self.items.append(item)

    def pop (self):
        return self.items.pop()

    def peek (self):
        return self.items[len(self.items)-1]

    def size(self):
        return len(self.items)

#balancedParan function

def balancedParan(str):
    parantheses = Stack()
    balanced = True
    strList = list(str)
    for single in strList:
        if single == "(":
            parantheses.push("(")
        elif single == ")" and not parantheses.isEmpty():
            parantheses.pop()
        elif single == ")" and parantheses.isEmpty():
            balanced = False
    return balanced

print(balancedParan("(()()()())")) #should return True
print(balancedParan("())()()")) #should return False
