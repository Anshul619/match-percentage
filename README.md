# Match Percentage Definition

Let us define "match percentage" as what percentage of an object matches with another object of the same type.

e.g. Consider 2 strings:
- string 1 = "This is a cat"
- string 2 = "This is a brown cat"

Match percentage of string 1 with respect to string 2 is `100%` as all words in string 1 are present in string 2.
Match percentage of string 2 with respect to string 1 is `80%` as only 4 out of 5 words in string 2 are present in string 1.

# Problem statement

- Given 2 Lists, write a program to compare and report the match percentage between the 2 objects.
- Your program must contain a public method called calculateMatch(List<String> A, List<String> B) which will be called by the tester function.

  `calculateMatch` calculates the match percentage of the 2 lists.

The method returns the output as below:
- If all items of listA and listB are same, output is "100% match"
- If all items of listA are present in listB, output is "B contains A"
- Similarly, if all items of listB are present in listA, output is "A contains B"

In all other cases, return match percentage of A with respect to B
- A or B or both can be empty lists
- A or B will never be null (don't worry about NPE 😁)

# Input and expected Outputs
  
## Case 1:
A = ["CAT", "RAT", "BAT"]
B = ["BAT", "RAT", "CAT"]
  
output = "100% match"

## Case 2:
A = ["CAT", "RAT", "BAT", "MAT"]
B = ["BAT", "RAT", "CAT"]

  output = "A contains B"

## Case 3:
A = ["MAT", "RAT", "SAT", "CAT"]
B = ["BAT", "RAT", "CAT"]

  output = "50% match" 
  explanation = Only 2 ("RAT", "CAT") out of 4 items in A are present in B
