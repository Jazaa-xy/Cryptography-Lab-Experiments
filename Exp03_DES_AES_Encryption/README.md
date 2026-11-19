# Experiment 3: DES and AES Symmetric Encryption

## 1. Objective
To encrypt sample data using DES and AES algorithms, and compare their security features and performance using CrypTool.

## 2. Software Required
- CrypTool 2.1
- Windows 10/11

## 3. Procedure
1. Open CrypTool 2.1 and create a new workspace.
2. Add **Text Input**, **DES** (56-bit key, 64-bit block), and **Text Output** components to encrypt and decrypt sample plaintext (`HELLO BTECH STUDENTS`).
3. Repeat the encryption and decryption process using the **AES** component (128-bit key, 128-bit block).
4. Compare DES and AES in terms of key length, block size, processing speed, and resistance against brute-force attacks.

## 4. Conclusion
AES offers significantly stronger security and faster performance than DES due to its larger key size (128/192/256 bits) and 128-bit block architecture, making DES obsolete for modern applications.
