# 3670FinalProject
The final project is regarding Blockchain and BaaS. The code are representation of a what Blockchain data structure is and how some are better over the others.

## Blockchain Implementation
As previously discussed, BaaS gives businesses cloud-based resources to develop, host, and adapt their own blockchain applications [1]. Blockchain is a series of blocks containing information provided, which contains the hash number of the current owner and the hash number of the previous owner [2]. Blockchain is its own special type of data structure, defined as a chain of blocks where each block consists of a list of transactions and linked together by a hash pointer.

![Figure1](https://user-images.githubusercontent.com/13652093/102951911-f53d7f80-449b-11eb-8f13-aad00d868e01.png)

Figure 1 shows a diagram representing a basic blockchain. Each block in the chain contains the following properties: Owner’s Public Key
  * An Index
  * A Timestamp
  * A Previous Hash
  * A Current Hash
  * Private Key 
  * Data (monetary amount)
  
Every blockchain begins with a genesis block, one that has no previous blocks and does not contain any data. To carry out a transaction between two different users, a public key and private key are required by both users. The public key is an address consisting of numbers and letters, and the private key is the digital signature from both users allowing for the transaction to take place.
When it comes to the structure of blockchain and its method of storing transaction records, a study of the differences between data structures could be tested. In the following descriptions, the structure of blockchain is compared when implemented using a Linked List, Binary Search Tree, and Hash Table. 

### Linked List
A Linked List data structure allows a user to insert or delete data items anywhere in the list without having to shift the entire list [3]. Given that blockchain is immutable, a user cannot change the order of transactions in a given blockchain. So, neither the deletion property nor the insertion between two blocks property is used in a blockchain. However, a property used in blockchain from the singly-linked list data structure is the backward linking of each block. Each block has a pointer referring to the previous block’s hash. This keeps track of the previous and current owners of a given monetary amount. 

![Figure 2](https://user-images.githubusercontent.com/13652093/102952109-5c5b3400-449c-11eb-8769-1432987feb59.png)

Figure 2 shows a diagram explaining blockchain when implemented as a singly linked list. Each block saves the information discussed in Figure 2, such as the timestamp of the transaction, the index, monetary data, etc. An owner’s hash is what connects it to the following block, allowing the chain to keep track of the change in users after each transaction. 

By implementing the blockchain through a singly linked list data structure, differences between the two can be observed. In the context of Blockchain, a user cannot be able to a) alter the order at which transactions take place, b) delete any given transaction, and c) perform a transaction between two previously executed transactions. Given these restrictions, a simple linked list was implemented and can be accessed through the GitHub link provided at the beginning of this paper.

### Binary Search Tree
A binary search tree is a data structure that is composed of internal nodes, each of which store a key greater than all the keys in a node's left subtree and less than those in its right subtree [8]. 

By implementing the blockchain through a binary search tree, many inconsistencies were found between the two structures. Through a tree, the data shown in Figure 1 cannot be saved. However, throughout the research of this project, functionality for the binary search tree was found to be useful when implementing a Blockchain. 

![Figure3](https://user-images.githubusercontent.com/13652093/102952258-c5db4280-449c-11eb-8d3d-46cca0f28553.png)

As shown in Figure 3, a tree summarizes the transactions in a block by saving the entire set of transactions, enabling a user to verify whether or not a transaction is included in any given block. It is constructed from the bottom up, composed of hashes from each transaction in a chain. This given tree would be created by repeatedly hashing pairs of nodes until only the root hash is remaining.  Each leaf node represents a transaction, and each non-leaf is a hash of its previous hash. 

### Hash Tables
Blockchain technology extensively depends on the hash functions that take any string and return an owner’s hash [9]. A hash table data structure implements an array that can map keys to values [10]. It uses a hash function to compute an index into an array from which the desired value can be found.
To create a functional Blockchain through the hash table data structure, the blocks in the chain can not be altered, as this will change the order of transactions carried out between two owners. Blocks can only be added at the tail of the Blockchain. 

![Figure 4](https://user-images.githubusercontent.com/13652093/102952488-4437e480-449d-11eb-9bba-0d2e491eaf87.png)

Figure 4 shows how information is stored in a hash table. The hash of the previous block links to the following block, and the latest block hash tracks the latest block. To add a new transaction (block) to the given hash table, the hash value of the previous block is added to the following block. Next, the transaction data is inserted in the block. 

Finally, the hash value of the transaction is calculated and the latest block hash is updated. 
In a blockchain, each block stores all the data in the nodes. However, in a hash table, the data is divided among each node. Every new entry in the blockchain must be validated through a mining process to compute an index into an array of slots. Given that blockchain is a digital ledger, transactions are recorded chronologically. For this reason, a hash table would not be useful in tracking transactions or blocks in a given chain. An implementation of a hash table can be accessed through the GitHub link provided at the beginning of this paper. It shows how the hash table data structure is not efficient in Blockchain implementation.

## Implementation Output
Below are the output from the different data structures that were implemented as part of this experiment.

### Linked List
![Linked List implementation](https://user-images.githubusercontent.com/13652093/102952677-abee2f80-449d-11eb-8509-291083df98bc.png)

Here you can see how the output can represent the diagram from up above of linked list. Each new block has the hash of the previous one and each block has the respective data and the time it was made it in.

### Binary Search Tree
![BST implementation](https://user-images.githubusercontent.com/13652093/102952798-f7a0d900-449d-11eb-8bd7-8640fb7214bc.png)

Here is a simple output of the Binary Search Tree implementation

### Hash table
![Hash table implementation](https://user-images.githubusercontent.com/13652093/102952904-35056680-449e-11eb-82dc-33e1a07f323b.png)

Here is a simple output of the Hash table implementation. In which you can see how the next block is not aware of the the previous block and thus not really making it a "Blockchain".
