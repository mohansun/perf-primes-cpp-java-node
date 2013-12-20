Comparing speed of Primes (Google) for C++, Java and Node

# REF:http://v8-io12.appspot.com/#16

#--- cc compile

g++ -O3 Primes.cc -o Primes; ./Primes

#--- java --- 
javac Primes.java ; java Primes

#--- node ---
node Prime.js

#----------------- CPP beats Java and Node --------------

#---- java ---
Lotus:slides mohan$ time java Primes
287107

real  0m1.737s
user  0m1.699s
sys 0m0.067s

 
#---- cpp ---
Lotus:slides mohan$ time ./Primes
287107

real  0m1.347s
user  0m1.325s
sys 0m0.004s

#--- node ---
Lotus:slides mohan$ time node Primes.js
287107

real  0m18.659s
user  0m18.582s
sys 0m0.115s

#--- OS ---
Lotus:slides mohan$ uname -a
Darwin Lotus 10.8.0 Darwin Kernel Version 10.8.0: Tue Jun  7 16:33:36 PDT 2011; root:xnu-1504.15.3~1/RELEASE_I386 i386

#--- java version ---
Lotus:slides mohan$ java -version
java version "1.6.0_65"
Java(TM) SE Runtime Environment (build 1.6.0_65-b14-462-10M4609)
Java HotSpot(TM) 64-Bit Server VM (build 20.65-b04-462, mixed mode)

#--- node version ---
Lotus:slides mohan$ node --version
v0.10.24

#--- g++ verions ---

Lotus:slides mohan$ g++ --version
i686-apple-darwin10-llvm-g++-4.2 (GCC) 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.1.00)
Copyright (C) 2007 Free Software Foundation, Inc.
This is free software; see the source for copying conditions.  There is NO
warranty; not even for MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

#---end---
#
#
