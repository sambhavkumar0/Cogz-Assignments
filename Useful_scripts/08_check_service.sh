#!/bin/bash
SERVICE="apache2"
if systemctl is-active --quiet "$SERVICE"; then
    echo "$SERVICE is running."
else
    echo "$SERVICE is NOT running."
    sudo systemctl start "$SERVICE"
fi
