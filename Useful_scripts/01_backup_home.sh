#!/bin/bash
BACKUP_DIR="/backup"
SRC_DIR="/home"
DATE=$(date +%F_%T)
mkdir -p "$BACKUP_DIR"
tar -czf "$BACKUP_DIR/home_backup_$DATE.tar.gz" "$SRC_DIR"
echo "Backup completed at $BACKUP_DIR/home_backup_$DATE.tar.gz"
