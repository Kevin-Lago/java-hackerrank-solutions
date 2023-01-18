| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/java.advanced/java_md5)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> |
|:---|:---:|

# Java SHA-256

Cryptographic hash functions are mathematical operations run on digital data; by comparing the computed hash (i.e., the output produced by executing a hashing algorithm) to a known and expected hash value, a person can determine the data's integrity. For example, computing the has of a downloaded file and comparing the result to a previously published hash result can show whether the download has been modified or tampered with. In addition, cryptographic hash functions are extremely collision-resistant; in other words, it should be extremely difficult to produce the same hash output from two different input values using a cryptographic hash function.

Secure Hash Algorithm 2 (SHA-2) is a set of cryptographic hash functions designed by the National Security Agency (NSA). It consists of six identical hashing algorithms (i.e., SHA-256, SHA-512, SHA-224, SHA-384, SHA-512/224, SHA-512/256) with a variable digest size. SHA-256 is a __256__-big (__32__ byte) hashing algorithm which can calculate a has code for an input of up to __264 - 1__ bits. It undergoes __64__ rounds of hashing and calculates a hash code that is a __64__-digit hexadecimal number.

Gien a string, ___s___, print its SHA-256 hash value.

__Input Format__

A single alphanumeric string denoting ___s___.

__Constraints__

- $6 \le |s| \le 20$

- String ___s___ consists of English alphabetic letters (i.e., [___a-zA-Z___]) and/or decimal digits (i.e., [__0-9__]) only.

__Output Format__

Print the SHA-256 encryption value of ___s___ on a new line.

__Sample Input 0__

```
HelloWorld
```

__Sample Output 0__

```
872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4
```

__Sample Input 1__

```
Javarmi123
```

__Sample Output 1__

```
f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678
```

---

<details><summary>Solution</summary>
    
```java

```
</details>