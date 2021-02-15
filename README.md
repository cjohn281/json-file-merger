# JSON File Merger
Merge multiple json files into a single json file.

## About
This application was build to easily merge multiple, similarly named json files into a single output json file.

## Requirements
In order to run this application, you must have JDK 11, Scala 2.12, or higher, and sbt installed.

## Usage
With your input files stored in this project's root directory,
* Set the PrintWriter output file name, as desired.
* Set the numOfFiles variable to the number of files to be merged.
* In the For Loop, edit the getFromFile method call to match your input file names.
* sbt run from the terminal.