# Rice-Utilities
Collection of Java scripts that can be used when developing

## How to use
In order to use these scripts place them in the same directory as the script you are currently developing. If you are compiling to a .class file to run make sure you compile the script containing the function you wish to use as well.

```
javac Utilities.java
```
*Basic things but would've helped me when I started*

## Utilites.java
This is one of the scripts containing some general utilities that can be unrelated

### getClipboard()
```Java
// create the utilities object
Utilities utils = new Utilities();
// get the clipboard
String currentClipboard = utils.getClipboard();
// will output whatever was in the clipboard
System.out.println(currentClipboard);
```

### setClipboard("*string*")
```Java
// create the utilities object
Utilities utils = new Utilities();
// set the users clipboard to whatever you want
String currentClipboard = utils.setClipboard("Hello, World!");
```  
--Rhys--
