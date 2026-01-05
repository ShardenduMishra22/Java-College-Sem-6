#!/bin/bash

# Script to run all Java files from chapters 1 to 6
# Base directory for Java source files
BASE_DIR="/home/mishrashardendu22/Coding_Stuff_Fedora/College/0636920034452/src/main/java"

# Colors for better output visibility
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

echo "========================================"
echo "Running all Java files from Ch1 to Ch6"
echo "========================================"
echo ""

# Function to run a single Java file
run_java_file() {
    local chapter=$1
    local file=$2
    local class_name=$(basename "$file" .java)
    
    echo -e "${BLUE}========================================${NC}"
    echo -e "${YELLOW}Chapter $chapter: $class_name${NC}"
    echo -e "${BLUE}========================================${NC}"
    
    # Navigate to the base directory (parent of all packages)
    cd "$BASE_DIR"
    
    # Compile the Java file with all dependencies in the chapter
    javac "$chapter"/*.java 2>/dev/null
    
    # Run the compiled class with package name
    echo -e "${GREEN}Output:${NC}"
    java "$chapter.$class_name" 2>&1
    
    if [ $? -ne 0 ]; then
        echo -e "${YELLOW}(No main method or runtime error)${NC}"
    fi
    echo ""
}

# Run all files from each chapter
for chapter in ch1 ch2 ch3 ch4 ch5 ch6; do
    chapter_path="$BASE_DIR/$chapter"
    
    if [ -d "$chapter_path" ]; then
        echo ""
        echo -e "${GREEN}╔════════════════════════════════════════╗${NC}"
        echo -e "${GREEN}║  Processing $chapter                      ║${NC}"
        echo -e "${GREEN}╔════════════════════════════════════════╗${NC}"
        echo ""
        
        # Find all .java files in the chapter directory
        for java_file in "$chapter_path"/*.java; do
            if [ -f "$java_file" ]; then
                run_java_file "$chapter" "$java_file"
            fi
        done
    else
        echo -e "${RED}Directory $chapter not found!${NC}"
    fi
done

echo ""
echo -e "${GREEN}========================================"
echo "All chapters processed!"
echo -e "========================================${NC}"
