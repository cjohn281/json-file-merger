import java.io.{File, PrintWriter}
import java.nio.charset.{Charset, StandardCharsets}
import scala.io.BufferedSource


/** This program is used to merge multiple json files (or jsonl files) into a single json file.
 * It assumes that each of the files to be merged are similarly named, but with an incrementing
 * number (e.g. tweets1.json, tweets2.json, tweets3.json, etc.)
 * 
 * @author Chris Johnson
 */
object Main {
  def main(args: Array[String]) = {
    val pw = new PrintWriter(new File("01-31-21-twitter_data.json"));  // PrintWriter writes new output json file

    val numOfFiles = 8        // The number of files to be merged.

    for (i <- 1 to numOfFiles) {
      println(s"Starting file $i...")
      getFromFile(s"tweets$i.json", pw)     // For each file, call the getFromFile method. This will need to be edited to match your file names.
      println(s"Finishing file $i...")
    }

    pw.close()        // Close the output file after writing.
  }

  def getFromFile(path: String, pw: PrintWriter): Unit = {
    val inFile = io.Source.fromFile(path, StandardCharsets.UTF_16.name())   // Reads in a file.

    for (line <- inFile.getLines) {
      pw.write(line + "\n")           // For each line of the file, write the line to the output file.
    }
    inFile.close()                    // Close the file.
  }
}