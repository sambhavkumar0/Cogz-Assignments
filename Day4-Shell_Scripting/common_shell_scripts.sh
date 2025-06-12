#!/bin/bash

# 1. Hello World
echo "Hello, World!"

# 2. File Backup Script
src_dir="/home/user/documents"
backup_dir="/home/user/backup"
cp -r "$src_dir" "$backup_dir"
echo "Backup completed!"

# 3. Disk Usage Checker
df -h | grep "^/dev/"

# 4. Find and Delete Old Files (older than 7 days)
find /path/to/folder -type f -mtime +7 -exec rm {} \;
echo "Old files deleted."

# 5. CPU & Memory Usage Monitor
echo "CPU Usage:"
top -bn1 | grep "Cpu(s)"
echo "Memory Usage:"
free -h

# 6. User Login Tracker
last -a | head -n 10

# 7. Ping a Website
ping -c 4 google.com

# 8. Check If a Service is Running
if systemctl is-active --quiet apache2; then
    echo "Apache is running."
else
    echo "Apache is not running."
fi

# 9. Rename Files in Bulk
for file in *.txt; do
    mv "$file" "${file%.txt}.bak"
done

# 10. Count Lines, Words, and Characters in a File
filename="file.txt"
wc "$filename"

# 11. Loop Over Arguments
for arg in "$@"; do
    echo "Argument: $arg"
done

# 12. Simple Menu with select
echo "Choose an option:"
select choice in "Show Date" "List Files" "Exit"; do
    case $choice in
        "Show Date") date ;;
        "List Files") ls ;;
        "Exit") break ;;
        *) echo "Invalid option";;
    esac
done
