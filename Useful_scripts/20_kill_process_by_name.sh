#!/bin/bash
read -p "Enter process name: " pname
pkill -f "$pname"
echo "Killed all processes matching: $pname"
