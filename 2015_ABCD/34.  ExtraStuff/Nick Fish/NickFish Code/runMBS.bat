@ECHO OFF
REM  If your system complains that it cannot find java, you
REM  should either update your PATH environment variable to
REM  include the directory that contains the java executable
REM  or modify the command below to specify the full path name.
REM  For example, C:\jdk1.2.2\bin\java.exe -classpath ...

if "%1"=="" goto runGUI
java -classpath .;.\mbsbb.jar;.\mbsgui.jar %1
goto end

:runGUI
java -classpath .;.\mbsbb.jar;.\mbsgui.jar MBSGUI

:end