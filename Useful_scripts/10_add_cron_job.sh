#!/bin/bash
CRON_JOB="0 6 * * * /path/to/your/script.sh"
(crontab -l; echo "$CRON_JOB") | crontab -
echo "Cron job added."
