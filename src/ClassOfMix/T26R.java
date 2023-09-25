package ClassOfMix;

/*Write a method header on line two with the following specs:

Returns:

```
a String
```

Name:

```
spaceOut
```

Parameters:

```
a String
```

Then complete the method by programming the following behavior

```
Insert spaces after every character in the String s, then return the new string.
```

```
See below examples (note the space at the end as well).
```

Examples:

```
spaceOut("hello") ==> "h e l l o "
spaceOut("technology") ==> "t e c h n o l o g y "
```*/
        public class T26R {
    public static void main(String[] args) {
       String s1=("hello");
       String s2=("technology");

       String result1=spaceOut(s1);
       String result2=spaceOut(s2);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static String spaceOut(String s) {
        StringBuilder spaceString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            spaceString.append(s.charAt(i));
            spaceString.append(' ');
        }
        return spaceString.toString();
    }
    }

















