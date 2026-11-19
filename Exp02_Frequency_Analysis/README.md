# Experiment 2: Frequency Analysis and Cryptanalysis

## 1. Objective
To perform frequency analysis on classical cipher texts and analyze their vulnerability to cryptanalysis attacks using CrypTool.

## 2. Software Required
- CrypTool 2.1
- Windows 10/11

## 3. Procedure
1. Open CrypTool 2.1 and create a new workspace.
2. Encrypt sample English plaintext using the **Caesar Cipher** component (`Shift = 3`).
3. Connect the generated ciphertext to the **Frequency Test** component to observe letter distribution.
4. Compare the highest-occurring ciphertext letters with standard English letter frequencies (`E`, `T`, `A`, `O`, `I`, `N`) to deduce the shift key and recover the original plaintext.

## 4. Conclusion
Classical substitution ciphers preserve letter frequency patterns, making them vulnerable to statistical frequency analysis attacks.
