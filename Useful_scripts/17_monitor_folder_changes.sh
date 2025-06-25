#!/bin/bash
read -p "Enter folder to monitor: " folder
inotifywait -m -e create -e modify -e delete "$folder"
