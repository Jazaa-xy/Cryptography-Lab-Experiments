# Experiment 13: Secure Wireless Network Design using WPA2-AES

## 1. Objective
To design and implement a secure wireless network using WPA2 encryption (AES) in Cisco Packet Tracer, and verify secure communication.

## 2. Software Required
- Cisco Packet Tracer

## 3. Procedure
1. Place a **Wireless Router** (`WRT300N`) and two wireless client **Laptops** in the Cisco Packet Tracer workspace.
2. Configure the router's LAN IP (`192.168.0.1`), enable DHCP, set a custom wireless **SSID**, and enable **WPA2-Personal (PSK)** with **AES** encryption.
3. Replace each laptop's wired Ethernet module with a wireless module (`WPC300N`) and connect using the configured SSID and WPA2 passphrase.
4. Verify end-to-end connectivity and secure communication using `ping 192.168.0.1` from the laptop Command Prompt.

## 4. Conclusion
WPA2-PSK with AES encryption protects wireless LAN traffic against eavesdropping and unauthorized access by enforcing strong authentication and per-packet encryption.
