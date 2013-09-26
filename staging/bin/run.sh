#!/bin/bash

# no class specified here, just setting class path and memory limits
java -cp "../lib/*" -Xms256m -Xmx1024m "$@"
