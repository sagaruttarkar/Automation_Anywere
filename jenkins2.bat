set projectLocation=C:\Users\Sagar\eclipse-workspace\Neeraj
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\jarfiles\*
java org.testng.TestNG %projectLocation%\testng.xml
pause.