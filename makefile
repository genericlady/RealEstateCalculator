JAVAC = javac
JVM = java
JAVADOC = javadoc
MKBIN = mkdir -p bin

JAVAC_FLAGS = -g -d 'bin/'
JAVAC_CP = -cp

MAINSRC = src/main/org/
TESTSRC = src/test/org/
LIB = 'src/test/lib/*:src/main/org'

PKGSRC = realestatecalculator/
TARGET = bin

MAIN = RealEstateCalculator.Main

MAINTEST = RealEstateCalculatorTest.class

.SUFFIXES : .class .java

all:
		$(MKBIN)
		$(JAVAC) $(JAVAC_FLAGS) $(MAINSRC)$(PKGSRC)*

test:
		$(JAVAC) $(JAVAC_FLAGS) $(JAVAC_CP) $(LIB) $(TESTSRC)$(PKGSRC)*

clean:
		rm -rf $(TARGET)

run:
		$(JVM) $(JAVAC_CP) $(TARGET) $(MAIN)

run_test:
		$(JVM) $(JAVAC_CP) $(TARGET) $(MAINTEST)

.PHONY: all test clean run run_test
