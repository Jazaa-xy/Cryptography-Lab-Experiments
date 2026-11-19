# Experiment 6: Self-Signed X.509 Digital Certificate

## 1. Objective
To create a self-signed X.509 digital certificate and analyze its attributes, validity, and security features using OpenSSL.

## 2. Software Required
- OpenSSL (Command Line)
- Windows Command Prompt (CMD)

## 3. Commands Executed
```cmd
openssl genrsa -out cert_private.pem 2048
openssl req -new -x509 -key cert_private.pem -out certificate.pem -days 365 -sha256 -subj "/C=IN/ST=Madhya Pradesh/L=Gwalior/O=ITM University/OU=CSE-AIML/CN=localhost"
openssl x509 -in certificate.pem -text -noout
openssl verify -CAfile certificate.pem certificate.pem
4. Conclusion
X.509 digital certificates bind a public key to an entity's identity and establish trust in secure network communication.
