# Experiment 4: RSA Key Generation and File Encryption

## 1. Objective
To generate RSA public and private key pairs and perform secure file encryption and decryption using OpenSSL.

## 2. Software Required
- OpenSSL (Command Line)
- Windows Command Prompt (CMD)

## 3. Commands Executed
```cmd
# 1. Generate 2048-bit RSA Private Key
openssl genpkey -algorithm RSA -out private.pem -pkeyopt rsa_keygen_bits:2048

# 2. Extract Public Key from Private Key
openssl pkey -in private.pem -pubout -out public.pem

# 3. Create Sample Plaintext File
echo Confidential Cryptography Lab Message > message.txt

# 4. Encrypt File using Public Key
openssl pkeyutl -encrypt -pubin -inkey public.pem -in message.txt -out encrypted.bin

# 5. Decrypt File using Private Key
openssl pkeyutl -decrypt -inkey private.pem -in encrypted.bin -out decrypted.txt

# 6. Verify Original and Decrypted Files Match
fc /b message.txt decrypted.txt
