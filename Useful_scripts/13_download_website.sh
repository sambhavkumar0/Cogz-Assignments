#!/bin/bash
read -p "Enter website URL: " url
wget --mirror --convert-links --adjust-extension --page-requisites --no-parent "$url"
echo "Download complete."
