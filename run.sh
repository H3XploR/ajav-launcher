#!/bin/bash

set -e

./compilation.sh
java -cp src simulator.Simulator scenario.txt
