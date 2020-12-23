# 3670FinalProject
The final project is regarding Blockchain and BaaS. The code are representation of a what Blockchain data structure is and how some are better over the others.

## Blockchain Implementation
As previously discussed, BaaS gives businesses cloud-based resources to develop, host, and adapt their own blockchain applications [1]. Blockchain is a series of blocks containing information provided, which contains the hash number of the current owner and the hash number of the previous owner [2]. Blockchain is its own special type of data structure, defined as a chain of blocks where each block consists of a list of transactions and linked together by a hash pointer.

Figure 1 shows a diagram representing a basic blockchain. Each block in the chain contains the following properties: Owner’s Public Key
- An Index
- A Timestamp
- A Previous Hash
- A Current Hash
- Private Key 
- Data (monetary amount)
Every blockchain begins with a genesis block, one that has no previous blocks and does not contain any data. To carry out a transaction between two different users, a public key and private key are required by both users. The public key is an address consisting of numbers and letters, and the private key is the digital signature from both users allowing for the transaction to take place.
When it comes to the structure of blockchain and its method of storing transaction records, a study of the differences between data structures could be tested. In the following descriptions, the structure of blockchain is compared when implemented using a Linked List, Binary Search Tree, and Hash Table. 
