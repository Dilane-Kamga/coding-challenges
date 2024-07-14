# Challenge 01: Unix `wc` Command Clone

## Overview

This challenge involves building a custom version of the Unix command line tool `wc`, which stands for "word count." Our version will be called `ccwc` (Coding Challenges Word Count). This tool will allow you to count bytes, lines, words, and characters in a text file, following the Unix philosophy of creating small, single-purpose tools that can be combined together.
Find more information about this challenge here : https://codingchallenges.fyi/challenges/challenge-wc

## Requirements

- Java Development Kit (JDK) installed (I used Java 17)
- Maven (I used it, but it is optional)
- An IDE or text editor of your choice
- Basic understanding of Java programming


## Getting Started

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/Dilane-Kamga/coding-challenges.git
    cd coding-challenges/challenges/challenge-01-BuildYourOwn-wc-Tool
    ```

2. **The Test File**:
   You can see the `test.txt` in the `resources` directory.

3. **Compile and Run**:
    ```bash
    mvn clean install
    cd target/classes
    java java org.kamtech.Main "C:\Users\Dilane F\Desktop\Coding Challenges\coding-challenges\challenges\challenge-01-BuildYourOwn-wc-Tool\src\main\resources\test.txt" (I used an absoulte path and add quotes since my path has some spaces)
    ```

## Features

### Step One: Byte Count (`-c`)

Counts the number of bytes in a file.

```bash
java org.kamtech.Main -c "C:\Users\Dilane F\Desktop\Coding Challenges\coding-challenges\challenges\challenge-01-BuildYourOwn-wc-Tool\src\main\resources\test.txt" (replace with your own path(I prefer absolute path))
# Output: 342190 test.txt
```

### Step Two: Line Count (`-l`)

Counts the number of lines in a file.

```bash
java org.kamtech.Main -l "C:\Users\Dilane F\Desktop\Coding Challenges\coding-challenges\challenges\challenge-01-BuildYourOwn-wc-Tool\src\main\resources\test.txt" (replace with your own path(I prefer absolute path))
# Output: 7145 test.txt
```

### Step Three: Word Count (`-w`)

Counts the number of words in a file.

```bash
java org.kamtech.Main -w "C:\Users\Dilane F\Desktop\Coding Challenges\coding-challenges\challenges\challenge-01-BuildYourOwn-wc-Tool\src\main\resources\test.txt" (replace with your own path(I prefer absolute path))
# Output: 59931 test.txt
```

### Step Four: Character Count (`-m`)

Counts the number of characters in a file. This is locale-dependent and may differ from the byte count.

```bash
java org.kamtech.Main -m "C:\Users\Dilane F\Desktop\Coding Challenges\coding-challenges\challenges\challenge-01-BuildYourOwn-wc-Tool\src\main\resources\test.txt" (replace with your own path(I prefer absolute path))
# Output: 325002 test.txt
```

### Step Five: Default Option (No Options)

Outputs the number of lines, words, and bytes in a file.

```bash
java org.kamtech.Main "C:\Users\Dilane F\Desktop\Coding Challenges\coding-challenges\challenges\challenge-01-BuildYourOwn-wc-Tool\src\main\resources\test.txt" (replace with your own path(I prefer absolute path))
# Output: 7145 59931 342190 test.txt
```


## How to Run Tests

If you want to test the application using different text files, simply replace `test.txt` with your desired file name in the commands above.

## Conclusion

Congratulations on completing the first coding challenge! You've built a versatile command line tool that follows the Unix philosophy, allowing you to process text files efficiently. Keep practicing and expanding your skills with more challenges.

## License

This project is licensed under the MIT License. See the [LICENSE](../LICENSE) file for details.

## Acknowledgments

Inspired by John Crickett, Unix's powerful and minimalist command line tools and the book *The Art of Unix Programming*.
