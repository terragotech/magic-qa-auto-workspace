Install Java
https://java.com/en/download/

Install Java SE Development Kit
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Installer Eclipse
http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/oxygenr

Download Seleniumn Java Client (Selenium Client & WebDriver Language Bindings)
http://www.seleniumhq.org/download/
copy to <project>\3rdParty\*.jar and <project>\3rdParty\<client version>\*.jar

Download geckodriver (needed to run the tests - add to system path)
https://github.com/mozilla/geckodriver/releases
copy to <project>\3rdParty\<geodriver version>\*.exe
add the path to the System Path to locate the .exe

Browser
Install Firefox Selenium IDE plugin (within FireFox)

Create new project within Eclipse
Add resources to project:
- right click project and select Properties
- in Java Build Path, click Libraries tab and Add External JARs
- add java client: <project>\3rdParty\<client version>\*.jar and <project>\3rdParty\<client version>\lib\*.jar
- Apply

To record with Firefox Selenium IDE plugin as JUnit and add to the project:
- open firefox
- open selenium IDE plugin (Alt - Tools - Selenium IDE or Ctrl+Alt+S
- record
- export test case to notepad:
-- In Selenium IDE Plugin - File -> Export Test Case As -> Java / JUnit 4 / WebDriver
-- provide filename
-- locate filename and open the file as text
-- copy content
- add test case from notepad to Eclipse:
-- in Eclipse, right click package and select New -> JUnit Test Case
-- paste content 
-- update package name
-- verify unit test name
- Save All
- check warnings and remove unused methods

for Each test:
Project package name must match package name
package framework;

Test name must match unit test name:
public class firstTestCase {}

To run unit test:
- right click test case
- select Run As JUnit

To run entire suite:
TBD