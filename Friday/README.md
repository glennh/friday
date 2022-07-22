The project was created using Intellij Community Edition and SDK 11 Oracle OpenJDK version 11.0.13
and language level SDK default (11 - Local variable syntax for lamba parameters).

Run /src/main/javacom.glennh/App.java main to run the code.

Using InStream.iterate caused Intellij to add / update the maven-compiler-plugin dependency in the pom, it wants version
9 but is failing to find the dependency.  I did not fix this within the time.

When run the code outputs:

"C:\Program Files\Java\jdk-11.0.13\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=59917:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath C:\dev\friday\Friday\target\classes com.glennh.App
multiplesOfAUntilX for a=2 and x=3
0
2

multiplesOfAUntilXLambaStyle for a=2 and x=3
0
2

multiplesOfAPlus1Until2X for a=2 and x=3
0
3
6

multiplesOfAUntilXLambaStyle for a=2 and x=3
0
3
6

multiplesOfAPlus2Until3X for a=2 and x=3
0
4
8

multiplesOfAPlus2Until3XLambdaStyle for a=2 and x=3
0
4
8


Process finished with exit code 0
