@ECHO OFF
REM  If your system complains that it cannot find javac, you
REM  should either update your PATH environment variable to
REM  include the directory that contains the javac executable
REM  or modify the command below to specify the full path name.
REM  For example, C:\jdk1.2.2\bin\javac.exe -classpath ...

javac -classpath .;.\mbsbb.jar;.\mbsgui.jar DynamicPopulation\Fish.java
copy DynamicPopulation\Fish.class .