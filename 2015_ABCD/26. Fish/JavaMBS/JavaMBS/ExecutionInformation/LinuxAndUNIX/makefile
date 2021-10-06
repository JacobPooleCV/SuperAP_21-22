# To use this makefile, you need a make command on your system.
#    make         Compiles all the Java source files that need it
#    make MBSGUI  Compiles necessary source files and runs full GUI version
#    make SimpleMBSDemo1  Compiles necessary source files and runs first demo
#    make SimpleMBSDemo2  Compiles necessary source files and runs second demo
#
# To compile with the Fish class in the DynamicPopulation directory
# rather than the one in the Code directory, find the two definitions
# of FISHSOURCE below.  Switch which one is commented out.  Then
# remove Fish.class from the Code directory and run make. 

COMMONCLASSES=	BoundedEnv.class \
		DarterFish.class \
		Environment.class \
		Fish.class \
		Simulation.class \
		SlowFish.class \
		UnboundedEnv.class

ALLCLASSES=	$(COMMONCLASSES) \
		MBSGUI.class \
		SimpleMBSDemo1.class \
		SimpleMBSDemo2.class

PRODUCTS:	$(ALLCLASSES)

FISHSOURCE=	Fish.java
#FISHSOURCE=	DynamicPopulation/Fish.java

COMPILE=	javac -classpath .:./mbsbb.jar:./mbsgui.jar

RUN=		java -classpath .:./mbsbb.jar:./mbsgui.jar

BoundedEnv.class:	Environment.class \
			BoundedEnv.java
			$(COMPILE) BoundedEnv.java

DarterFish.class:	Fish.class \
			DarterFish.java
			$(COMPILE) DarterFish.java

Environment.class:	Environment.java
			$(COMPILE) Environment.java

Fish.class:		$(FISHSOURCE)
			$(COMPILE) -d . $(FISHSOURCE)

MBSGUI.class:		MBSGUI.java
			$(COMPILE) MBSGUI.java

SimpleMBSDemo1.class:	SimpleMBSDemo1.java
			$(COMPILE) SimpleMBSDemo1.java

SimpleMBSDemo2.class:	SimpleMBSDemo2.java
			$(COMPILE) SimpleMBSDemo2.java

Simulation.class:	Simulation.java
			$(COMPILE) Simulation.java

SlowFish.class:		Fish.class \
			SlowFish.java
			$(COMPILE) SlowFish.java

UnboundedEnv.class:	Environment.class \
			UnboundedEnv.java
			$(COMPILE) UnboundedEnv.java

MBSGUI:		$(COMMONCLASSES) \
		MBSGUI.class \
		mbsbb.jar \
		mbsgui.jar
		$(RUN) MBSGUI

SimpleMBSDemo1:		$(COMMONCLASSES) \
			SimpleMBSDemo1.class \
			mbsbb.jar \
			mbsgui.jar
			$(RUN) SimpleMBSDemo1

SimpleMBSDemo2:		$(COMMONCLASSES) \
			SimpleMBSDemo2.class \
			mbsbb.jar \
			mbsgui.jar
			$(RUN) SimpleMBSDemo2
