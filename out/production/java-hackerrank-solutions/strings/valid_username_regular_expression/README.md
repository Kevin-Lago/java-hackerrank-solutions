| <img width=1000>[Previous Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/strings/java_regex_2_duplicate_words)</img> | <img width=1000>[Home](https://github.com/Kevin-Lago/java-hackerrank-solutions)</img> | <img width=1000>[Next Question](https://github.com/Kevin-Lago/java-hackerrank-solutions/tree/main/src/strings/tag_content_extractor)</img> |
|:---|:---:|---:|

# Valid Username Regular Expression

You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied.

- The username consists of __8__ to __30__ characters inclusive. If the username consists of less than __8__ or greater than __30__ characters, then it is an invalid username.

- The username can only contain alphanumeric characters and underscores (```_```). Alphanumeric characters describe the character set consisting of lowercase characters [___a - z___], uppercase characters [__A - Z__], and digits [__0 - 9__].

- The first character of the username must be an alphabetic character, i.e., either lowercase characters [__a - z__] or uppercase character [__A - Z__].

For example:

| Username | Validity |
|:--------:|:--------:|
| Julia | INVALID; Username length < 8 Characters |
| Samantha | VALID |
| Samantha_21 | VALID |
| 1Samantha | INVALID; Username begins with non-alphabetic character |
| Samantha?10_2A | INVALID; '?' character not allowed |

Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.

__Input Format__

The first line of input contains an integer ___n___, describing the total number of usernames. Each of the next ___n___ lines contains a string describing the username. The locked stub code reads the input and validates the username.

__Constraints__

- __1 <= _n_ <= 100__

- The username consists of any printable characters.

__Output Format__

For each of the usernames, the locked stub code print ```Valid``` if the username is valid; otherwise ```Invalid``` each on a new line.

__Sample Input 0__

```
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
```

__Sample Output 0__

```
Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
```

__Explanation 0__

Refer diagram in the challege statement

---

<details><summary>Solution</summary>
    
```java

```
</details>
