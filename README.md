Prof. Brian Mitchell
CS575 Final Project
Georgi Simeonov


Git Repo:  https://github.com/sp1ng/CS575_software_design.git
Youtube: https://youtu.be/9toSu1bYKV0 

Setup (Linux/Windows – not tried on Mac)

1. Install Typesafe Activator(Activator, Scala, Play 2 )
https://www.typesafe.com/activator/download

Put activator executable in the PATH variables

2. Install MongoDB
https://www.mongodb.org/downloads#production
a. mkdir c:\test\mongodb\db 
b. C:\mongodb\bin\mongod.exe --dbpath c:\test\mongodb\db 
(Linux is the same: mongod –dbpath /tmp

3. Git clone
git clone https://github.com/sp1ng/CS575_software_design.git project  
or
IntelliJ New> Project from version control> Git> paste the URL: https://github.com/sp1ng/CS575_software_design.git 

4. Compile
>cd project 
>activator compile
(it should take 5-10min)
Project loading failed: Retry
Second time is the charm


5. Run
>activator run
or better for loading while making changes
>activator "~run"

http://localhost:9000

6. IntelliJ
New> Project from existing source>Go to the proper path> Import from external model> SBT.
Next
Finish



7. Youtube link
https://youtu.be/9toSu1bYKV0 


Architecture Description

User View











The user is able to query the database, add new records, modify existing records, and delete records.


High Level View




















Technical View
URL Entered – is translated by the routes file, which points to Scala Play framework
Action (it extend the Controller). The action itself call an html file 
Index.scala.html (this is an html file that is integrated into the Play framework). 
The html is using JavaScript files, which have been compiled in JavaScript by Coffee script. The JavaScript file use the Angular and BootStrap framework. Angular deals with managing input variables and Bootstrap has css templates that improve the look of the page. 
The JavaScript files direct the traffic through URL address that gets translated by routes and get picked up Scala Controller again. 





























Build View 

Activator – compile, run and manage dependencies with SBT
SBT – downloads all the depencies/plugins that are specified in build.sbt. It actually uses ivy to manage the downloads
ivy2 – used as a dependency manager similar to maven


Information used:
Play Framework Cookbook Second Edition
Activator template – modern web template
