| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/bignumber/java_bigdecimal)</img> |
|:---|:---:|---:|

# Tag Content Extractor

In a tag-based language like XML or HTML, contents are enlosed between a start tag and an end tag like ```<tag>contents</tag>```. Note that the corresponding end tag starts with a ```/```.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

1. The name of the start and end tags must be the same. The HTML code ```<h1>Hello World</h2>``` is not valid, because the text starts with an ```h1``` tag and ends with a non-matching ```h2``` tag.

2. Tags can be nested, but content between nested tags is considered not valid. For example, in ```<h1><a>contents</a>invalid</h2>```, ```contents``` is valid but ```invalid``` is not valid.

3. Tags can consist of any printable characters.

__Input Format__

The first line of input contains a single integer, ___n___ (the number of lines).

The ___n___ subsequent lines each contain a line of text.

__Constraints__

- __1 <= ___n___ <= 100__

- Each line contains maximum of __10<sup>4</sup>__ printable characters.

- The total number of characters in all test cases will not exceed __10<sup>6</sup>__.

__Output Format__

For each line, print the content enclosed within valid tags.

If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print ```None```.

__Sample Input__

```
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
```

__Sample Output__

```
Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
```

---

<details><summary>Solution</summary>
    
```java

```
</details>