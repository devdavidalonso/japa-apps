# Challenge 1: Banking Operation Validation

## Description
In the banking sector, simple automated checks help prevent errors in repetitive tasks. This program reads an operation code provided as input and validates whether it matches one of the allowed digital teller operations: `DEPOSITO`, `SAQUE`, or `TRANSFERENCIA`.

The validation is case-sensitive and requires an exact match.

## Requirements
* **Input:** A single line containing a string representing the banking operation code.
* **Output:** Print `VALID` if the string strictly matches `DEPOSITO`, `SAQUE`, or `TRANSFERENCIA`. Otherwise, print `INVALID`.

## Examples

| Input | Output |
| :--- | :--- |
| `DEPOSITO` | `VALID` |
| `SAQUE` | `VALID` |
| `deposito` | `INVALID` |
| `PAGAMENTO` | `INVALID` |

## Technical Details
* Developed in Java.
* Uses `java.util.Scanner` for standard input reading.
* Implements control flow logic via `switch-case` to validate exact String values.
* Includes JUnit 5 unit tests for the supported operations and invalid inputs.

## Running the Tests
Run `mvn test` from this directory.