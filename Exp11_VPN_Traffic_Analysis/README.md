# Experiment 11: Encrypted VPN vs Unencrypted HTTP Traffic

## 1. Objective
To capture and analyze encrypted VPN traffic using Wireshark, and compare it with unencrypted network communication.

## 2. Software Required
- Wireshark
- VPN Client & Web Browser

## 3. Procedure
1. Start packet capture in Wireshark with VPN disabled and access an unencrypted HTTP website (`http://neverssl.com`).
2. Inspect HTTP packets to observe readable plaintext headers, URLs, and payload data.
3. Enable the VPN connection, repeat the packet capture, and analyze the encapsulated, encrypted tunnel traffic.

## 4. Conclusion
A VPN protects confidentiality and privacy on untrusted networks by encapsulating and encrypting IP packets inside a secure cryptographic tunnel.
