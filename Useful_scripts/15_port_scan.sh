#!/bin/bash
read -p "Enter host to scan: " host
nmap -Pn "$host"
