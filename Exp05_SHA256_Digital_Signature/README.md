# Experiment 5: SHA-256 Hashing and Digital Signatures

## 1. Objective
To generate SHA-256 hash values, create digital signatures, and verify their authenticity using OpenSSL.

## 2. Software Required
- OpenSSL (Command Line)
- Windows Command Prompt (CMD)

## 3. Commands Executed
```cmd
openssl dgst -sha256 message.txt
openssl dgst -sha256 -sign private.pem -out signature.bin message.txt
openssl dgst -sha256 -verify public.pem -signature signature.bin message.txt
4. Conclusion
SHA-256 hashing combined with RSA digital signatures guarantees data integrity, authentication, and non-repudiation.
