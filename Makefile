# usage: make all 
# oR
#        make clean

#--------------------------------
Objects = Primes
Primes_cc: Primes.cc
	g++ -O3 Primes.cc -o Primes


#-----------java----------
.SUFFIXES: .java .class 
.java.class:
	javac $<

CLASSES = Primes.class

Primes_java: $(CLASSES)

#-----------make all-
all : Primes_cc Primes_java

#--------------------------------
clean: 
	rm -f $(CLASSES)	
	rm -f $(Objects)


