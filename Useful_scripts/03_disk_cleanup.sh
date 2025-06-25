#!/bin/bash
sudo apt autoremove -y
sudo apt autoclean
sudo journalctl --vacuum-time=3d
echo "Disk cleanup complete!"
