#!/bin/bash

# MAINTAINER Matthieu Faure <mfaure@asqatasun.org>

set -o errexit

#############################################
# Usage
#############################################
usage () {
    cat <<EOF

$0 launches a sequence that:
- builds Asqatasun from sources,
- builds a Docker single container
- runs the container

usage: $0 [OPTIONS]

  -s | --source-dir <directory>     MANDATORY Absolute path to Asqatasun sources directory 
  -h | --help                       Show this help

EOF
    exit 2
}

#############################################
# Manage options and usage
#############################################
TEMP=`getopt -o s:h --long source-dir:,help -- "$@"`

if [[ $? != 0 ]] ; then
    echo "Terminating..." >&2 ;
    exit 1 ;
fi

# Note the quotes around `$TEMP': they are essential!
eval set -- "$TEMP"

declare SOURCE_DIR
declare HELP=false

while true; do
  case "$1" in
    -s | --source-dir ) SOURCE_DIR="$2"; shift 2 ;; 
    -h | --help )       HELP=true; shift ;;
    * ) break ;;
  esac
done

if [[ -z "$SOURCE_DIR" || "$HELP" == "true" ]]; then
    usage
fi

#############################################
# Functions
#############################################

fail() {
        echo ""
	echo "FAILURE : $*"
        echo ""
	exit -1
}

#############################################
# Variables
#############################################

TIMESTAMP=$(date +%Y-%m-%d) # format 2015-11-25, cf man date
TGZ_DIR="web-app/asqatasun-web-app/target"
DOCKER_DIR="docker/Docker-build"
TGZ_FILENAME="${TGZ_DIR}/asqatasun-*.tar.gz"

#############################################
# Do the actual job
#############################################

# clean and build
(cd "$SOURCE_DIR" ; mvn clean install) ||
    fail "Error at build"
 
# copy TAR?GZ to docker dir
cp "${SOURCE_DIR}/${TGZ_FILENAME}" "${SOURCE_DIR}/${DOCKER_DIR}/" ||
    fail "Error when copying ${SOURCE_DIR}/${TGZ_FILENAME}"

# build Docker container
(cd "${SOURCE_DIR}/${DOCKER_DIR}" ; \
    docker build -t asqatasun/asqatasun:$TIMESTAMP "${SOURCE_DIR}/${DOCKER_DIR}"

# run container freshly build
# @@@TODO

# functional testing
# @@@TODO 

# destroy container
# @@@TODO

