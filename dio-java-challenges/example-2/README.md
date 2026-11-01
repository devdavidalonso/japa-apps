# Challenge 2: Banking Access Code Verification

## Description
This program verifies whether an access code entered by an operator matches the system's expected security code. The verification checks for an exact match, including uppercase letters, lowercase letters, numbers, and symbols.

## Requirements
* **Input:** Two lines of text.
  1. The code entered by the operator (`codigoInformado`).
  2. The code expected by the system (`codigoEsperado`).
* **Output:** Print `ACESSO LIBERADO` if both codes are identical. Otherwise, print `ACESSO NEGADO`.

## Examples

| Input | Output |
| :--- | :--- |
| `AG123`<br>`AG123` | `ACESSO LIBERADO` |
| `AG123`<br>`AG124` | `ACESSO NEGADO` |
| `banco01`<br>`BANCO01` | `ACESSO NEGADO` |
| `#CX9`<br>`#CX9` | `ACESSO LIBERADO` |

## Technical Details
* Developed in Java following Clean Code guidelines (Single Responsibility Principle).
* Encapsulates logic inside a helper method (`isCodeValid`).
* Handles string comparison safely using `String.equals()` with null-safety checks.
* Includes JUnit 5 unit tests for exact, case-sensitive code comparison.

## Running the Tests
Run `mvn test` from this directory.
