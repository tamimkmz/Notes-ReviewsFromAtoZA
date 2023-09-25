package ClassOfMix;

/*Write a method header with the following specs:


Returns:

```
a String
```

Name:

```
censorLetter
```

Parameters:

```
a String
```

```
a char
```

Then complete the method by programming the following behavior

```
Replace all instances of given character with a "*" within the given String.
See below examples.
```

Examples:

```
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
```*/
        public class T27R {

    public static void main(String[] args) {
        String input1 = "computer science";
        char letter1 = 'e';

        String input2 = "trick or treat";
        char letter2 = 't';

        String result1 = censorLetter(input1, letter1);
        String result2 = censorLetter(input2, letter2);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static String censorLetter(String s, char letter) {
        StringBuilder censoredString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == letter) {
                censoredString.append('*');
            } else {
                censoredString.append(currentChar);
            }
        }

        return censoredString.toString();
    }
}


















