# Experiment 10: HTTPS Traffic & TLS Handshake Analysis

## 1. Objective
To capture HTTPS network traffic using Wireshark and analyze the TLS handshake, digital certificates, and cipher suites.

## 2. Software Required
- Wireshark
- Web Browser (Chrome/Edge)

## 3. Procedure
1. Start packet capture in Wireshark on the active Wi-Fi/Ethernet interface and visit an HTTPS website.
2. Apply display filters (`tls` and `tls.handshake`) to isolate TLS negotiation packets.
3. Inspect the **Client Hello** (supported TLS versions and cipher suites), **Server Hello** (selected cipher suite), and **Certificate** (X.509 certificate chain and issuer details).

## 4. Conclusion
TLS secures web communication by authenticating the server via X.509 digital certificates and negotiating a symmetric session key during the handshake.
