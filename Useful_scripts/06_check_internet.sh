#!/bin/bash
ping -c 2 8.8.8.8 &> /dev/null
if [ $? -eq 0 ]; then
    echo "Internet is connected."
else
    echo "No internet connection."
fi
