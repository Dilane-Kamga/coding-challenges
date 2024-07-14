package org.kamtech.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dilane FOGUE KAMGA <dilanekamga777@gmail.com>
 */
public class WCServices {
  private String option;

  public WCServices(String option) {
    this.option = option;
  }

  public void myServices(String filePath) {
    switch (option) {
      case "-c":
        byteCount(filePath);
        break;
      case "-l":
        lineCount(filePath);
        break;
      case "-w":
        wordCount(filePath);
        break;
      case "-m":
        characterCount(filePath);
        break;
      default:
        defaultOption(filePath);
    }
  }

  private void byteCount(String filePath) {
    try {
      Path path = Paths.get(filePath);
      long byteCount = Files.size(path);
      String filename = path.getFileName().toString();
      System.out.println(byteCount + " " + filename);
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }

  private void lineCount(String filePath) {
    try {
      Path path = Paths.get(filePath);
      List<String> lines = Files.readAllLines(path);
      long lineCount = lines.size();
      String filename = path.getFileName().toString();
      System.out.println(lineCount + " " + filename);
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }

  private void wordCount(String filePath) {
    try {
      Path path = Paths.get(filePath);
      List<String> lines = Files.readAllLines(path);
      String filename = path.getFileName().toString();
      long wordCount = lines.stream().flatMap(line -> Arrays.stream(line.split("\\s+"))).count();
      System.out.println(wordCount + " " + filename);
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }

  private void characterCount(String filePath) {
    try {
      Path path = Paths.get(filePath);
      List<String> lines = Files.readAllLines(path);
      String filename = path.getFileName().toString();
      long charCount = lines.stream().mapToLong(String::length).sum();
      System.out.println(charCount + " " + filename);
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }

  private void defaultOption(String filePath) {
    try {
      Path path = Paths.get(filePath);
      List<String> lines = Files.readAllLines(path);
      String filename = path.getFileName().toString();
      long defaultLineCount = lines.size();
      long defaultWordCount =
          lines.stream().flatMap(line -> Arrays.stream(line.split("\\s+"))).count();
      long defaultByteCount = Files.size(path);
      System.out.println(
          defaultLineCount + " " + defaultWordCount + " " + defaultByteCount + " " + filename);
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }
}
