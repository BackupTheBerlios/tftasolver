
A short readme file to 
TFTAC
the Temporal Fault Tree Analysis Compiler

--------------------------------------------
written by Simon Schilling
sjschilling@gmx.net
March 2009
--------------------------------------------

INSTALL
###############

TFTAC is written in Java, thus you will need a Java installation with
Java 1.5 or later. 

Usually, Java will already be installed on your PC, if not just try the following
it will do no harm.
As this depends on your operating system an computer
setup, I will not describe in detail, what you have to do.

I recommend, you try whether tftac and the tools run before screwing with your
PC's Java setup.

As for myself, I use Ubuntu 8.10 on a normal i386 setup.
My Java version is the openjdk-6-jdk.


TFTAC is (in source) provided as a bunch of *.g files and one file called tftac.java. 
Each *.g file is a ANTLR (Version 3) grammar file.

In order to build TFTAC from source and in order to run the tftac.java you will need 
a version of ANTLR (Version 3).
ANTLR can be found at http://www.antlr.org (well, surprise!)

I strongly recommend, that you get ANTLRWorks which is a GUI for ANTLR and simplifies
creating and debugging ANTLR grammars.

ANTLRWorks may be downloaded from http://www.antlr.org/works/index.html.
TFTAC was created with ANTLRWorks Version 1.2.3.

Please get the ANTLRWorks .jar file and put it somewhere on your computer.
Next, link your CLASSPATH variable to this jar.
In my case (Ubuntu 8.10) I put it to /usr/local/lib/antlrworks-1.2.3.jar


OK, now you should have a running version of Java >=1.5 and if you run ANTLRWorks
(e.g. java -jar /usr/local/lib/antlrworks-1.2.3.jar) it should open up.

As a last step you need to copy all the TFTAC files to your computer.






COMPILE TFTAC *.g files with ANTLRWorks
##################################################

You can now open all the *.g files with ANTLRWorks.

Before generating the code, take a look at your settings for where to put output 
files in ANTLRWorks (look at "File->Preferences"). The default will be a directory 
"output" in whatever directory you have the *.g files in.

Change the output directory to NOTHING (i.e. the field should be empty).

Now, generate the code (i.e. the  *.java and *.class files) for all *.g files using 
the "Generate Code" command.

For each *.g file there should now be at least one *.java file together with lots of
*.token and *.class files and other stuff.

Next, you have to compile the tftac.java file to Java executable code (i.e. class files).
For this run
	
	javac tftac.java

which will create a new tftac.class file.






RUN TFTAC with Java
##################################################

In general you can run TFTAC from the command line by typing
	
	java tftac

from the directory, tftac.class is in.
You will have to have set your CLASSPATH variable to the ANTLRWorks .jar file (see above).

TFTAC is pipe-compatible, that is, you may provide input to TFTAC like (this is Linux-syntax!)
	
	echo "A AND B PAND (B AND (C OR D))" | java tftac

(Attention: I do not know how to do this on Windows, though!)

Or you may input stuff after starting TFTAC, e.g.
	
	java tftac
	A AND B PAND (B AND (C OR D)) <PRESS CTRL+D>

Either way, TFTAC will provide you with the result (shorty, hopefully) afterwards.
In the example from above a full output would look like:
	
	------------------------------------------------------------------------------
	| TFTAC the (T)emporal(F)ault(T)ree(A)nalyis(C)ompiler is part of TFTASolver |
	| (C) 2009 sjschilling@gmx.net      ---       <http://tftasolver.berlios.de> |
	| TFTASolver is free software, provided under the GNU General Public License |
	------------------------------------------------------------------------------
	(NOT C AND ((A AND B) PAND D))
	(NOT D AND ((A AND B) PAND C))
	((A AND B) PAND (C SAND D)) 

Please run java tftac --help fora complete overview over all command line options.





CONTACT THE AUTHOR
##################################################
If you encounter bugs or have ideas for improvements (or have them implemented already)
please contact me under

	sjschilling@gmx.net






LICENSE
##################################################
TFTAC comes under the GPL, see LICENSE.txt in main directory (the one with the *.g files in)



Have fun!
[EOF]
