# Experiment 12: Secure vs Insecure Network Protocols Analysis

## 1. Objective
To analyze captured network packets in Wireshark to identify secure and insecure communication protocols and their security implications.

## 2. Software Required
- Wireshark
- Web Browser & Command Prompt

## 3. Procedure
1. Capture live network traffic in Wireshark across HTTP, DNS, and HTTPS sessions.
2. Apply display filters (`http`, `dns`, and `tls`) to separate plaintext and encrypted protocols.
3. Compare readable plaintext payloads (credentials, URLs, queries) in HTTP/DNS against encrypted application data in HTTPS/TLS.

## 4. Conclusion
Insecure protocols transmit sensitive payloads in plaintext vulnerable to packet sniffing, whereas secure protocols enforce encryption, authentication, and integrity.
