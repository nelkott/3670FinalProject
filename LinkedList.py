from datetime import datetime

class Node:
    def __init__(self, data, owner = None):
        self.data = data
        self.currowner = owner
        self.time = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
        self.pre = None
        self.next = None
        
    def __repr__(self) -> str:
        return "Amount: " + self.data + " Owner: " + self.currowner +  " Time bought: " +  self.time

class LinkedList:
    def __init__(self, values=None):
        self.head = None
        
    def __repr__(self) -> str:
        node = self.head
        nodes = []
        while node is not None:
            nodes.append(node.data)
            node = node.next
        nodes.append("None")
        return "->".join(nodes)
    
    def __iter__(self) -> object:
        node = self.head
        while node is not None:
            yield node
            node = node.next
            
    def addLast(self, data: str, owner: str) -> None:
        node = Node(data = data, owner = owner)
        if not self.head:
            self.head = node
            return
        for curr in self:
            pass
        curr.next = node
    
blockchain = LinkedList()


for i in range(2):
    name = input("Enter your name: ")
    amount = input("Enter the amount: ")
    blockchain.addLast(data=amount,owner=name)
for node in blockchain:
    print(node, end="->")
print(None)