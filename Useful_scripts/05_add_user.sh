#!/bin/bash
read -p "Enter username: " username
sudo useradd -m "$username"
sudo passwd "$username"
echo "User $username created."
