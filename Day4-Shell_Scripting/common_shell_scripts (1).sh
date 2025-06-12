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


# 13. Check Internet Connection
if ping -q -c 1 -W 1 google.com >/dev/null; then
    echo "Internet is up."
else
    echo "Internet is down."
fi

# 14. Countdown Timer (10 seconds)
echo "Countdown:"
for i in {10..1}; do
    echo "$i"
    sleep 1
done
echo "Time's up!"

# 15. Create a Directory if It Doesn't Exist
dir="myfolder"
if [ ! -d "$dir" ]; then
    mkdir "$dir"
    echo "Directory '$dir' created."
else
    echo "Directory '$dir' already exists."
fi

# 16. Check if a File Exists
file="test.txt"
if [ -f "$file" ]; then
    echo "File '$file' exists."
else
    echo "File '$file' does not exist."
fi

# 17. Read a File Line by Line
input="file.txt"
while IFS= read -r line; do
    echo "$line"
done < "$input"

# 18. Create a Simple Log File
log_file="log.txt"
echo "Log started at $(date)" >> "$log_file"
echo "Some log data..." >> "$log_file"

# 19. Show Number of Users Logged In
who | wc -l

# 20. Generate a Random Password
tr -dc A-Za-z0-9 </dev/urandom | head -c 12; echo

# 21. Simple Calculator
read -p "Enter first number: " a
read -p "Enter second number: " b
read -p "Enter operation (+ - * /): " op
echo "Result: $(echo "$a $op $b" | bc)"

# 22. Display Current Date and Time Every 5 Seconds (for 5 times)
for i in {1..5}; do
    date
    sleep 5
done
